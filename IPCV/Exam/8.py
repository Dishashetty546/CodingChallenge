import cv2
import cv2.data
import matplotlib.pyplot as plt
from ultralytics import YOLO

img= cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\Exam\nature.jpg')

haar = cv2.CascadeClassifier(cv2.data.haarcascades+'haarcascade_frontalface_default.xml')
haar_img= img.copy()
for (x ,y ,w , h) in haar.detectMultiScale(cv2.cvtColor(img,cv2.COLOR_BGR2GRAY),scaleFactor=1.1, minNeighbors=4):
    cv2.rectangle(haar_img,(x,y),(x+w,y+h),(255,0,0),2)

hog=cv2.HOGDescriptor()
hog.setSVMDetector(cv2.HOGDescriptor_getDefaultPeopleDetector())
hog_img=img.copy()
for (x,y,w,h) in hog.detectMultiScale(haar_img,  winStride=(8, 8),padding=(8,8) , scale=1.5)[0]:
    cv2.rectangle(hog_img,(x,y),(x+w,y+h),(0,255,0),2)


yolo_img= YOLO('yolov8n')(img)[0].plot()

plt.figure(figsize=(12,8))
plt.subplot(1,4,1)
plt.imshow(img,cmap='gray')
plt.title('Original Image')
plt.axis('off')


plt.subplot(1,4,2)
plt.imshow(haar_img,cmap='gray')
plt.title('Haar Image')
plt.axis('off')


plt.subplot(1,4,3)
plt.imshow(hog_img,cmap='gray')
plt.title('Hog Image')
plt.axis('off')

plt.subplot(1,4,4)
plt.imshow(yolo_img,cmap='gray')
plt.title('Yolo Image')
plt.axis('off')
plt.show()