package SystemDesign.class13;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject  {

     private List<Observor> list;

     Subject(){
         list = new ArrayList<>();
     }

     public  void register(Observor o){
         list.add(o);
     }

     public void unregister(Observor o){
         list.remove(o);
     }

     public void dataUpdated(){
         for(Observor o:list){
             o.getData(this);
         }
     }




}
