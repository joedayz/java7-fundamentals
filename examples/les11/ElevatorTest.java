

public class ElevatorTest {

   public static void main(String args[]) {
     
     Elevator privElevator = new Elevator();
     
     privElevator.openDoor();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.goUp();
     privElevator.goUp();
     privElevator.openDoor();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.openDoor();
     privElevator.goDown();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.goDown();

     int curFloor = privElevator.getFloor();
     
     if (curFloor != 5 && ! privElevator.getDoorStatus()) {
         privElevator.setFloor(5);
     }

     privElevator.setFloor(10);
     privElevator.openDoor();
   }
}
