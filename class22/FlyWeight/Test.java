package SystemDesign.class22.FlyWeight;

public class Test {
    static void main() {
         Tank[] tank = new Tank[50];

         for(int i = 0 ; i < 10 ; i++){
             tank[i] = new Tank();
             tank[i].tankType = TankTypeFactory.getTankType("typeA");
         }

        for(int i = 10 ; i < 20 ; i++){
            tank[i] = new Tank();
            tank[i].tankType = TankTypeFactory.getTankType("typeB");
        }

        for(int i = 20 ; i < 30 ; i++){
            tank[i] = new Tank();
            tank[i].tankType = TankTypeFactory.getTankType("typeC");
        }

        for(Tank t:tank){
          if(t!=null)  System.out.println( t +" -> "+System.identityHashCode(t.tankType));
        }
    }
}
