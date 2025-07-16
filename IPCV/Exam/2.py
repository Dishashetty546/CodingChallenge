#read the image and rotate,scale,translate the image
import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

height,width= img.shape[:2]

center=(width//2,height//2)
angle=45
scale= 1.5

rotate_matrix=cv2.getRotationMatrix2D(center,angle,scale)
rotated_image= cv2.warpAffine(img,rotate_matrix,(height,width))

scale_factor=0.5
sacled_image= cv2.resize(img,None,fx=scale_factor,fy=scale_factor,interpolation=cv2.INTER_LINEAR)

tx,ty=50,100
translation_matrix= np.float32([[1,0,tx],[0,1,ty]])
translated_image= cv2.warpAffine(img,translation_matrix,(width,height))

plt.figure(figsize=(12,8))

plt.subplot(2,4,1)
plt.imshow(cv2.cvtColor(img,cv2.COLOR_BGR2RGB))
plt.title('Original image')
plt.axis('off')

plt.subplot(2,4,2)
plt.imshow(cv2.cvtColor(rotated_image,cv2.COLOR_BGR2RGB))
plt.title('Rotated image')
plt.axis('off')

plt.subplot(2,4,3)
plt.imshow(cv2.cvtColor(sacled_image,cv2.COLOR_BGR2RGB))
plt.title('Scaled image')
plt.axis('off')

plt.subplot(2,4,4)
plt.imshow(cv2.cvtColor(translated_image,cv2.COLOR_BGR2RGB))
plt.title('Translated image')
plt.axis('off')


plt.show()