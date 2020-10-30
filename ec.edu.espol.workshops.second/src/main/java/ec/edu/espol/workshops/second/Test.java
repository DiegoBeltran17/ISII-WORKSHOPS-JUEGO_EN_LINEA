package ec.edu.espol.workshops.second;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static final Scanner sc = new Scanner(System.in, "UTF-8");
	
	public static void main(String args[])
	{
		//Customer validCustomer = new Customer(22, 'M', true, true); Example Valid Customer
	    //Customer noValidCustomer = new Customer(30, 'F', false, false); Example Nor Valid Customer

        boolean salir = false;
        int opcion; //Save options
 
        while (!salir) {
        	System.out.println("-- Good Morning --");
            System.out.println("1) Enter customer data");
            System.out.println("2) Exit");

            try {
 
                System.out.println("Write one of the options: ");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                    	menu();
                        break;
                    case 2:
                    	System.out.println("Good Bye!!! ");
                    	salir = true;
                        break;
                    default:
                        System.out.println("Just numbers between 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not correct value");
                sc.next();
            }
        }
 
	}
	public static void menu()
	{
		System.out.println("Write the age: ");
        int age = sc.nextInt();	
        
        System.out.println("Write the sex (M/F): ");
        char sex = sc.next().charAt(0);
        char m = 'M';
        char f = 'F';
        if(sex == m || sex == f) {
        	System.out.println("Is married?(true/false): ");
            boolean isMarried = sc.nextBoolean();
            
            System.out.println("Has licensed?(true/false): ");
            boolean hasValidDriverLicense = sc.nextBoolean();
            
            Customer validCustomer = new Customer(age, sex, isMarried, hasValidDriverLicense);
            CarInsurance carInsurance = new CarInsurance();
            int valid = carInsurance.checkCredentials(validCustomer);
            
            if(valid == 1)
    		{
            	System.out.println("Valid Customer!!");
            	System.out.println(carInsurance.checkCredentials(validCustomer));
    		}else {
    			System.out.println("Not Valid Customer!!");
            	System.out.println(carInsurance.checkCredentials(validCustomer));
    		}	
        }else {
        	menu();
        }
	}
}
