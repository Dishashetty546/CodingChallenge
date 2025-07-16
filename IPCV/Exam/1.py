#read the image and split the image into 4 parts
import cv2
import matplotlib.pyplot as plt
import numpy as np

img= cv2.imread(r'c:/Users/Lenovo/OneDrive/Desktop/CRACK-DREAM-JOB/IPCV/nature.jpg')

height,width,channels= img.shape

center_y,center_x=height//2,width//2

top_left= img[:center_y,:center_x]
top_right= img[:center_y,center_x:]
bottom_left= img[center_y:,center_x:]
bottom_right= img[center_y:,:center_x]

plt.figure(figsize=(12,8))

plt.subplot(2,5,1)
plt.imshow(cv2.cvtColor(img,cv2.COLOR_BGR2RGB))
plt.title('Original Image')
plt.axis('off')

plt.subplot(2,5,2)
plt.imshow(cv2.cvtColor(top_left,cv2.COLOR_BGR2RGB))
plt.title('Top left')
plt.axis('off')

plt.subplot(2,5,3)
plt.imshow(cv2.cvtColor(top_right,cv2.COLOR_BGR2RGB))
plt.title('Top Right')
plt.axis('off')

plt.subplot(2,5,4)
plt.imshow(cv2.cvtColor(bottom_left,cv2.COLOR_BGR2RGB))
plt.title('Bottom left')
plt.axis('off')

plt.subplot(2,5,5)
plt.imshow(cv2.cvtColor(bottom_right,cv2.COLOR_BGR2RGB))
plt.title('Bottom Right')
plt.axis('off')

plt.show()

