public class ForElevatorTest {

   public static void main(String args[]) {
     
    ForElevator myElevator = new ForElevator();
     
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
