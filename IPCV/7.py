import cv2
import numpy as np
import matplotlib.pyplot as plt

image= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg')

_, binary_image= cv2.threshold(image,127,255,cv2.THRESH_BINARY)

kernel= cv2.getStructuringElement(cv2.MORPH_RECT,(5,5))

dilated= cv2.dilate(binary_image,kernel)
eroded= cv2.erode(binary_image,kernel)
closing= cv2.morphologyEx(binary_image,cv2.MORPH_CLOSE,kernel)
opening= cv2.morphologyEx(binary_image,cv2.MORPH_OPEN,kernel)

plt.figure(figsize=(12,8))

plt.subplot(1,5,1)
plt.imshow(image,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,5,2)
plt.imshow(dilated,cmap='gray')
plt.title('dilated Image')
plt.axis('off')

plt.subplot(1,5,3)
plt.imshow(eroded,cmap='gray')
plt.title('eroded Image')
plt.axis('off')

plt.subplot(1,5,4)
plt.imshow(closing,cmap='gray')
plt.title('closing Image')
plt.axis('off')

plt.subplot(1,5,5)
plt.imshow(opening,cmap='gray')
plt.title('opening Image')
plt.axis('off')

plt.show()


