import java.util.ArrayList;

public class GroceryList
{
    private ArrayList <GroceryItemOrder>Cart=new ArrayList<>();
    public GroceryList(){}
    public void add(GroceryItemOrder item){
        Cart.add(item);
    }
    public double getTotalCost(){
        double result=0;
        for (int i=0;i<Cart.size();i++)
        {
            result = result + Cart.get(i).getCost();
        }
        return result;
    }
//    int x = 1;
//    public double RecgetTotalCost(){
//    if (Cart.size()-x>=0)
//        return (Cart.get(Cart.size()-x++)).getCost()+getTotalCost();
//    return 0;
//    }
//    public static Integer max(ArrayList<Integer> list){
//        if(list == null||list.size()==0)
//            return 0;
//        int max= list.get(0);;
//        for (Integer i: list) {
//            if(list.get(i)>max)
//                max= list.get(i);
//        }
//        return max;
//        }
//public static void sort(ArrayList<Integer> list){
//    int temp = 0;
//    for(int i=0; i < list.size(); i++){
//        for(int j=1; j < (list.size()-i); j++){
//            if(list.get(j-1) > list.get(j)){
//                temp = list.get(j-1);
//                list.set(j-1,list.get(j));
//                list.set(j,temp);
//            }
//
//        }
//    }
//}
}
