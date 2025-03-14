package Core;

public class TextEditor {

    private String content;
    private Integer cursorPosition;
    private String selection;

    public TextEditor(){
        this.content= "";
        this.cursorPosition= 0;
        this.selection= "";
    }

    public void setContent(String content){
        this.content= content;
        this.cursorPosition= content.length(); //This will help us move the cursor to the end of selected text after pasting
    }

    public void setCursorPosition(Integer position){
        if(position>=0 && position<=content.length()){  //the whole text editor is content itself afa the editor goes
            cursorPosition= position;
        }
        else{
            System.out.println("Invalid cursor position");
        }
    }

    public void addSelection(String selection){
        this.selection= selection;
    }

    public void clearSelection(){
        this.selection= "";
    }

    public void displayState(){
        System.out.println(this.content);
        System.out.println(this.cursorPosition);
        if(!selection.isEmpty()){
            System.out.println(this.selection);
        }
        else{
            System.out.println("No selection");
        }
    }

}
