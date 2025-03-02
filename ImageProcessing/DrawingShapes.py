#creating an rectangle or any other shape in an image
import cv2
import numpy as np
img =np.zeros((512,512,3))

#draw rectangle
#pt1 = length of rectangle, pt2 is width, color - blue, thickness of the rectangle sides, if we want to fill the rectangle then thickness =-1
# cv2.rectangle(img,pt1=(100,100), pt2=(300,300), color=(255,0,0) , thickness=-1)

#draw circle
# cv2.circle(img,center=(100,400), radius=50, color=(8,0,255),thickness=0)

#line 
# cv2.line(img,pt1=(0,0), pt2=(512,512), thickness=2, color=(0,255,0))

#text 
cv2.putText(img,org=(400,400), fontScale=4, color=(0,255,255), thickness=2, lineType=cv2.LINE_AA, text="hello", fontFace=cv2.FONT_HERSHEY_SIMPLEX)
cv2.imshow('window',img)
cv2.waitKey(0)