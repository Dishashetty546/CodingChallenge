import tensorflow as tf
from tensorflow.keras import layers,models
import matplotlib.pyplot as plt

(x_train,y_train),(x_test,y_test)= tf.keras.datasets.cifar10.load_data()
x_train, x_test= x_train/255.0 , x_test/255.0
class_names= ['airplane','automobile','bird','cat','deer','dog','frog','horse','ship','truck']

model = models.Sequential([
    layers.Conv2D(32,(3,3),activation='relu',input_shape=(32,32,3)),
    layers.MaxPooling2D((2,2)),
    layers.Conv2D(64,(3,3),activation='relu'),
    layers.MaxPooling2D((2,2)),
    layers.Conv2D(64,(3,3),activation='relu'),
    layers.Flatten(),
    layers.Dense(64,activation='relu'),
    layers.Dense(10)

])

model.compile(
    optimizer='adam',
    loss= tf.keras.losses.SparseCategoricalCrossentropy(from_logits=True),
    metrics=['accuracy']
)

h= model.fit(x_train,y_train,epochs=10,validation_data=(x_test,y_test),verbose=2)
print(f"\n Test Accuracy:{model.evaluate(x_test,y_test,verbose=0)[1]:.4f}")

plt.figure(figsize=(12,6))
for i in range(10):
    plt.subplot(2,10,i+1)
    plt.imshow(x_train[i])
    plt.title(class_names[y_train[i][0]])
    plt.axis('off')

plt.figure() 
plt.plot(h.history['accuracy'],label='Train')
plt.plot(h.history['val_accuracy'],label='Val')
plt.xlabel('Epoch')
plt.ylabel('Accuracy')
plt.legend()
plt.tight_layout()
plt.show()