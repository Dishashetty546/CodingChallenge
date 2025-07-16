import cv2
import numpy as np
import matplotlib.pyplot as plt

image= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg')

edges= cv2.Canny(image,100,200)

gray_image= cv2.cvtColor(image,cv2.COLOR_BGR2RGB)
textures= cv2.Laplacian(gray_image,cv2.CV_64F)
textures=cv2.convertScaleAbs(textures)

plt.figure(figsize=(12,8))

plt.subplot(1,3,1)
plt.imshow(image,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,3,2)
plt.imshow(edges,cmap='gray')
plt.title('Edge Detection')
plt.axis('off')

plt.subplot(1,3,3)
plt.imshow(textures,cmap='gray')
plt.title('Texture Detection')
plt.axis('off')

plt.show()
