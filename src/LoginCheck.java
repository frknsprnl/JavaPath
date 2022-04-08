import java.util.Scanner;
public class LoginCheck {
    public static void main(String[] args) {

        String name, passwd, reset, newPasswd;
        String userName = "Furkan", userPasswd = "java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        name = input.nextLine();

        System.out.print("Password: ");
        passwd = input.nextLine();
        // Log-in check
        if ( (name.equals(userName)) && passwd.equals(userPasswd) ) {
            System.out.print("You've logged in.");
        }
        // name is valid but passwd is wrong --> change passwd
        else if (name.equals(userName) == true && passwd.equals(userPasswd) == false) {
            System.out.println("Your password is wrong.");
            System.out.println("Do you want to change your password? y / n ");
            reset = input.nextLine();
            switch (reset) {
                case "y" :
                    System.out.print("Enter new password: ");
                    newPasswd = input.nextLine();

                    if (newPasswd.equals(passwd)  || newPasswd.equals(userPasswd)  ) {
                        System.out.println("Please try another password.");
                    }
                    else {
                        userPasswd = newPasswd;
                        System.out.println("Your new password created.");
                        // after new password created - login with new passwd
                        System.out.print("Username: ");
                        name = input.nextLine();

                        System.out.print("Password: ");
                        passwd = input.nextLine();

                        if ( (name.equals(userName)) && passwd.equals(userPasswd) ) {
                            System.out.print("You've logged in.");
                        }
                        else {
                            System.out.println("Your username or password is incorrect.");
                        }
                    }
                    break;

                case "n" :
                    System.out.println("Keep trying. :)");
                    break;

                default:
                    System.out.println("If you want to change your password enter 'y'");
            }
        }
        else {
            System.out.println("Your username or password is incorrect.");

        }



    }
}
