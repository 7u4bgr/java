import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> kontakt = new HashMap<>();
        AddContact addContact = new AddContact(kontakt);
        RemoveContact removeContact = new RemoveContact(kontakt);
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (add, remove, list, exit):");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    addContact.addContact(name, phoneNumber);
                    break;

                case "remove":
                    System.out.println("Enter name of the contact to remove:");
                    name = scanner.nextLine();
                    removeContact.removeContact(name);
                    break;

                case "list":
                    System.out.println("Contacts:");
                    for (String key : kontakt.keySet()) {
                        System.out.println("Name: " + key + ", Phone Number: " + kontakt.get(key));
                    }
                    break;

                case "exit":
                    scanner.close();
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Unknown command. Please try again.");
                    break;
            }
        }
    }
}
