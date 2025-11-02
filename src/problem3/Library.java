package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents = new ArrayList<>();

    public Library(int capacity){
        this.capacity = capacity;
    }
    public void displayDocuments(){
        for(Document document : documents){
            System.out.println(document);
        }
    }
    public boolean add(Document doc){
        if(capacity > 0){
            if(documents.contains(doc)) {
                System.out.println("Document already exists");
                return false;
            }
            documents.add(doc);
            capacity--;
            return true;
        }
        System.out.println("Maximum capacity reached !");
        return false;
    }
    public boolean delete(String title){
        for(Document document : documents){
            if(document.getTitle().equals(title)){
                documents.remove(document);
                capacity++;
                System.out.println("Document deleted");
                return true;
            }
        }
        System.out.println("Document not found");
        return false;
    }
    public Document document(int numRec){
        for(Document document : documents){
            if(document.getNumRec() == numRec){
                return document;
            }
        }
        return null;
    }
    public void displayAuthors(){
        System.out.println("Authors : ");
        for(Document document :documents){
            if(document instanceof Book){
                System.out.println(((Book) document).getAuthor());
            }
        }
    }
}
