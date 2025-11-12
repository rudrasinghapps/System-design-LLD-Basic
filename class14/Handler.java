package SystemDesign.class14;

public class Handler {
    Human human;

    Handler(){
        this.human = new Arti();
    }

    public void getName(){
         this.human.Name();
    }

    public void getMuk(){
        this.human.tataPower();
    }

    public void getLevel(){
        this.human.level(this);
    }
}
