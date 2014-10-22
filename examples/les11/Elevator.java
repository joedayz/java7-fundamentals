


public class Elevator {

    private boolean doorOpen = false;
    private int currentFloor = 1;
    private final int TOP_FLOOR = 5;
    private final int BOTTOM_FLOOR = 1;

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp() {
        if (!doorOpen) {
            if (currentFloor < TOP_FLOOR) {
                currentFloor++;
                System.out.println(currentFloor);
            } else {
                System.out.println("Already on top floor.");
            }
        } else {
            System.out.println("Doors still open!");
        }
    }

    public void goDown() {
        if (!doorOpen) {
            if (currentFloor > BOTTOM_FLOOR) {
                currentFloor--;
                System.out.println(currentFloor);
            } else {
                System.out.println("Already on bottom floor.");
            }
        } else {
            System.out.println("Doors still open!");
        }
    }

    public void setFloor(int desiredFloor) {
        if ((desiredFloor >= BOTTOM_FLOOR) && (desiredFloor <= TOP_FLOOR)) {

            while (currentFloor != desiredFloor) {
                if (currentFloor < desiredFloor) {
                    goUp();
                } else {
                    goDown();
                }
            }
        } else {
            System.out.println("Invalid Floor");
        }
    }

    public int getFloor() {
        return currentFloor;
    }

    public boolean getDoorStatus() {
        return doorOpen;
    }
}
