public class IfElseElevator {

  public boolean doorOpen=false; // Doors are closed by default
  public int currentFloor = 1; // All elevators start on first floor
  public final int TOP_FLOOR = 10;
  public final int MIN_FLOORS = 1;
  
  public void openDoor() {
    System.out.println("Opening door.");
    doorOpen = true;
    System.out.println("Door is open.");
  }
  
  public void closeDoor() {
    System.out.println("Closing door.");
    doorOpen = false;
    System.out.println("Door is closed.");
  }

  public void goUp() {
    System.out.println("Going up one floor.");
    currentFloor++;
    System.out.println("Floor: " + currentFloor);
  }

  public void goDown() {

    if (currentFloor == MIN_FLOORS) {
      System.out.println("Cannot Go down");
    }
    
    else {
      System.out.println("Going down one floor.");
      currentFloor--;
      System.out.println("Floor: " + currentFloor);
    }
  }


}
