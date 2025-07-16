import cv2
import matplotlib.pyplot as plt
import numpy as np

image = cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\nature.jpg')

height,width= image.shape[:2]
center= (width//2 , height//2)
angle=45
scale=1.0

rotate_matrix= cv2.getRotationMatrix2D(center,angle,scale)
rotated_image= cv2.warpAffine(image,rotate_matrix,(width,height))

scaling_factor=0.5
scaled_image= cv2.resize(image,None,fx=scaling_factor,fy=scaling_factor,interpolation=cv2.INTER_LINEAR)

tx,ty=100,50
translation_matrix=np.float32([[1,0,tx],[0,1,ty]])
translated_image=cv2.warpAffine(image,translation_matrix,(width,height))

plt.subplot(1,3,1)
plt.imshow(cv2.cvtColor(rotated_image,cv2.COLOR_BGR2RGB))
plt.title('Rotated Image')
plt.axis('off')

plt.subplot(1,3,2)
plt.imshow(cv2.cvtColor(scaled_image,cv2.COLOR_BGR2RGB))
plt.title('Scaled Image')
plt.axis('off')

plt.subplot(1,3,3)
plt.imshow(cv2.cvtColor(translated_image,cv2.COLOR_BGR2RGB))
plt.title('Translated Image')
plt.axis('off')

plt.show()