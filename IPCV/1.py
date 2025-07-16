#program 1- read image and split into 4 parts
import cv2
import matplotlib.pyplot as plt
import numpy as np

image = cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg')

height,width, channels= image.shape

center_y, center_x= height//2 , width//2

top_left =image[:center_y,:center_x]
top_right= image[:center_y,center_x:]
bottom_left= image[center_y:,:center_x]
bottom_right= image[center_y:,center_x:]

plt.figure(figsize=(12,8))

plt.subplot(2,4,1)
plt.imshow(cv2.cvtColor(top_left,cv2.COLOR_BGR2RGB))
plt.title('Top left')
plt.axis('off')

plt.subplot(2,4,2)
plt.imshow(cv2.cvtColor(top_right,cv2.COLOR_BGR2RGB))
plt.title('Top right')
plt.axis('off')

plt.subplot(2,4,3)
plt.imshow(cv2.cvtColor(bottom_left,cv2.COLOR_BGR2RGB))
plt.title('bottom left')
plt.axis('off')

plt.subplot(2,4,4)
plt.imshow(cv2.cvtColor(bottom_right,cv2.COLOR_BGR2RGB))
plt.title('bottom right')
plt.axis('off')


plt.show()