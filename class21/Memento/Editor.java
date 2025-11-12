package SystemDesign.class21.Memento;

public class Editor {
    String text;
    int curserX;
    int curserY;
    int fontSize;
    String fontFamily;

    void write(){
        System.out.println("");
    }

    void delete(){
        System.out.println("");
    }

    EditorMemento getSnapShot(){
        return new EditorMemento(this.text ,this.curserX ,this.curserY ,this.fontSize ,this.fontFamily);
    }

     void restore(EditorMemento m){
        this.curserX = m.getCurserX();
        this.curserY = m.getCurserY();
        this.fontFamily = m.getFontFamily();
        this.text = m.getText();
        this.fontSize = m.getFontSize();
     }
}
