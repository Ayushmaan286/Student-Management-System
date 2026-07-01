import java.util.*;

public class system extends management
 {
    public static void main(String[] args)
     {
        int i=1;
        Scanner sc = new Scanner(System.in);
        system obj = new system();
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

 class management { 

    private int id,age;
    private String name,course;
    private int count_entry=0;

    int id_array[]=new int[100];
    String name_array[]=new String[100];
    int age_array[]=new int[100];
    String course_array[]=new String[100];

    Scanner sc= new Scanner(System.in);

    void add_student() {

        System.out.print("ID: ");
        id=sc.nextInt();

        id_array[count_entry]=id;

        sc.nextLine(); //solved the bug that int takes only the digital part and ignores the "\n" inserted by the OS

        System.out.print("Name(FULL NAME): ");
        name=sc.nextLine();

        name_array[count_entry]=name;

        System.out.print("Age(18-70): ");
        age=sc.nextInt();

        age_array[count_entry]=age;

        sc.nextLine(); //solved the bug that int takes only the digital part and ignores the "\n" inserted by the OS


        System.out.print("Course (CSE/IT/ME/EE/EEE/CE): ");
        course=sc.nextLine();

        course_array[count_entry]=course;

        count_entry++;

    }

    void view_student() {

        if(count_entry>0)
        {
          for(int i=0;i<count_entry;i++)
         {
           System.out.println("==================================");
           System.out.println("ID:"+id_array[i]);
           System.out.println("Name:"+name_array[i]);
           System.out.println("Age:"+age_array[i]);
           System.out.println("Course:"+course_array[i]);
           System.out.println("==================================");
         }
        }
        else
        {
            System.out.println("empty data");
        }

    }

    void search_student() {
        int found=0;
        System.out.println("Enter Id to be searched ");
        int search_id=sc.nextInt();
        for( int i=0;i<count_entry; i++)
            {
                if(id_array[i]==search_id)
                {
                    found=1;
                    System.out.println("======Student Found======");
                    System.out.println("ID:"+id_array[i]);
                    System.out.println("Name:"+name_array[i]);
                    System.out.println("Age:"+age_array[i]);
                    System.out.println("Course:"+course_array[i]);
                }
            }
            if(found==0)
            {
                    System.out.println("Student Not Found !!!! ");
            }        

    }

    void update_student() {
        int found=0;
        int i;
        System.out.println("Enter Student ID: ");
        int edit_id=sc.nextInt(); //id can be present or can not be present also
        for( i=0;i<count_entry;i++)
        {
            if(id_array[i]==edit_id)
            {
               found=1;
               break;     
            }
        }
        if(found==0)
        {
            System.out.println("ID does not exist");       
        }
        else 
        {
            System.out.println("ID Found");
            System.out.println("What do you want to update ? \n1.Name \n2.Age \n3.Course \n4.All details ");
            int edit_choice=sc.nextInt();
            sc.nextLine();
            switch(edit_choice)
            {
                case 1:
                    System.out.println("Enter updated Name");
                    String new_name=sc.nextLine();
                    name_array[i]=new_name;
                    System.out.println("Name updation succesfull");
                    break;
                case 2:
                    System.out.println("Enter updated Age");
                    int new_age=sc.nextInt();
                    sc.nextLine(); 
                    age_array[i]=new_age;
                    System.out.println("Age updation succesfull");
                    break; 
                case 3:
                    System.out.println("Enter updated Course");
                    String new_course=sc.nextLine();
                    course_array[i]=new_course;
                    System.out.println("Course updation succesfull");
                    break; 
                case 4:
                    System.out.println("Enter updated Name");
                    new_name=sc.nextLine();
                    name_array[i]=new_name;

                    System.out.println("Enter updated Age");
                    new_age=sc.nextInt();
                    sc.nextLine(); 
                    age_array[i]=new_age;

                    System.out.println("Enter updated Course");
                    new_course=sc.nextLine();
                    course_array[i]=new_course;
                    break;
                default:
                    System.out.println("Wrong Choice");   
            }
        }
    }

    void delete_student() {
        int found=0;
        int loop=0;
        System.out.println("Enter ID to be deleted ");
        int del_id=sc.nextInt();
        for( int i=0;i<count_entry;i++)
        {
            if(id_array[i]==del_id)
            {
               found=1;
               loop=i;
               break;     
            }
        }
        if(found==0)
        {
            System.out.println("ID does not exist");       
        }
        else
        {
            for(int i=loop;i<(count_entry-1);i++)
            {
              id_array[i]=id_array[i+1];
              name_array[i]=name_array[i+1];
              age_array[i]=age_array[i+1];
              course_array[i]=course_array[i+1];         
            }
             count_entry--;
             System.out.println("Deletion Successful");

        }
        
    }

    
}