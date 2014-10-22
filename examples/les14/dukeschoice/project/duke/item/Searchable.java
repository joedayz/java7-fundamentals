package duke.item;

public interface Searchable {
    public void display();
    public double getPrice();
    public String getDescription();
    public int getItemID();
    public String getDisplay();
    public String getDisplay(String separator);
    public String getSku();
    public int getQuantityInStock();
    public void setQuantityInStock(int quantityInStock);
}
