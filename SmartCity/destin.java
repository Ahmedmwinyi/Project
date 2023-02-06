public class destin extends index {

    int available[] = new int[5];

    public void welcomeIn() {
        System.out.println("**************************************************");
        System.out.println("**   DESTINATION              |  AREA           **");
        System.out.println("***************************************");
        System.out.println("** 1.)Zanzibar Airport        |   Urban West    **");
        System.out.println("** 2.)Zanzibar Seaport        |   Urban West    **");
        System.out.println("**************************************************");
        System.out.println("***************************************************\n");
    }

    public void studentsPotal() {
        System.out.println("1. Maktaba Kuu(Miembeni).");
        System.out.println("2. SUZA Library.");
        System.out.println("3. Universities.");
        System.out.println("Choose One");

        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("------WELCOME MAKTABA KUU-------");
                System.out.println(
                        "Maktaba Kuu of Zanzibar was fisrt established on 1987 under the chief engineer Ahmed Janu.");
                System.out.println(
                        "It is located at Zanzibar town (Miembeni) 12.7Km away from Zanzibar Airpot. And 1.4Km from Sea port.");
                System.out.println(
                        "The Maktaba collect moore than 10,000 books in it. Political, History, Scientific, Economic and many other which can be ready by anyone in the societies.");
                System.out.println("Primary School, Secondary, University even mysterious story.");
                System.out.println("The Maktaba was ploted in the area of 2000feets.");
                System.out.println("--------THANK YOU-----------");
                break;
            case 2:
                System.out.println("--------SUZA LIBRARY-------");
                System.out.println(
                        "Suza Library one of the oldest library in Zanzibar which established in 1999 under the chancellor Hamadi Kheir. It is Located south region 17km from Zanzibar town and 19.3 from Zanzibar Airpot.\nThe Library is mainly used by the SUZA students. The SUZA library have more than 3,200 books in.\nThe library is estimated takes area of 3400feets.");
                System.out.println("--------THANK YOU-----------");
                break;
            case 3:

        }
    }

    public void touristPortal() {
        System.out.println("1. Historical Site");
        System.out.println("2. Hotels.");
        System.out.println("Choose One");

        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("**************************************************");
                System.out.println("**   SITE                       |      AREA     **");
                System.out.println("**************************************************");
                System.out.println("** 1.)Ngome Kongwe(Old Fort)    |   Mjini       **");
                System.out.println("** 2.)Maruhubi Site             |   Mjini       **");
                System.out.println("**************************************************");

                break;
            case 2:
                System.out.println("**************************************************");
                System.out.println("**   HOTEL           |**");
                System.out.println("**************************************************");
                System.out.println("** 1.)Hotel Verde    |**");
                System.out.println("** 2.)Tembo Hotel    |**");
                System.out.println("**************************************************");
                int y = sc.nextInt();
                switch (y) {
                    case 1:
                        System.out.println("--------HOTEL VERDE ZANZIBAR-----------");
                        System.out.println("Location    : Mtoni, Mjini Zanzibar");
                        System.out.println(
                                "Distance in Km  : \nFrom Zaznibar Airport : 12.3Km\nFrom Zanzibar Seaport : 2.4Km");
                        System.out.println("Room Class:");
                        System.out.println("1.)Royal Room:\n.2.)VIP Room:\n3.)Family Room:");
                        break;
                    case 2:
                        System.out.println("--------HOTEL VERDE ZANZIBAR-----------");
                        System.out.println("Location    : Mtoni, Mjini Zanzibar");
                        System.out.println(
                                "Distance in Km  : \nFrom Zaznibar Airport : 12.3Km\nFrom Zanzibar Seaport : 2.4Km");
                        System.out.println("Room Class:");
                        System.out.println("1.)Royal Room:\n.2.)VIP Room:\nFamily Room:");
                }
        }
    }

}