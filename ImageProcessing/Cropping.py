import cv2
import numpy as np 
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
img_crop = img[100:300,200:500] #where 100:300 is for height and 200:500 is for width

cv2.imshow("window",img_crop)
cv2.waitKey(0)