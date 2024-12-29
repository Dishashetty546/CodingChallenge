#import all necessary dependencies
import numpy as np
import pandas as pd
from sklearn.datasets import fetch_20newsgroups
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.naive_bayes import MultinomialNB
from sklearn.metrics import accuracy_score, classification_report
#load the dataset
newsgroup = fetch_20newsgroups(subset='all')
X,y = newsgroup.data, newsgroup.target

#split into training and testing
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2,random_state =42)

vectorizer = TfidfVectorizer(stop_words='english', max_df=0.5)
X_train_tfidf=vectorizer.fit_transform(X_train)
X_test_tfidf= vectorizer.transform(X_test)
nb_classifier= MultinomialNB()

nb_classifier.fit(X_train_tfidf,y_train)
y_pred = nb_classifier.predict(X_test_tfidf)

accuracy = accuracy_score(y_test,y_pred)
print("Accuracy is:",accuracy)

class_report = classification_report(y_test,y_pred,target_names=newsgroup.target_names)
print("classification reports:",class_report)