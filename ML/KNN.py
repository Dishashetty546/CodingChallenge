import numpy as np
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score,classification_report,confusion_matrix
iris = load_iris()
X,y= iris.data,iris.target

X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2,random_state =42)
Scaler = StandardScaler()
X_trains = Scaler.fit_transform(X_train)
X_tests = Scaler.transform(X_test)

model = KNeighborsClassifier()
model.fit(X_trains,y_train)
y_pred = model.predict(X_tests)

Accuracy = accuracy_score(y_test,y_pred)
classigy=classification_report(y_test,y_pred)
confuse=confusion_matrix(y_test,y_pred)
print(Accuracy)
print(classigy)
print(confuse)
