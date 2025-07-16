import cv2
import numpy as np 
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
imgBlue = img[:, :, 0] = 0
imgGreen = img[:, :, 1] = 0
imgRed = img[:, :, 2] = 0 # aqua color - eliminates red
# to get all 3 images together
new_img = np.hstack((imgBlue, imgGreen, imgRed))

cv2.imshow("yellowish",new_img)
cv2.waitKey(0)
