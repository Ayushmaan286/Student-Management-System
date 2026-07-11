import java.util.*;

public class Main extends management
 {
    public static void main(String[] args)
     {
        int i=1;
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("This prototype is currently using array and can only score upto 100 size");        
        System.out.println("====== Student Management System ======");

        while (i > 0) {
            i++; // never ending loop
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Students");
            System.out.println("4. Update Students");
            System.out.println("5. Delete Students");
            System.out.println("6. Exit");
            int input=-1;
            try
            {
                 input = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Try Again");
                sc.nextLine();
                try
                {
                  input = sc.nextInt();
                }
                 catch(Exception e1)
                {
                System.out.print("===============Program Terminated==============");
                System.exit(0); 
                }
            }
            
            switch (input) {
                case 1:
                    obj.add_student();
                    break;
                case 2:
                    obj.view_student();
                    break;
                case 3:
                    obj.search_student();
                    break;
                case 4:
                    obj.update_student();
                    break;
                case 5:
                    obj.delete_student();
                    break;
                case 6:
                    System.out.println("Thank You !!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Wrong choice ");
                    break;
                
            }
            
        }
        sc.close();
    }
}