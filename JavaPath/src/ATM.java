import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        String userName, password;
        int right = 3, selection;
        int balance = 1500;
        Scanner input = new Scanner(System.in);

        while (right > 0) {

            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("furkan") && password.equals("123")) {
                System.out.println("Hey! Welcome to X Bank!");
                System.out.println("Please select an action: ");
                System.out.println("1- Deposit\n2- Withdraw\n3- Balance\n4- Logout");
                selection = input.nextInt();
                switch (selection){
                    case 1: {
                        System.out.println("Current balance: " + balance);
                        System.out.print("Please enter the amount to deposit: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Current balance: " + balance);
                        break;
                    }
                    case 2: {
                        System.out.println("Current balance: " + balance);
                        System.out.print("Please enter the amount to withdraw: ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Insufficient balance.");
                        }else
                        {
                            balance -= price;
                            System.out.println("Current balance: " + balance);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Current balance: " + balance);
                        break;
                    }
                    case 4: {
                        System.out.println("You've successfully been logged out.");
                        break;
                    }
                    default : {
                        System.out.println("You've logged out.");
                    }
                }
                break;
            } else {
                --right;
                if (right == 0){
                    System.out.println("Your account is blocked. Please contact with bank.");
                } else {
                    System.out.println("Username or password is wrong. Try again.");
                    System.out.println("Remaining right: " + right);
                }

            }
        }




    }
}
