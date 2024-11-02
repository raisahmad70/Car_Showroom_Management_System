package Adminisrate_branch;


import java.util.Scanner;

public class car extends Showroom implements inplement
{
    String C_name;
    String C_color;
    String C_full_type;
    String C_Transmission;
    int c_price;

    public void get_Details() {

        System.out.println("CAR NAME:         "+C_name);
        System.out.println("CAR COLOR:        "+C_color);
        System.out.println("CAR FUEL TYPE:    "+ C_full_type);
        System.out.println("CAR TRANSMISSION: "+C_Transmission);
        System.out.println("CAR PRICE:        "+ c_price);

    }

    @Override
    public void set_Details() {
        System.out.println();
        System.out.println("+++++++++++++++ ENTER CAR DETAILS +++++++++++++++");
        System.out.println();
        Scanner ss1=new Scanner(System.in);
        System.out.println("INTER CAR NAME:      ");
         C_name=ss1.next();
        System.out.println("INTER CAR COLOR:     ");
        C_color=ss1.next();
        System.out.println("INTER CAR FUEL TYPE: ");
        C_full_type =ss1.next();
        System.out.println("INTER CAR TRANSMISSION:");
        C_Transmission=ss1.next();
        System.out.println("INTER CAR PRICE:     ");
        c_price=ss1.nextInt();

    }
}
