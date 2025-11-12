package SystemDesign.class22.ProtoType;

public class Test {
    static void main() {

        Shape rectange =new Rectange(5,4,20,"rectangle");
        Shape circle = new Circle("Circle",22,7);



        Rectange rc = new Rectange();
        Circle cr =new Circle();

        Shape shape = circle.clone();


        System.out.println(shape +" -> "+ System.identityHashCode(shape));
        System.out.println(shape.hashCode());




        System.out.println(rectange);

        System.out.println(circle +" -> "+ System.identityHashCode(circle));


    }

}
