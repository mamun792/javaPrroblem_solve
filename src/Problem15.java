import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem15 {
    private  String  title;
    private  String artist;

    public  Problem15(String title,String artist){
        this.artist=artist;
        this.title=title;
    }
    public  String getTitle(){
        return  title;
    }
    public  String setTitle(){
        return  this.title=title;
    }
    public  String getArtist(){
        return  artist;
    }

    public  String setArtist(){
        return  this.artist=artist;
    }

    public  String toString(){
        return title+ "Artist " + artist;
    }
}

interface  Song{

    public void AddSong(Problem15 problem15);
    public void removeSong(Problem15 problem15);
    public  void RandomSong();
}

class Play implements  Song{
  public   List<Problem15> songs=new ArrayList<>();
    public  void AddSong(Problem15 problem15){
        songs.add(problem15);
    }

    @Override
    public void removeSong(Problem15 problem15) {
        songs.remove(problem15);
    }

    public  void RandomSong(){
        if(songs.isEmpty()){
            System.out.println("No song in Libeary");
        }else{
            Random random=new Random();
            int randomIndex = random.nextInt(songs.size());
            Problem15 randomSong = songs.get(randomIndex);
            System.out.println("Now playing: " + randomSong.toString());
        }
    }

    public  void ListSong(){
        for (Problem15 song:songs){
            System.out.println(song);
        }
    }
}

class Libeary1{
    public static void main(String[] args) {
      Problem15 problem15=new Problem15("Song1","mim");
      Problem15 song2=new Problem15("song2","mamun");
         Play play=new Play();
         play.AddSong(problem15);
          play.AddSong(song2);
          play.ListSong();
          play.RandomSong();
    }
}