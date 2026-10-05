import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBill = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n------ HOTEL MANAGEMENT SYSTEM ------");
            System.out.println("1. Pizza      - 150");
            System.out.println("2. Burger     - 80");
            System.out.println("3. Sandwich   - 50");
            System.out.println("4. Tea        - 20");
            System.out.println("5. Coffee     - 30");
            System.out.println("6. View Bill");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice (1-7): ");

            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                String item = "";
                int price = 0;

                switch (choice) {
                    case 1: item = "Pizza"; price = 150; break;
                    case 2: item = "Burger"; price = 80; break;
                    case 3: item = "Sandwich"; price = 50; break;
                    case 4: item = "Tea"; price = 20; break;
                    case 5: item = "Coffee"; price = 30; break;
                }

                System.out.print("Enter quantity of " + item + ": ");
                int qty = scanner.nextInt();
                int itemTotal = price * qty;
                totalBill += itemTotal;
                
                System.out.println("Added " + qty + " " + item + "(s) - Bill:" + itemTotal);

            } else if (choice == 6) {
                System.out.println("\n------ BILL ------");
                System.out.println("Total Amount: " + totalBill);
                System.out.println("------------------");
                
            } else if (choice == 7) {
                System.out.println("\nThank you! Visit Again ");
                running = false;
                
            } else {
                System.out.println(" Invalid choice! Please select from 1 to 7.");
            }
        }
        
        scanner.close();
    }
}
