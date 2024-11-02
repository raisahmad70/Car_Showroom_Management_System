package Adminisrate_branch;
import java.util.Scanner;
import java.util.UUID;
public class Employee extends Showroom implements inplement  {

    String E_name;
    String E_age;
    String E_department;
    UUID uid=UUID.randomUUID();

    @Override
    public void get_Details() {
        System.out.println("EMPLOYEE ID:         "+uid);
        System.out.println("EMPLOYEE NAME:       "+E_name);
        System.out.println("EMPLOYEE AGE:        "+E_age);
        System.out.println("EMPLOYEE DEPARTMENT: "+E_department);
        System.out.println("SHOWROOM NAME:       "+super.S_name);
    }

    @Override
    public void set_Details() {
        Scanner ss2=new Scanner(System.in);
        System.out.println();
        System.out.println("+++++++++++++++ ENTER EMPLOYEE DETAILS ++++++++++++++");
        System.out.println();
        System.out.println("ENTER EMPLOYEE NANE:       ");
        E_name= ss2.next();
        System.out.println("ENTER EMPLOYEE AGE:        ");
        E_age= ss2.next();
        System.out.println("ENTER EMPLOYEE DEPARTMENT: ");
        E_department= ss2.next();

    }
}
interface inplement
{

    void get_Details();
    void set_Details();
}
