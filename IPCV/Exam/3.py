#read the image and take edge and textures using canny, laplacian
import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

gray_img= cv2.cvtColor(img,cv2.COLOR_BGR2RGB)

edges= cv2.Canny(img,100,200)

textures=cv2.Laplacian(gray_img,cv2.CV_64F)
texture= cv2.convertScaleAbs(textures)

plt.figure(figsize=(12,8))

plt.subplot(1,4,1)
plt.imshow(cv2.cvtColor(img,cv2.COLOR_BGR2RGB))
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,4,2)
plt.imshow(cv2.cvtColor(edges,cv2.COLOR_BGR2RGB))
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,4,3)
plt.imshow(cv2.cvtColor(texture,cv2.COLOR_BGR2RGB))
plt.title('Original Image')
plt.axis('off')

plt.show()

