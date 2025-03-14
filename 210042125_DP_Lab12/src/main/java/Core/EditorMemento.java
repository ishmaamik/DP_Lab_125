package Core;

public class EditorMemento {

    private String content;
    private Integer cursorPosition;
    private String selection;

    public EditorMemento(String content, Integer cursorPosition, String selection){
        this.content=content;
        this.selection=selection;
        this.cursorPosition= cursorPosition;
    }

    public String getContent(){
        return content;
    }
    public String getSelection(){
        return selection;
    }
    public Integer getCursorPosition(){
        return cursorPosition;
    }

}
