public class DoWhileElevator {

  public boolean doorOpen=false;
  public int currentFloor = 1;

  public final int TOP_FLOOR = 5;
  public final int BOTTOM_FLOOR = 1;
  
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
    System.out.println("Going down one floor.");
    currentFloor--;
    System.out.println("Floor: " + currentFloor);
  }
  
  public void setFloor() {

    // Normally you would pass the desiredFloor as an argument to the 
    // setFloor method. However, because you have not learned how to 
    // do this yet, desiredFloor is set to a specific number (5) 
    // below.

    int desiredFloor = 5;

    do {
      if (currentFloor < desiredFloor) {
	      goUp();
      }
	  else if (currentFloor > desiredFloor) {
	      goDown();
      }
    }
    while (currentFloor != desiredFloor);
  }


}
