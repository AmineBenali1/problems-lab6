package problem3;

public class TextBook extends Book{
    public String level;

    public TextBook(String title,String author, int nbrPages, String level){
        super(title, author, nbrPages);
        this.level = level;
    }
    @Override
    public String toString(){
        return "TextBook : " + title + ", Author: " + author+ ", " + nbrPages + " pages, Level : " + level;
    }
}
