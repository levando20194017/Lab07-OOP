package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    public static final int MAX_NUMBERS_ORDERED = 10;
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    private static int size = 0;

    // public String getArtist() {
    //     return this.artist;
    // }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

     public void setTracks(ArrayList<Track> tracks) {
         this.tracks = tracks;
     }


    public CompactDisc() {
        super();
    }
    
    public void addTrack(Track track){
        if (size < MAX_NUMBERS_ORDERED){
            tracks.add(track);
            size++;
            System.out.println("The track has been added");
        }
        else{
            System.out.println("The order is almost full");
        }
    }

    public void removeTrack(Track track){
        for (Track trackid : tracks) {
            if (trackid == track){
                tracks.remove(track);
                System.out.println("The track has been removed");
                return;
            }
        }
        System.out.println("The track does not existed in the list of tracks");
    }

    public int getLength(){
        return size;
    }

    public void play() {
        System.out.println("Tracks length: " + this.getLength());
    }
}
