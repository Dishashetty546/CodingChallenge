#import necessary dependencies
import numpy as np
import pandas as pd
from pgmpy.models import BayesianNetwork 
from pgmpy.estimators import MaximumLikelihoodEstimator 
from pgmpy.inference import VariableElimination

#load the dataset

data = pd.read_csv('heart.csv')
print(data)

#target and data
subset_data = data[['age','sex','cp','trestbps','target']]

#display few row of datasets
print(subset_data.head())

#define bayesian model network
model = BayesianNetwork([
    ('age','target'),
    ('sex','target'),
    ('cp','target'),
    ('trestbps','target')

]),
model.fit(subset_data,estimator=MaximumLikelihoodEstimator)
inference = VariableElimination(model)

evidence = {
    'age':64,
    'sex':1,
    'cp':1,
    'trestbps':150,
    
}
result = inference.query(variables=['target'],evidence=evidence)
print(evidence)

#bayesian network is basicallu to predict ex: if a person will catch a cold or not basedon the data like wethercondition nd he had wore a jacket or not
#maximum likelihood - 
#pgmpy - probabilistic graphical model in python
#VariableElimination - remove all unwnated variable and compute the desired marginal distribution

