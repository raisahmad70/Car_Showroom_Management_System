package Adminisrate_branch;

import java.util.Scanner;

public class Main extends Showroom {
    static void manu()
    {
        System.out.println();
        System.out.println();
        System.out.println("|+++++++++ WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM ++++++++++|");
        System.out.println();
        System.out.println(" 1] ADD SHOWROOM: \t\t2]ADD EMPLOYEE:\t\t3]ADD CAR:");
        System.out.println();
        System.out.println(" 4] GET SHOWROOM: \t\t5]GET EMPLOYEE:\t\t6]GET CAR:");
        System.out.println();
        System.out.println("|+++++++++++++++++++++++++ 0] FOR EXIT +++++++++++++++++++++++++|");
        System.out.println();
        System.out.println("|++++++++++++++++++++++ ENTER YOUR CHOICE ++++++++++++++++++++++|");
    }
    public static void main(String[] args) throws NullPointerException {
        Scanner Sca=new Scanner(System.in);
        Showroom[] Asr =new Showroom[10];
        Employee[] Aem =new Employee[10];
        car[] Acar =new car[10];
        int Showroom_counter=0;
        int Employee_counter=0;
        int Car_counter=0;
        int choice;
        do {
            manu();
           choice= Sca.nextInt();
            while (choice!=0&&choice!=10)
            {
                switch (choice)
                {
                    case 1:
                        Asr[Showroom_counter]=new Showroom();
                        Asr[Showroom_counter].set_Details();
                        Showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD SHOWROOM:");
                        System.out.println();
                        System.out.println("10].GO TO MANU:");
                        choice=Sca.nextInt();
                        break;
                    case 2:
                        Aem[Employee_counter]=new Employee();
                        Aem[Employee_counter].set_Details();
                        Employee_counter++;
                        System.out.println();
                        System.out.println("2].ADD EMPLOYEE:");
                        System.out.println();
                        System.out.println("10].GO TO MANU:");
                        choice=Sca.nextInt();
                        break;
                    case 3:
                        Acar[Car_counter]=new car();
                        Acar[Car_counter].set_Details();
                        Car_counter++;
                        System.out.println();
                        System.out.println("3].ADD CAR:");
                        System.out.println();
                        System.out.println("10].GO TO MANU:");
                        choice=Sca.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < Showroom_counter; i++) {
                            Asr[i].get_Details();
                            System.out.println();
                        }
                        System.out.println("10].GO TO MANU:");
                        System.out.println("0].FOR EXIT:");
                        System.out.println();
                        choice=Sca.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < Employee_counter; i++) {
                            Aem[i].get_Details();
                            System.out.println();
                        }
                        System.out.println("10].GO TO MANU:");
                        System.out.println("0].FOR EXIT:");
                        System.out.println();
                        choice=Sca.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < Car_counter; i++) {
                            Acar[i].get_Details();
                            System.out.println();
                        }
                        System.out.println("10].GO TO MANU:");
                        System.out.println("0].FOR EXIT:");
                        System.out.println();
                        choice=Sca.nextInt();
                        break;

                    default:
                        System.out.println("ENTERED INVALID CHOICE");
                }
            }

        }while (choice!=0);



    }
}