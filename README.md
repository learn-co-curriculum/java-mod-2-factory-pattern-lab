# Factory Pattern Lab

## Learning Goals

- Apply the factory pattern

## Instructions

Use the factory design pattern to model a camera and the different types of
cameras one could have:

- A Polaroid Camera
- A Digital Camera
- A Phone Camera

To fully implement the design pattern to model a camera, consider the following
instructions and tips:

- Create a `Camera` interface.
- The `Camera` interface should have a method called `takePhotograph()` that
  returns nothing and takes no parameters.
- Create concrete classes of `PolaroidCamera`, `DigitalCamera`, and
  `PhoneCamera` that implement the `Camera` interface.
- Create a `CameraFactory` to instantiate each of the different types of
  `Camera` objects.

## Starter Code

To help you test your code, you can use the driver class `CameraDriver` that
has already been written out for you:

```java
public class CameraDriver {
    public static void main(String[] args) {
        Camera polaroid = CameraFactory.getCamera("POLAROID");
        Camera digital = CameraFactory.getCamera("DIGITAL");
        Camera phone = CameraFactory.getCamera("PHONE");

        polaroid.takePhotograph();
        digital.takePhotograph();
        phone.takePhotograph();
    }
}
```

## Expected Output

Below is the expected output from executing the `CameraDriver` class:

```plaintext
Taking a photo on my polaroid camera!
Taking a photo on my digital camera!
Taking a photo on my phone camera!
```
