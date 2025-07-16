import cv2
import matplotlib.pyplot as plt
from ultralytics import YOLO

img = cv2.imread(r'C:\Users\LENOVO\OneDrive\Desktop\CRACK-DREAM-JOB\IPCV\people.jpg')

# Haar
haar = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
haar_img = img.copy()
for (x, y, w, h) in haar.detectMultiScale(cv2.cvtColor(img, cv2.COLOR_BGR2GRAY), scaleFactor=1.1, minNeighbors=4):
    cv2.rectangle(haar_img, (x, y), (x + w, y + h), (255, 0, 0), 2)

# HOG
hog = cv2.HOGDescriptor()
hog.setSVMDetector(cv2.HOGDescriptor_getDefaultPeopleDetector())
hog_img = img.copy()
for (x, y, w, h) in hog.detectMultiScale(hog_img, winStride=(8, 8), padding=(8, 8), scale=1.5)[0]:
    cv2.rectangle(hog_img, (x, y), (x + w, y + h), (0, 255, 0), 2)


# YOLO
yolo_img = YOLO('yolov8n.pt')(img)[0].plot()

# Display
plt.subplot(1, 3, 1)
plt.imshow(cv2.cvtColor(haar_img, cv2.COLOR_BGR2RGB))
plt.title('Haar Detection')
plt.axis('off')

plt.subplot(1, 3, 2)
plt.imshow(cv2.cvtColor(hog_img, cv2.COLOR_BGR2RGB))
plt.title('HOG Detection')
plt.axis('off')

plt.subplot(1, 3, 3)
plt.imshow(cv2.cvtColor(yolo_img, cv2.COLOR_BGR2RGB))
plt.title('YOLO Detection')
plt.axis('off')

plt.show()
