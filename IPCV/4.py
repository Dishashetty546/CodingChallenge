import cv2
import numpy as np
import matplotlib.pyplot as plt

image= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg')

gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
enhanced_image = cv2.equalizeHist(gray)

_, segmented_image= cv2.threshold(gray,0,255,cv2.THRESH_BINARY+cv2.THRESH_OTSU)

plt.figure(figsize=(12,8))

plt.subplot(1,3,1)
plt.imshow(image,cmap='gray')
plt.title('Original image')
plt.axis('off')

plt.subplot(1,3,2)
plt.imshow(enhanced_image,cmap='gray')
plt.title('Enhanced image')
plt.axis('off')

plt.subplot(1,3,3)
plt.imshow(segmented_image,cmap='gray')
plt.title('Original image')
plt.axis('off')

plt.show()