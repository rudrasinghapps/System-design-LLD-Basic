package SystemDesign.class3;

public class P {
    int d = 1;
    int d1 = 10;

    void fun(){
        System.out.println("P ka fun");
    }
    void fun1(){
        System.out.println("P ka fun1");
    }
}

class C extends P{
     int d = 2;
     int d2 = 20;
     void fun(){
         System.out.println("C ka fun");
     }
     void fun2(){
         System.out.println("C ka fun2");
     }
}
class Main{
    void main() {
        P obj = new C();
        System.out.println(obj.d);
        System.out.println(((C)obj).d);
       obj.fun();




    }
}
