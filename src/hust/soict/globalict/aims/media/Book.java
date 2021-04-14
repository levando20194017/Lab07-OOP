package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;


public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
  
    public void addAuthor(String authorName){
        for (String name : authors){
            if (authorName == name) return;
        }
        authors.add(authorName);
    }

    public void removeAuthor(String authorName){
        for (String name : authors){
            if (authorName == name) {
                authors.remove(name);
                break;
            }
        }
    }
}