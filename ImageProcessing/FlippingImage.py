import cv2
import numpy as np 
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
# img_flip = cv2.flip(img,0) #image will flip complitely vertically
# img_flip = cv2.flip(img,1) #image will get cut in half and flip horizontally
img_flip = cv2.flip(img,-1) # both horizontally and vetically

cv2.imshow("window",img_flip)
cv2.waitKey(0)