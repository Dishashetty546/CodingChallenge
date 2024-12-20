#usually we'll have this
import pandas as pd    #data manipulation
import numpy as np     
import matplotlib.pyplot as plt

#read the csv file
cols= ["Topic","Question","Option A","Option B","Option C","Option D","Correct Answer","Difficulty","Explanation"]
file_path = 'questions_dataset.csv'
data = pd.read_csv(file_path, names=cols)
print(data.head())   #first five will get printed
print(data)
# csv file are comma seperated values

 #features are ex: topic,ques... these are pass into our model in order to help us predict the label, which is correct answer in this case
