package Core;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorMemento> mementoList= new ArrayList<>();
    private TextEditor textEditor;

    public History(TextEditor textEditor){
        this.textEditor= textEditor;
    }

    public void backup(){
        mementoList.add(textEditor.createMemento());
    }

    public void undo(){
        if(mementoList.isEmpty()){
            System.out.println("Nothing to undo");
        }
        else{
           EditorMemento memento= mementoList.remove(mementoList.size()-1);
           textEditor.restoreFromMemento(memento);
            System.out.println("State undone to previous state");
        }
    }
}
