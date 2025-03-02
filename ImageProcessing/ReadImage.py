#black and white images are in a grey scale, 0-255 ranges
#three channels of an colored image - RGB COLORS - red, green,Blue, they are in pixels with the range from 0-255
#full HD images - are having pixel value of 1420*1080
#read an image
import cv2
import numpy as np 

# Use absolute path
img = cv2.imread(r"C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\ImageProcessing\git.jpg")
# print(type(img)) #numpy array
# print(img.shape) #shape of image (512,512,3) here 3 is channels - RGB
cv2.imshow("Git",img)
cv2.waitKey(0) # absence of this line, can cause image disappear in a sec

