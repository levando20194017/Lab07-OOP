package hust.soict.globalict.aims.media;

public class Disc extends Media{
    protected int length;
    protected String director;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public Disc(){
        super();
    }

    public Disc(String title){
        super(title);
    }
}
