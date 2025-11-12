package SystemDesign.class21.Memento;

public class Test {
    static void main() {
       CareTaker ct = new CareTaker();

       Editor editor = new Editor();
       editor.text = "Rudra";
       editor.fontSize = 5;
       editor.fontFamily = "Bold";
       editor.curserY = 10;
       editor.curserX = 20;


       EditorMemento em1 = editor.getSnapShot();
       ct.save(em1);

       editor.text +="pratap Singh";
       editor.curserY = 44;
       editor.curserX = 55;

      ct.save(editor.getSnapShot());

      editor.text ="Shubham Singh";
      ct.save(editor.getSnapShot());

      editor.restore(ct.undo());

        System.out.println(ct.undo());
        System.out.println(ct.undo());







    }
}
