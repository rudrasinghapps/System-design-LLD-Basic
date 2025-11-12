package SystemDesign.static_datamember;

public class Person {
     int age;
     String name;
     static  int roi ;               // Static Data Member

     public void sayHii(){
         System.out.println("Hello " + this.age +" "+ this.name);
     }


}
