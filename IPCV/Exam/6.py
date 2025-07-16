import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

gaussian_filters= cv2.GaussianBlur(img,(5,5),0)

median= cv2.medianBlur(img,5)

laplacian= cv2.Laplacian(img,cv2.CV_64F)
laplacian_filter= cv2.convertScaleAbs(laplacian)

plt.figure(figsize=(12,8))

plt.subplot(1,4,1)
plt.imshow(img,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,4,2)
plt.imshow(gaussian_filters,cmap='gray')
plt.title('Gaussian_filtered Image')
plt.axis('off')

plt.subplot(1,4,3)
plt.imshow(median,cmap='gray')
plt.title('Median_filtered Image')
plt.axis('off')

plt.subplot(1,4,4)
plt.imshow(laplacian_filter,cmap='gray')
plt.title('Laplacian_filter Image')
plt.axis('off')

plt.show()
