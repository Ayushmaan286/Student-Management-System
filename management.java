 import java.util.*;
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

        if(count_entry>99) //bug 2 sorted 
        {
            System.out.println("Database is full");
            return;
        }

        try
        {
            id=-1;// makes sure the id is always positive 
            while (id<0) 
            {
                System.out.print("ID: ");
                id=sc.nextInt();
            }
                                
        }
        catch(Exception e)
        {
            System.out.println("please try again" );
            sc.nextLine();
            add_student();
        }
        id_array[count_entry]=id;

        sc.nextLine(); //solved the bug that int takes only the digital part and ignores the "\n" inserted by the OS

        System.out.print("Name(FULL NAME): ");
        try
        {
            name=sc.nextLine().toUpperCase();           
        }
        catch(Exception e)
        {
            System.out.println("please try again" );
            sc.nextLine();
            add_student();
        }
        
        name_array[count_entry]=name;

        System.out.print("Age(18-70): ");
        try
        {
            age=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("please try again" );
            sc.nextLine();
            add_student();
            
        }

        while(age<18 || age>70)
        {
            System.out.println("Age must be between 18-70(Both inclusive) !!!!!!!!");
            System.out.print("Age: ");
            try
           {
            age=sc.nextInt();
           }
            catch(Exception e)
           {
            System.out.println("please try again" );
            sc.nextLine();
            add_student();
           }
        }

        age_array[count_entry]=age;

        sc.nextLine(); //solved the bug that int takes only the digital part and ignores the "\n" inserted by the OS


        System.out.print("Course (1.CSE/2.IT/3.ME/4.EE/5.EEE/6.CE)(Enter corresponding number): ");
        int course_choice=sc.nextInt();
        sc.nextLine();
        switch(course_choice)
        {
            case 1:
                course="CSE";
                break;
            case 2:
                course="IT";
                break;
            case 3:
                course="ME";
                break;
            case 4:
                course="EE";
                break;
            case 5:
                course="EEE";
                break;
            case 6:
                course="CE";
                break;
            default:
                course="NOT SELECTED";
        }
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