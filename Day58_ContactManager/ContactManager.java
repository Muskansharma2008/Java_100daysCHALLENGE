import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ContactManager {

    // ArrayList to store contacts
    static ArrayList<Contact> contacts = new ArrayList<>();

    // Scanner for user input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGER =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    updateContact();
                    break;

                case 5:
                    deleteContact();
                    break;

                case 6:
                    sortContacts();
                    break;

                case 7:
                    System.out.println("Thank you for using Contact Manager!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }

    // 1. Add Contact
    static void addContact() {

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);

        System.out.println("Contact added successfully!");
    }

    // 2. View Contacts
    static void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\n===== ALL CONTACTS =====");

        for (Contact c : contacts) {
            c.displayContact();
        }
    }

    // 3. Search Contact
    static void searchContact() {

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Contact c : contacts) {

            if (c.name.equalsIgnoreCase(name)) {
                c.displayContact();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // 4. Update Contact
    static void updateContact() {

        System.out.print("Enter name of contact to update: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Contact c : contacts) {

            if (c.name.equalsIgnoreCase(name)) {

                System.out.print("Enter new phone: ");
                c.phone = sc.nextLine();

                System.out.print("Enter new email: ");
                c.email = sc.nextLine();

                System.out.println("Contact updated successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // 5. Delete Contact
    static void deleteContact() {

        System.out.print("Enter name of contact to delete: ");
        String name = sc.nextLine();

        boolean removed = contacts.removeIf(
                c -> c.name.equalsIgnoreCase(name)
        );

        if (removed) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // 6. Sort Contacts
    static void sortContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts to sort.");
            return;
        }

        contacts.sort(Comparator.comparing(c -> c.name));

        System.out.println("Contacts sorted by name!");

        viewContacts();
    }
}
