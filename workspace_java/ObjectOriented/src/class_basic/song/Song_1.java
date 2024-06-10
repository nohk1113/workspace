package class_basic.song;

public class Song_1 {
    String title;
    String artist;
    String album;
    int year;
    String[] composer=new String[3];

    public void initSong(String t, String art, String al, int y,String[] com){
        title= t;
        artist=art;
        album=al;
        year=y;
        composer=com;
    }
    public void printSong(){
        System.out.println("제목 :"+title);
        System.out.println("가수 :"+artist);
        System.out.println("앨범 :"+album);
        System.out.println("년도 :"+year);
        System.out.println("작곡가 : ");
        for (int i=0; i<composer.length; i++){
            System.out.print(composer[i]+ " ");
        }
    }
}
