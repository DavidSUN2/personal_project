
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.reflect;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.reflect.testbed.Foo;
import org.apache.commons.lang3.reflect.testbed.GenericParent;
import org.apache.commons.lang3.reflect.testbed.GenericTypeHolder;
import org.apache.commons.lang3.reflect.testbed.StringParameterizedChild;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test TypeUtils
 * @version $Id$
 */
@SuppressWarnings({ "unchecked", "unused" , "rawtypes", "null"})
//raw types, where used, are used purposely
public class TypeUtilsTest<B> {

    @Test
    public void TypeUtils() throws SecurityException,
            NoSuchFieldException, NoSuchMethodException {
        final ParameterizedType iterableType = (ParameterizedType) getClass().getField("iterable")
                .getGenericType();
        final Map<TypeVariable<?>, Type> typeVarAssigns = TypeUtils.determineTypeArguments(TreeSet.class,
                iterableType);
        final TypeVariable<?> treeSetTypeVar = TreeSet.class.getTypeParameters()[0];
        Assert.assertTrue(typeVarAssigns.containsKey(treeSetTypeVar));
        Assert.assertEquals(iterableType.getActualTypeArguments()[0], typeVarAssigns
                .get(treeSetTypeVar));
    }

    @Test
    public void TypeUtils() throws SecurityException, NoSuchFieldException {
        final Type stringParentFieldType = GenericTypeHolder.class.getDeclaredField("stringParent")
                .getGenericType();
        final Type integerParentFieldType = GenericTypeHolder.class.getDeclaredField("integerParent")
                .getGenericType();
        final Type foosFieldType = GenericTypeHolder.class.getDeclaredField("foos").getGenericType();
        final Type genericParentT = GenericParent.class.getTypeParameters()[0];
        Assert.assertEquals(GenericParent.class, TypeUtils.getRawType(stringParentFieldType, null));
        Assert
                .assertEquals(GenericParent.class, TypeUtils.getRawType(integerParentFieldType,
                        null));
        Assert.assertEquals(List.class, TypeUtils.getRawType(foosFieldType, null));
        Assert.assertEquals(String.class, TypeUtils.getRawType(genericParentT,
                StringParameterizedChild.class));
        Assert.assertEquals(String.class, TypeUtils.getRawType(genericParentT,
                stringParentFieldType));
        Assert.assertEquals(Foo.class, TypeUtils.getRawType(Iterable.class.getTypeParameters()[0],
                foosFieldType));
        Assert.assertEquals(Foo.class, TypeUtils.getRawType(List.class.getTypeParameters()[0],
                foosFieldType));
        Assert.assertNull(TypeUtils.getRawType(genericParentT, GenericParent.class));
        Assert.assertEquals(GenericParent[].class, TypeUtils.getRawType(GenericTypeHolder.class
                .getDeclaredField("barParents").getGenericType(), null));
    }

    @Test
    public void TypeUtils() {
        Assert.assertTrue(TypeUtils.isArrayType(boolean[].class));
        Assert.assertTrue(TypeUtils.isArrayType(byte[].class));
        Assert.assertTrue(TypeUtils.isArrayType(short[].class));
        Assert.assertTrue(TypeUtils.isArrayType(int[].class));
        Assert.assertTrue(TypeUtils.isArrayType(char[].class));
        Assert.assertTrue(TypeUtils.isArrayType(long[].class));
        Assert.assertTrue(TypeUtils.isArrayType(float[].class));
        Assert.assertTrue(TypeUtils.isArrayType(double[].class));
        Assert.assertTrue(TypeUtils.isArrayType(Object[].class));
        Assert.assertTrue(TypeUtils.isArrayType(String[].class));

        Assert.assertFalse(TypeUtils.isArrayType(boolean.class));
        Assert.assertFalse(TypeUtils.isArrayType(byte.class));
        Assert.assertFalse(TypeUtils.isArrayType(short.class));
        Assert.assertFalse(TypeUtils.isArrayType(int.class));
        Assert.assertFalse(TypeUtils.isArrayType(char.class));
        Assert.assertFalse(TypeUtils.isArrayType(long.class));
        Assert.assertFalse(TypeUtils.isArrayType(float.class));
        Assert.assertFalse(TypeUtils.isArrayType(double.class));
        Assert.assertFalse(TypeUtils.isArrayType(Object.class));
        Assert.assertFalse(TypeUtils.isArrayType(String.class));
    }

    @Test
    public void TypeUtils() throws Exception {
        final Method method = getClass().getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);

        final Type[] types = method.getGenericParameterTypes();

        Assert.assertFalse(TypeUtils.isArrayType(types[0]));
        Assert.assertFalse(TypeUtils.isArrayType(types[1]));
        Assert.assertFalse(TypeUtils.isArrayType(types[2]));
        Assert.assertFalse(TypeUtils.isArrayType(types[3]));
        Assert.assertFalse(TypeUtils.isArrayType(types[4]));
        Assert.assertFalse(TypeUtils.isArrayType(types[5]));
        Assert.assertFalse(TypeUtils.isArrayType(types[6]));
        Assert.assertTrue(TypeUtils.isArrayType(types[7]));
        Assert.assertTrue(TypeUtils.isArrayType(types[8]));
        Assert.assertTrue(TypeUtils.isArrayType(types[9]));
        Assert.assertTrue(TypeUtils.isArrayType(types[10]));
        Assert.assertTrue(TypeUtils.isArrayType(types[11]));
        Assert.assertTrue(TypeUtils.isArrayType(types[12]));
        Assert.assertTrue(TypeUtils.isArrayType(types[13]));
    }

    @Test
    public void TypeUtils() throws Exception {
        Assert.assertEquals(boolean.class, TypeUtils.getArrayComponentType(boolean[].class));
        Assert.assertEquals(byte.class, TypeUtils.getArrayComponentType(byte[].class));
        Assert.assertEquals(short.class, TypeUtils.getArrayComponentType(short[].class));
        Assert.assertEquals(int.class, TypeUtils.getArrayComponentType(int[].class));
        Assert.assertEquals(char.class, TypeUtils.getArrayComponentType(char[].class));
        Assert.assertEquals(long.class, TypeUtils.getArrayComponentType(long[].class));
        Assert.assertEquals(float.class, TypeUtils.getArrayComponentType(float[].class));
        Assert.assertEquals(double.class, TypeUtils.getArrayComponentType(double[].class));

        Assert.assertNull(TypeUtils.getArrayComponentType(boolean.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(byte.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(short.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(int.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(char.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(long.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(float.class));
        Assert.assertNull(TypeUtils.getArrayComponentType(double.class));
    }

    @Test
    public void TypeUtils() throws Exception {
        final Method method = getClass().getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);

        final Type[] types = method.getGenericParameterTypes();

        Assert.assertNull(TypeUtils.getArrayComponentType(types[0]));
        Assert.assertNull(TypeUtils.getArrayComponentType(types[1]));
        Assert.assertNull(TypeUtils.getArrayComponentType(types[2]));
        Assert.assertNull(TypeUtils.getArrayComponentType(types[3]));
        Assert.assertNull(TypeUtils.getArrayComponentType(types[4]));
        Assert.assertNull(TypeUtils.getArrayComponentType(types[5]));
        Assert.assertNull(TypeUtils.getArrayComponentType(types[6]));
        Assert.assertEquals(types[0], TypeUtils.getArrayComponentType(types[7]));
        Assert.assertEquals(types[1], TypeUtils.getArrayComponentType(types[8]));
        Assert.assertEquals(types[2], TypeUtils.getArrayComponentType(types[9]));
        Assert.assertEquals(types[3], TypeUtils.getArrayComponentType(types[10]));
        Assert.assertEquals(types[4], TypeUtils.getArrayComponentType(types[11]));
        Assert.assertEquals(types[5], TypeUtils.getArrayComponentType(types[12]));
        Assert.assertEquals(types[6], TypeUtils.getArrayComponentType(types[13]));
    }

    @Test
    public void TypeUtils() throws Exception {
        final Type[] typeArray = {String.class, String.class};
        final Type[] expectedArray = {String.class};
        Assert.assertArrayEquals(expectedArray, TypeUtils.normalizeUpperBounds(typeArray));
    }
}
