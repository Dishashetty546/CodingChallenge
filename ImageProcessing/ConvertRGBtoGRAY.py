import cv2
import numpy as np 
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
im_gray = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY) #cvtColor - convert color
print((im_gray.shape)) # (512,512) - there is no channels - RGB
cv2.imshow("window",im_gray)
cv2.waitKey(0)