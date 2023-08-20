1. Kaggle Competition introduction
In this competition I will work with a challenging time-series dataset consisting of daily sales data, kindly provided by one of the largest Russian software firms - 1C Company. I need to predict total sales for combinations of every product and every store in the next month. By solving this problem, I will be able to apply and enhance my data management skills.
link: https://www.kaggle.com/c/competitive-data-science-predict-future-sales/overview

2. Data files' description
sales_train.csv - the training set. Daily historical data from January 2013 to October 2015.
test.csv - the test set. You need to forecast the sales for these shops and products for November 2015.
sample_submission.csv - a sample submission file in the correct format.
items.csv - supplemental information about the items/products.
item_categories.csv  - supplemental information about the items categories.
shops.csv- supplemental information about the shops.

3. Hardware/Software configuration
Code runs in Google Colaboratory through Google drive and use GPU when training models.
# HARDWARE:
	GPU: 1xTesla K80, 12GB
	CPU: Xeon Processors(2 cores), 2.3Ghz 
	RAM: 25.51G
	Disk: 358.27G
# SOFTWARE/packages:
	Python 3.6.8
	jupyter-notebook 5.2.2
	numpy 1.16.5
	pandas 0.24.2
	sklearn 0.21.3
	matplotlib 3.0.3
	seaborn 0.9.0
	catboost 0.17.5
	keras 2.2.5
	tensorfow 1.15.0

4. Code introduction
There are three jupyter notebooks which are responsible for EDA, feature engineering & data generation, and modelling & result respectively. 
'input&output' folder consists of input data files and three folders which are 'generated_data'(as input into models), 'trained_models'(generated intermediate/final models and intermediate predictions), and submissions(final predictions).

# Exploratory Data Analysis (EDA)  
	- sales_train file and test file analysis 
	- shops file analysis
	- items file analysis
	- item_categories file analysis
# Feature Engineering 
This file is a list of functions that would generate the final data set based on EDA for models to learn.
	- preparation
	- categories and shops cleaning functions
	- data grouping function
	- encoding function
	- grid generation function
	- adding encodings and additional months, shops and items features
	- target lagging function
	- knn features Function
	- encodings lagging functions
	- index-based features function
	- tfidf (pca) features function
	- final function
	- save generated data
# Modelling and Submission
	- Modelling for D1
	- Modelling for D0
	- Final Submission

5. Code structure
See Figure 1.