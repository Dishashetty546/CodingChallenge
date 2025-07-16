import cv2
import numpy as np 
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
cv2.imwrite("git_image.jpg",img)  # imwrite commands is used to save the image
cv2.imshow("window",img)
cv2.waitKey(0)