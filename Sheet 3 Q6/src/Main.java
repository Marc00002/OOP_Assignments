public class Main {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        list.add(new GroceryItemOrder("Cigarettes",5,2));
        list.add(new GroceryItemOrder("Milk",10,3));
        list.add(new GroceryItemOrder("Mint",4,4));
        list.add(new GroceryItemOrder("Cola",3,1));
        System.out.println(list.getTotalCost());
    }
}