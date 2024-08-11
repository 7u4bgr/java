import java.util.HashMap;

public class AddContact {
    private HashMap<String,Integer> rehber;
    public AddContact(HashMap<String, Integer> rehber) {
        this.rehber = rehber;
    }

    public void addContact(String name, int number) {
        rehber.put(name, number);
        System.out.println("Contact added: Name - " + name + ", Phone Number - " + number);
    }
}
