import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

_,  binary_image= cv2.threshold(img,127,255,cv2.THRESH_BINARY)

kernel= cv2.getStructuringElement(cv2.MORPH_RECT,(5,5))

eroded= cv2.erode(binary_image,kernel)
dilated= cv2.dilate(binary_image,kernel)
eroded_df= cv2.morphologyEx(binary_image,cv2.MORPH_RECT,kernel)
dilated_df= cv2.morphologyEx(binary_image,cv2.MORPH_RECT,kernel)

plt.figure(figsize=(12,8))

plt.subplot(1,5,1)
plt.imshow(img,cmap='gray')
plt.title('Original image')
plt.axis('off')


plt.subplot(1,5,2)
plt.imshow(eroded,cmap='gray')
plt.title('Erodede image')
plt.axis('off')


plt.subplot(1,5,3)
plt.imshow(img,cmap='gray')
plt.title('Original image')
plt.axis('off')



plt.subplot(1,5,4)
plt.imshow(eroded_df,cmap='gray')
plt.title('Eroded df image')
plt.axis('off')



plt.subplot(1,5,5)
plt.imshow(dilated_df,cmap='gray')
plt.title('Dilated df image')
plt.axis('off')

plt.show()


