package problem3;

public class Document {
    private static int counter = 1;
    protected int numRec ;
    protected String title;
    protected Library library;

    public Document(String title){
        this.title = title;
        numRec = counter;
        counter++;
    }
    public int getNumRec(){
        return numRec;
    }

    public String getTitle() {
        return title;
    }
}
