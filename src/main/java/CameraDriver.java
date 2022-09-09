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
