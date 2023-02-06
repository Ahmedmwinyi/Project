import java.util.Scanner;

/**
 * HistoricalSite
 */
public class HistoricalSite extends destin {
    Scanner sc = new Scanner(System.in);

    public void displayHotel() {
        System.out.println("**************************************************");
        System.out.println("**   HOTEL           |**");
        System.out.println("**************************************************");
        System.out.println("** 1.)Hotel Verde    |**");
        System.out.println("** 2.)Tembo Hotel    |**");
        System.out.println("**************************************************");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("--------HOTEL VERDE ZANZIBAR-----------");
                System.out.println("Location    : Mtoni, Mjini Zanzibar");
                System.out.println("Distance in Km  : \nFrom Zaznibar Airport : 12.3Km\nFrom Zanzibar Seaport : 2.4Km");
                System.out.println("Room Class:");
                System.out.println("1.)Royal Room:\n.2.)VIP Room:\nFamily Room:");
                if (x == 1) {

                }
                break;

            default:
                break;
        }
    }
}