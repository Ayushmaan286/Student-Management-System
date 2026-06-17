import java.util.*;

class system {

    void add_student() {
        System.out.println("add student");

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
                    break;

                default:
                    System.out.println(" Wrong choice ");
                    break;

            }

        }

    }
}