package Adminisrate_branch;

import java.util.Scanner;

public class Showroom  implements  inplement {
   String S_name;
    String S_add;
    String S_MAnager_nmae;
    int no_imp;
    int Car_Stock;

    @Override
    public void get_Details() {
        System.out.println("SHOWROOM NAME:         "+S_name);
        System.out.println("SHOWROOM ADDRESS:      "+S_add);
        System.out.println("SHOWROOM MANAGER NAME: "+S_MAnager_nmae);
        System.out.println("NUMBER OF EMPLOYEES:   "+no_imp);
        System.out.println("SHOWROOM CARS STOCK:   "+Car_Stock);
    }

    @Override
    public void set_Details() {
        Scanner ss=new Scanner(System.in);
        System.out.println();
        System.out.println("+++++++++++++++++ ENTER SHOWROOM DETAILS +++++++++++++++");
        System.out.println();
        System.out.println("ENTER SHOWROOM NAME:         ");
        S_name=ss.next();
        System.out.println("ENTER SHOWROOM ADDRESS:      ");
        S_add= ss.next();
        System.out.println("ENTER SHOWROOM MANAGER NAME: ");
        S_MAnager_nmae= ss.next();
        System.out.println("ENTER NUMBER OF EMPLOYEES:   ");
        no_imp= ss.nextInt();
        System.out.println("ENTER CAR STOCK:         ");
        Car_Stock= ss.nextInt();

    }
}
