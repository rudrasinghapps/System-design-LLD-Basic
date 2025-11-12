package SystemDesign.class3.temp;

public class Main {
    public static   class Student{
        int age;
        String name;
        String house;
        String schoolName;
        {
            System.out.println("Instance block");
        }

        Student(){
           System.out.println("Constructor firing");
       }

       Student(int a){
            this();
           System.out.println("paramerrize");
       }

    }
    static void main()   {

        Student st = new Student(5);

    }
}
