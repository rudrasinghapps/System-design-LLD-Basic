package SystemDesign.class21.Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<EditorMemento> his = new Stack<>();

    public void save(EditorMemento editorMemento){
        his.add(editorMemento);
    }

    public EditorMemento undo(){
        return his.pop();
    }
}
