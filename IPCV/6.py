import cv2
import matplotlib.pyplot as plt
import numpy as np

image = cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg')

gaussian_filter= cv2.GaussianBlur(image,(5,5),0)

median_filters= cv2.medianBlur(image,5)

laplacian_filters= cv2.Laplacian(image,cv2.CV_64F)
laplacian_filters= cv2.convertScaleAbs(laplacian_filters)

plt.figure(figsize=(12,8))



plt.subplot(1,3,1)
plt.imshow(gaussian_filter,cmap='gray')
plt.title('gaussian filter')
plt.axis('off')

plt.subplot(1,3,2)
plt.imshow(median_filters,cmap='gray')
plt.title('median filter')
plt.axis('off')

plt.subplot(1,3,3)
plt.imshow(laplacian_filters,cmap='gray')
plt.title('laplacian filter')
plt.axis('off')
plt.show()