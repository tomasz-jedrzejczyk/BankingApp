import java.util.Scanner;

public class BankingApp {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        System.out.print("How many number of customers do you want to input? ");
        int numberOfNewAccounts = sc.nextInt();
        BankDetails tableOfNewClients[] = new BankDetails[numberOfNewAccounts];
        for (int i = 0; i < tableOfNewClients.length; i++) {
            tableOfNewClients[i] = new BankDetails();
            tableOfNewClients[i].openAccount();
            tableOfNewClients[i].showAccount();
        }
        // loop runs until number 5 is not pressed to exit
        int inputNumber;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1:
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        tableOfNewClients[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        found = tableOfNewClients[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        found = tableOfNewClients[i].search(ac_no);
                        if (found) {
                            tableOfNewClients[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        found = tableOfNewClients[i].search(ac_no);
                        if (found) {
                            tableOfNewClients[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (inputNumber != 5);
    }
}