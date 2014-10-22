class ClassMapTest{

  public static void main(String args[]){
    // creating ChallengeClassMap instance
    ClassMap cm =new ClassMap();
    
    // Initialize the array
    cm.setClassMap();

    // Allocating position to one student
    cm.name = "Ann";
    cm.setDesk();

    //Allocating position to another student
    cm.name = "Bond";
    cm.setDesk();

    //Allocating position to third student
    cm.name = "Cindy";
    cm.setDesk();

    //Allocating position to fourth student
    cm.name = "Donald";
    cm.setDesk();
    

    //Displaying the map of the class 
    cm.displayDeskMap();
    
    //Challenge Lab:  Searching the desk of a student 
    cm.name = "Donald";
    cm.searchDesk();

   //Challenge Lab: Searching the desk of another student 
    cm.name = "Ronn";
    cm.searchDesk();
  } //end main
 }//end class

