package SystemDesign.runtime_polymorphism;

public class Main {
    static void main() {

        //      class C extemds class p

        C  obj = new C();
        System.out.println(obj.d);     // class C ka d
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        obj.fun();                     // class C ka fun
        obj.fun1();
        obj.fun2();

        System.out.println("--------------------------------");

        P obj1 = new P();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();

        System.out.println("--------------------------------");


       // C  obj2 = new P();       -> this is not possible beacuse instance created of p class .
                                 // -> but compiler check refrence

        P  obj3 = new C();
        System.out.println(obj3.d);    // class p ka d , datamember resolved by refrence
        System.out.println(obj3.d1);
        obj3.fun();                    // class c ka fun , function are resolved by instance
        obj3.fun1();

        System.out.println(((C)obj3).d);  // class C ka d , beacuse c instance have all datamember
        ((C)obj3).fun2();                // class C ka fun2 , beacuse instance is created of class c

    }
}

