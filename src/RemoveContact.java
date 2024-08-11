import java.util.HashMap;

public class RemoveContact {
    private HashMap<String ,Integer> silmek;
    public RemoveContact(HashMap<String,Integer> silmek){
        this.silmek=silmek;
    }
    public void removeContact(String name){
        if(silmek.containsKey(name)){
            silmek.remove(name);
            System.out.println("Contact removed: Name " + name);


        }else{
            System.out.println("Ad Tapilmadi");
        }
    }


}
