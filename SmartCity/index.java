import java.util.Scanner;

public abstract class index {

    Scanner sc = new Scanner(System.in);
    int end;

    public void mainMenu() {
        // the MAIN MENU//
        int x = 0;
        System.out.println("****************************");
        System.out.println("** ZANZIBAR SMART CITY    **");
        System.out.println("****************************");
        System.out.println("** [1] Destination        **");
        System.out.println("** [2] Students           **");
        System.out.println("** [3] Tourists           **");
        System.out.println("** [4] Exit               **");
        System.out.println("****************************");
        System.out.println("****************************\n");

        try {
            System.out.print("ENTER CHOICE: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    welcomeIn();
                    break;
                case 2:
                    studentsPotal();
                case 3:
                    touristPortal();
                    break;
                case 4:
                    end = 1;
                    x = 0;
                    System.out.println("Thank You!");
            }
        } catch (Exception e) {
            System.out.println("Connection Failed!");
        }

    }

    public abstract void welcomeIn();

    public abstract void studentsPotal();

    public abstract void touristPortal();
}