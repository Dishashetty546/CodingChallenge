import pandas as pd
import numpy as np
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score,classification_report,confusion_matrix
import matplotlib.pyplot as plt
import sklearn.tree as tree

iris= load_iris()
X= iris.data
y= iris.target
X_train,X_test,y_train,y_test= train_test_split(X,y,test_size=0.5, random_state=42)

dish = DecisionTreeClassifier(random_state =42)
dish.fit(X_train,y_train)
y_pred= dish.predict(X_test)

Accuracy = accuracy_score(y_test,y_pred)
print("Accuracy:",Accuracy)

class_report = classification_report(y_test,y_pred)
print("Classification:",class_report)

conf_ma= confusion_matrix(y_test,y_pred)
print("confusion matrix:",conf_ma)

plt.figure(figsize=(12,8))
tree.plot_tree(dish,feature_names=iris.feature_names,class_names = iris.target_names,filled=True)
plt.show()
