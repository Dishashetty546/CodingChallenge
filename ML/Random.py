import numpy as np
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.tree import plot_tree
from sklearn.metrics import accuracy_score, classification_report,confusion_matrix
from sklearn import tree
import matplotlib.pyplot as plt
iris= load_iris()
X,y= iris.data,iris.target
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.5,random_state =42)

dish = RandomForestClassifier(random_state=42)
dish.fit(X_train,y_train)
y_pred = dish.predict(X_test)

Accuracy = accuracy_score(y_test,y_pred)
print(Accuracy)

classa = classification_report(y_test,y_pred)
print(classa)

conf = confusion_matrix(y_test,y_pred)
print(conf)

plt.figure(figsize=(15,8))
plot_tree(dish.estimators_[0],feature_names = iris.feature_names, class_names = iris.target_names,filled=True)
plt.show()
