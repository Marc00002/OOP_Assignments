public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;
    public GroceryItemOrder (String name, double pricePerUnit,int quantity){
        this.name=name;
        this.pricePerUnit=pricePerUnit;
        this.quantity=quantity;
    }
    public GroceryItemOrder (String name, double pricePerUnit){
        this.name=name;
        this.pricePerUnit=pricePerUnit;
    }
    public double getCost(){
        return quantity*pricePerUnit;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

}
