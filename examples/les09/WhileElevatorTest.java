public class WhileElevatorTest {

   public static void main(String args[]) {
     
    WhileElevator myElevator = new WhileElevator();
     
     myElevator.openDoor();
     myElevator.closeDoor();
     myElevator.goUp();
     myElevator.goUp();
     myElevator.goUp();
     myElevator.openDoor();
     myElevator.closeDoor();
     myElevator.goDown();
     myElevator.openDoor();
     myElevator.closeDoor();
     myElevator.goDown();
     myElevator.setFloor();
     myElevator.openDoor();
   }
}
