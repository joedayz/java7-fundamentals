

public class ElevatorTestFail {

  public static void main(String args[]) {
    
    Elevator theElevator = new Elevator();
    
    /**************************************************
    * The following lines of code will not compile    *
    * because they attempt to access private          *
    * variables.                                      *
    **************************************************/
/*
    theElevator.doorOpen = true;  //passengers get on
    theElevator.doorOpen = false; //doors close
    //go down to currentFloor 0 (below bottom of building)
    theElevator.currentFloor--;
    theElevator.currentFloor++;

    //jump to currentFloor 7 (only 5 floors in building)
    theElevator.currentFloor = 7;
    theElevator.doorOpen = true;  //passengers get on/off
    theElevator.doorOpen = false;
    theElevator.currentFloor = 1; //go to the first floor
    theElevator.doorOpen = true;  //passengers get on/off
    theElevator.currentFloor++;   //elevator moves with door open
    theElevator.doorOpen = false;
    theElevator.currentFloor--;
    theElevator.currentFloor--;
 * 
 */
  }
}
