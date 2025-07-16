import cv2
import numpy as np
import matplotlib.pyplot as plt

image = cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg',cv2.IMREAD_GRAYSCALE)

kernel= cv2.getStructuringElement(cv2.MORPH_RECT,(5,5))

eroded= cv2.erode(image,kernel)
dilated= cv2.dilate(image,kernel)

edge_f_dilated= cv2.subtract(dilated,image)
edge_f_eroded= cv2.subtract(image,eroded)

plt.figure(figsize=(12,8))


plt.subplot(1,5,1)
plt.imshow(image,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,5,2)
plt.imshow(eroded,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,5,3)
plt.imshow(dilated,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,5,4)
plt.imshow(edge_f_dilated,cmap='gray')
plt.title('Edge dilation using dilate')
plt.axis('off')


plt.subplot(1,5,5)
plt.imshow(edge_f_eroded,cmap='gray')
plt.title('Edge dilation using erode')
plt.axis('off')

plt.show()