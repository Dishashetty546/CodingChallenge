#read the image and demonstrate erosion, dilation and substraction of eroded and dilated with image
import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

kernel= cv2.getStructuringElement(cv2.MORPH_RECT,(5,5))

erode= cv2.erode(img,kernel)
dilate= cv2.dilate(img,kernel)

dilate_substract= cv2.subtract(dilate,img)
erode_substract=  cv2.subtract(img,erode)

plt.figure(figsize=(12,8))

plt.subplot(1,5,1)
plt.imshow(img,cmap='gray')
plt.title('Original Image')
plt.axis('off')

plt.subplot(1,5,2)
plt.imshow(erode,cmap='gray')
plt.title('Eroded Image')
plt.axis('off')

plt.subplot(1,5,3)
plt.imshow(img,cmap='gray')
plt.title('Dilated Image')
plt.axis('off')

plt.subplot(1,5,4)
plt.imshow(erode_substract,cmap='gray')
plt.title('Subtracted E Image')
plt.axis('off')

plt.subplot(1,5,5)
plt.imshow(dilate_substract,cmap='gray')
plt.title('Subtracted D Image')
plt.axis('off')

plt.show()

