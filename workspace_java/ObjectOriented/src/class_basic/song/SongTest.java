package class_basic.song;

public class SongTest {
    public static void main(String[] args) {
        Song_1 so=new Song_1();
        String[] a={"김", "이", "박"};
        so.initSong("java", "김자바", "1집", 2024,a);
        so.printSong();

    }
}
