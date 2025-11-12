package SystemDesign.class22.FlyWeight;

import java.util.HashMap;

public class TankTypeFactory {

  private static HashMap<String , TankType> map =  new HashMap<>();

    public static TankType getTankType(String tankType){

        if(map.containsKey(tankType)) return map.get(tankType);

        TankType temp = null;

        if(tankType == "typeA"){
            temp = new TankType("typeA" ,500,200,null );
        }else if(tankType == "typeB"){
            temp = new TankType("typeB" ,600,220,null );
        }else if(tankType =="typeC"){
            temp = new TankType("typeC" ,900,250,null );
        }
        map.put(tankType ,temp);
        return temp;
    }
}
