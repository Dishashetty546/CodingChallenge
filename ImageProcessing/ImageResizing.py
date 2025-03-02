import cv2
import numpy as np 
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
# img_resize = cv2.resize(img,(256,255)) #smaller size
img_resize = cv2.resize(img,(800,800))
cv2.imshow("window",img_resize)
cv2.waitKey(0)