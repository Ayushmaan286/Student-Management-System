import java.util.*;

class system {
    private int id,age;
    private String name,course;

    Scanner sc= new Scanner(System.in);

    void add_student() {

        System.out.print("ID: ");
        id=sc.nextInt();

        sc.nextLine(); //solved the bug that int takes only the digital part and ignores the "\n" inserted by the OS

        System.out.print("Name(FULL NAME): ");
        name=sc.nextLine();

        System.out.print("Age(18-70): ");
        age=sc.nextInt();

        sc.nextLine();

        System.out.print("Course(CSE/IT/ME/EE/EEE/CE): ");
        course=sc.nextLine();

        int id_array[]=new int[100];
        String name_array[]=new String[100];
        int age_array[]=new int[100];
        String course_array[]=new String[100];
        


    }

    void view_student() {
        System.out.println("view student");

    }

    void search_student() {
        System.out.println("search student");

    }

    void update_student() {
        System.out.println("update student");

    }

    void delete_student() {
        System.out.println("delete student");

    }

    public static void main(String[] args) {
        int i=1;

        while (i > 0) {
            i++; // never ending loop
            System.out.println("This prototype is currently using array and can only score upto 100 size");        
            System.out.println("====== Student Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Students");
            System.out.println("4. Update Students");
            System.out.println("5. Delete Students");
            System.out.println("6. Exit");
            Scanner sc = new Scanner(System.in);
            system obj = new system();
            int input = sc.nextInt();
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
                    // sc.close();
                    break;

                default:
                    System.out.println(" Wrong choice ");
                    break;

            }


        }

    }
}