
package FastDateFormat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FastDateFormat0 {

    public static boolean debug = false;

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test01");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test02");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test03");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test05");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = fastDateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test06");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (short) -1, timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test07");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.util.Calendar calendar3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(calendar3, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test08");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) '4', stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test09");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = fastDateFormat2.format((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test10");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test11");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) -1, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test12");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test13");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.LONG;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test15");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test16");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test17");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fastDateFormat2.parseObject("FastDateFormat[h:mm:ss a z,en_US,America/Denver]", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test18");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) -1, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test19");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format((java.lang.Object) (byte) 0, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test20");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = fastDateFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test21");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 100, timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test22");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test23");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat2.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test24");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.util.Date date7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat2.format(date7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test25");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) ' ', timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test26");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.FULL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test27");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = fastDateFormat2.parse("FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"FastDateFormat[h:mm:ss a z,en_US,America/Denver]\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test28");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test29");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fastDateFormat2.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test30");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test31");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = fastDateFormat2.formatToCharacterIterator((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test32");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getInstance("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test33");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test34");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.String str4 = fastDateFormat2.getPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4.equals("h:mm:ss a z"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test35");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat2.parseObject("h:mm:ss a z", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test36");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone3);
        boolean boolean6 = fastDateFormat4.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((-1), 0, timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test37");
        int int0 = org.apache.commons.lang3.time.FastDateFormat.SHORT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test38");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test39");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test40");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(17, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test41");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone3);
        boolean boolean6 = fastDateFormat4.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 10, (int) (byte) -1, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test42");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.Object obj6 = null;
        boolean boolean7 = fastDateFormat2.equals(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test43");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = fastDateFormat2.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test44");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '4', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test45");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = fastDateFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\" does not match (\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q:\\E(\\p{IsNd}++)\\Q \\E(\\QAM\\E|\\QPM\\E|\\Qa\\E|\\Qp\\E)\\Q \\E(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|\\QACDT\\E|\\QAcre Time\\E|\\QACST\\E|\\QACT\\E|\\QACWST\\E|\\QADT\\E|\\QAEDT\\E|\\QAEST\\E|\\QAfghanistan Time\\E|\\QAFT\\E|\\QAKDT\\E|\\QAKST\\E|\\QAlaska Daylight Time\\E|\\QAlaska Standard Time\\E|\\QAlma-Ata Time\\E|\\QALMT\\E|\\QAmazon Summer Time\\E|\\QAmazon Time\\E|\\QAMST\\E|\\QAMT\\E|\\QAnadyr Time\\E|\\QANAT\\E|\\QAqtau Time\\E|\\QAqtobe Time\\E|\\QAQTT\\E|\\QArabia Standard Time\\E|\\QArgentine Time\\E|\\QArmenia Time\\E|\\QART\\E|\\QAST\\E|\\QAtlantic Daylight Time\\E|\\QAtlantic Standard Time\\E|\\QAustralian Central Daylight Time (South Australia)\\E|\\QAustralian Central Daylight Time (South Australia/New South Wales)\\E|\\QAustralian Central Standard Time (Northern Territory)\\E|\\QAustralian Central Standard Time (South Australia)\\E|\\QAustralian Central Standard Time (South Australia/New South Wales)\\E|\\QAustralian Central Western Standard Time\\E|\\QAustralian Eastern Daylight Time (New South Wales)\\E|\\QAustralian Eastern Daylight Time (Tasmania)\\E|\\QAustralian Eastern Daylight Time (Victoria)\\E|\\QAustralian Eastern Standard Time (New South Wales)\\E|\\QAustralian Eastern Standard Time (Queensland)\\E|\\QAustralian Eastern Standard Time (Tasmania)\\E|\\QAustralian Eastern Standard Time (Victoria)\\E|\\QAustralian Western Standard Time\\E|\\QAWST\\E|\\QAzerbaijan Time\\E|\\QAzores Summer Time\\E|\\QAzores Time\\E|\\QAZOST\\E|\\QAZOT\\E|\\QAZT\\E|\\QBangladesh Time\\E|\\QBDT\\E|\\QBhutan Time\\E|\\QBNT\\E|\\QBolivia Time\\E|\\QBOT\\E|\\QBougainville Standard Time\\E|\\QBrasilia Summer Time\\E|\\QBrasilia Time\\E|\\QBritish Summer Time\\E|\\QBRST\\E|\\QBRT\\E|\\QBrunei Time\\E|\\QBST\\E|\\QBTT\\E|\\QCape Verde Time\\E|\\QCAT\\E|\\QCCT\\E|\\QCDT\\E|\\QCentral African Time\\E|\\QCentral Daylight Time\\E|\\QCentral European Summer Time\\E|\\QCentral European Time\\E|\\QCentral Indonesia Time\\E|\\QCentral Standard Time\\E|\\QCEST\\E|\\QCET\\E|\\QCHADT\\E|\\QChamorro Standard Time\\E|\\QCHAST\\E|\\QChatham Daylight Time\\E|\\QChatham Standard Time\\E|\\QChile Summer Time\\E|\\QChile Time\\E|\\QChina Standard Time\\E|\\QChoibalsan Time\\E|\\QCHOT\\E|\\QChristmas Island Time\\E|\\QChST\\E|\\QCHUT\\E|\\QChuuk Time\\E|\\QCKT\\E|\\QCLST\\E|\\QCLT\\E|\\QCocos Islands Time\\E|\\QColombia Time\\E|\\QCook Is. Time\\E|\\QCoordinated Universal Time\\E|\\QCOT\\E|\\QCST\\E|\\QCuba Daylight Time\\E|\\QCuba Standard Time\\E|\\QCVT\\E|\\QCXT\\E|\\QDavis Time\\E|\\QDAVT\\E|\\QDDUT\\E|\\QDumont-d'Urville Time\\E|\\QEASST\\E|\\QEAST\\E|\\QEast Indonesia Time\\E|\\QEaster Is. Summer Time\\E|\\QEaster Is. Time\\E|\\QEastern African Time\\E|\\QEastern Daylight Time\\E|\\QEastern European Summer Time\\E|\\QEastern European Time\\E|\\QEastern Greenland Summer Time\\E|\\QEastern Greenland Time\\E|\\QEastern Standard Time\\E|\\QEAT\\E|\\QECT\\E|\\QEcuador Time\\E|\\QEDT\\E|\\QEEST\\E|\\QEET\\E|\\QEGST\\E|\\QEGT\\E|\\QEST\\E|\\QFalkland Is. Time\\E|\\QFernando de Noronha Time\\E|\\QFiji Summer Time\\E|\\QFiji Time\\E|\\QFJST\\E|\\QFJT\\E|\\QFKT\\E|\\QFNT\\E|\\QFrench Guiana Time\\E|\\QFrench Southern & Antarctic Lands Time\\E|\\QGalapagos Time\\E|\\QGALT\\E|\\QGambier Time\\E|\\QGAMT\\E|\\QGeorgia Time\\E|\\QGET\\E|\\QGFT\\E|\\QGhana Mean Time\\E|\\QGilbert Is. Time\\E|\\QGILT\\E|\\QGMT\\E|\\QGMT+01:00\\E|\\QGMT+02:00\\E|\\QGMT+03:00\\E|\\QGMT+04:00\\E|\\QGMT+05:00\\E|\\QGMT+06:00\\E|\\QGMT+07:00\\E|\\QGMT+08:00\\E|\\QGMT+09:00\\E|\\QGMT+10:00\\E|\\QGMT+11:00\\E|\\QGMT+12:00\\E|\\QGMT+13:00\\E|\\QGMT+14:00\\E|\\QGMT-01:00\\E|\\QGMT-02:00\\E|\\QGMT-03:00\\E|\\QGMT-04:00\\E|\\QGMT-05:00\\E|\\QGMT-06:00\\E|\\QGMT-07:00\\E|\\QGMT-08:00\\E|\\QGMT-09:00\\E|\\QGMT-10:00\\E|\\QGMT-11:00\\E|\\QGMT-12:00\\E|\\QGreenwich Mean Time\\E|\\QGST\\E|\\QGulf Standard Time\\E|\\QGuyana Time\\E|\\QGYT\\E|\\QHawaii Daylight Time\\E|\\QHawaii Standard Time\\E|\\QHDT\\E|\\QHKT\\E|\\QHong Kong Time\\E|\\QHovd Time\\E|\\QHOVT\\E|\\QHST\\E|\\QICT\\E|\\QIDT\\E|\\QIndia Standard Time\\E|\\QIndian Ocean Territory Time\\E|\\QIndochina Time\\E|\\QIOT\\E|\\QIran Daylight Time\\E|\\QIran Standard Time\\E|\\QIRDT\\E|\\QIrish Summer Time\\E|\\QIRKT\\E|\\QIrkutsk Time\\E|\\QIRST\\E|\\QIsrael Daylight Time\\E|\\QIsrael Standard Time\\E|\\QIST\\E|\\QJapan Standard Time\\E|\\QJST\\E|\\QKGT\\E|\\QKirgizstan Time\\E|\\QKorea Standard Time\\E|\\QKosrae Time\\E|\\QKOST\\E|\\QKrasnoyarsk Time\\E|\\QKRAT\\E|\\QKST\\E|\\QLHDT\\E|\\QLHST\\E|\\QLine Is. Time\\E|\\QLINT\\E|\\QLord Howe Daylight Time\\E|\\QLord Howe Standard Time\\E|\\QMacquarie Island Standard Time\\E|\\QMagadan Time\\E|\\QMAGT\\E|\\QMalaysia Time\\E|\\QMaldives Time\\E|\\QMarquesas Time\\E|\\QMarshall Islands Time\\E|\\QMART\\E|\\QMauritius Time\\E|\\QMawson Time\\E|\\QMAWT\\E|\\QMDT\\E|\\QMEST\\E|\\QMET\\E|\\QMHT\\E|\\QMiddle Europe Summer Time\\E|\\QMiddle Europe Time\\E|\\QMIST\\E|\\QMMT\\E|\\QMoscow Standard Time\\E|\\QMountain Daylight Time\\E|\\QMountain Standard Time\\E|\\QMSK\\E|\\QMST\\E|\\QMUT\\E|\\QMVT\\E|\\QMyanmar Time\\E|\\QMYT\\E|\\QNauru Time\\E|\\QNCT\\E|\\QNDT\\E|\\QNepal Time\\E|\\QNew Caledonia Time\\E|\\QNew Zealand Daylight Time\\E|\\QNew Zealand Standard Time\\E|\\QNewfoundland Daylight Time\\E|\\QNewfoundland Standard Time\\E|\\QNFT\\E|\\QNiue Time\\E|\\QNorfolk Time\\E|\\QNovosibirsk Time\\E|\\QNOVT\\E|\\QNPT\\E|\\QNRT\\E|\\QNST\\E|\\QNUT\\E|\\QNZDT\\E|\\QNZST\\E|\\QOmsk Time\\E|\\QOMST\\E|\\QOral Time\\E|\\QORAT\\E|\\QPacific Daylight Time\\E|\\QPacific Standard Time\\E|\\QPakistan Time\\E|\\QPalau Time\\E|\\QPapua New Guinea Time\\E|\\QParaguay Summer Time\\E|\\QParaguay Time\\E|\\QPDT\\E|\\QPeru Time\\E|\\QPET\\E|\\QPetropavlovsk-Kamchatski Time\\E|\\QPETT\\E|\\QPGT\\E|\\QPhilippines Standard Time\\E|\\QPhoenix Is. Time\\E|\\QPHOT\\E|\\QPierre & Miquelon Daylight Time\\E|\\QPierre & Miquelon Standard Time\\E|\\QPitcairn Standard Time\\E|\\QPKT\\E|\\QPMDT\\E|\\QPMST\\E|\\QPohnpei Time\\E|\\QPONT\\E|\\QPST\\E|\\QPWT\\E|\\QPYST\\E|\\QPYT\\E|\\QQYZT\\E|\\QQyzylorda Time\\E|\\QRET\\E|\\QReunion Time\\E|\\QRothera Time\\E|\\QROTT\\E|\\QSakhalin Time\\E|\\QSAKT\\E|\\QSamara Time\\E|\\QSamoa Standard Time\\E|\\QSAMT\\E|\\QSAST\\E|\\QSBT\\E|\\QSCT\\E|\\QSeychelles Time\\E|\\QSGT\\E|\\QSingapore Time\\E|\\QSolomon Is. Time\\E|\\QSouth Africa Standard Time\\E|\\QSouth Georgia Standard Time\\E|\\QSrednekolymsk Time\\E|\\QSRET\\E|\\QSRT\\E|\\QSST\\E|\\QSuriname Time\\E|\\QSYOT\\E|\\QSyowa Time\\E|\\QTahiti Time\\E|\\QTAHT\\E|\\QTajikistan Time\\E|\\QTFT\\E|\\QTimor-Leste Time\\E|\\QTJT\\E|\\QTKT\\E|\\QTLT\\E|\\QTMT\\E|\\QTokelau Time\\E|\\QTonga Time\\E|\\QTOT\\E|\\QTurkmenistan Time\\E|\\QTuvalu Time\\E|\\QTVT\\E|\\QUlaanbaatar Time\\E|\\QULAT\\E|\\QUruguay Time\\E|\\QUst-Nera Time\\E|\\QUTC\\E|\\QUYT\\E|\\QUzbekistan Time\\E|\\QUZT\\E|\\QVanuatu Time\\E|\\QVenezuela Time\\E|\\QVET\\E|\\QVladivostok Time\\E|\\QVLAT\\E|\\QVOST\\E|\\QVostok Time\\E|\\QVUT\\E|\\QWake Time\\E|\\QWAKT\\E|\\QWallis & Futuna Time\\E|\\QWAT\\E|\\QWEST\\E|\\QWest Indonesia Time\\E|\\QWest Samoa Daylight Time\\E|\\QWest Samoa Standard Time\\E|\\QWestern African Time\\E|\\QWestern European Summer Time\\E|\\QWestern European Time\\E|\\QWestern Greenland Summer Time\\E|\\QWestern Greenland Time\\E|\\QWET\\E|\\QWFT\\E|\\QWGST\\E|\\QWGT\\E|\\QWIB\\E|\\QWIT\\E|\\QWITA\\E|\\QWSDT\\E|\\QWSST\\E|\\QXinjiang Standard Time\\E|\\QXJT\\E|\\QYAKT\\E|\\QYakutsk Time\\E|\\QYekaterinburg Time\\E|\\QYEKT\\E)");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test46");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat0);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test47");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fastDateFormat2.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test48");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.Object obj3 = fastDateFormat2.clone();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((-1L), stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test49");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fastDateFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test50");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.String str3 = fastDateFormat2.toString();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = fastDateFormat2.format((long) 100, stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FastDateFormat[h:mm:ss a z,en_US,America/Denver]" + "'", str3.equals("FastDateFormat[h:mm:ss a z,en_US,America/Denver]"));
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test51");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) -1, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test52");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat2.format(date6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test53");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6, locale7);
        java.lang.Class<?> wildcardClass9 = fastDateFormat8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test54");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        boolean boolean6 = fastDateFormat2.equals((java.lang.Object) (-1.0f));
        boolean boolean8 = fastDateFormat2.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = fastDateFormat2.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[h:mm:ss a z,en_US,America/Denver]");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test55");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        java.lang.String str5 = fastDateFormat2.getPattern();
        boolean boolean7 = fastDateFormat2.equals((java.lang.Object) 17);
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fastDateFormat2.format(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5.equals("h:mm:ss a z"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test56");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        java.lang.Class<?> wildcardClass6 = timeZone5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Mountain Standard Time");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test57");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test58");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test59");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) ' ');
        int int5 = fastDateFormat2.getMaxLengthEstimate();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test60");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format((long) (byte) 100, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test61");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone2);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) ' ');
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeZone6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Mountain Standard Time");
    }

    @Test
    public void FastDateFormat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FastDateFormat0.test62");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone1, locale2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fastDateFormat3);
    }
}

