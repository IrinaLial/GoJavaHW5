package CarFax;

public class CarDoor {
    private boolean doorIsOpen;
    private boolean windowIsOpen;

    public CarDoor() {
        this(false, false);
    }

    public CarDoor(boolean doorIsOpen, boolean windowIsOpen) { this.doorIsOpen = doorIsOpen;
        this.windowIsOpen = windowIsOpen;
    }
    public void openDoor() {
        this.doorIsOpen = true;
    }

    public void closeDoor() {
        this.doorIsOpen = false;
    }
    public void changeDoorState() {
        this.doorIsOpen = !doorIsOpen;
    }

    public void openWindow() {
        this.windowIsOpen = true;
    }

    public void closeWindow() {
        this.windowIsOpen = false;
    }

    public void changeWindowState() {
        this.windowIsOpen = !windowIsOpen;
    }

    public void showDoor() {
        System.out.println("Door is " + ((doorIsOpen) ? "opened" : "closed") +
                ", window is " + ((windowIsOpen) ? "opened" : "closed") + ".");
    }
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor(true, false);
        carDoor.closeDoor();
        carDoor.openWindow();
        carDoor.showDoor();
    }
}
