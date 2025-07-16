#read the image and apply enhanced and segmented features into image
import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

gray= cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)

enhanced_img= cv2.equalizeHist(gray)
_, segmentedImage= cv2.threshold(gray,0,255,cv2.THRESH_BINARY+cv2.THRESH_OTSU)

plt.figure(figsize=(12,8))

plt.subplot(1,3,1)
plt.imshow(gray,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,3,2)
plt.imshow(enhanced_img,cmap='gray')
plt.title('enhanced Image')
plt.axis('off')

plt.subplot(1,3,3)
plt.imshow(segmentedImage,cmap='gray')
plt.title('Segmented Image')
plt.axis('off')
plt.show()