package duke.item;

public class Shirt extends Clothing implements Returnable {

    public Shirt (int itemID, String description, char colorCode, double price, int quantityInStock) {
      super( itemID,  description,  colorCode, price, quantityInStock);
    }

    public String doReturn() {
        return("Send it back");
    }

  public void setColorCode(char newCode) {
     switch (newCode) {
  	      case 'R': 
        case 'G': 
  	      case 'B':
        setColorCode(newCode);
  	      break;
  	      default:
  	      throw new IllegalArgumentException("Invalid colorCode. Use R, G, or B");
  	   }
 }

}
