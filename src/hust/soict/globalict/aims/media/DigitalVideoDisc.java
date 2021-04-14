package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Disc implements Playable{


    public void setCategory(String category){
        this.category = category;
    }

    public void setCost(float cost){
        this.cost = cost;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public boolean search(String title){
        boolean kt;
        String[] words_1 = this.title.split("\\s");
        String[] words_2 = title.split("\\s");
        for (String word_1 : words_1){
            kt = false;
            for(String word_2 : words_2)
                if (word_1.equals(word_2)){
                    kt = true;
                    break;
                } 
            if (!kt) return false;
        }
        return true;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
