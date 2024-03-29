package Javaclass05;

public class SongTest {
    public static void main(String[] args) {
        Song song = new Song();
        song.SongTitle = "밤편지";
        song.singer = "IU";
        song.albumName = "Palette";
        song.trackNumber = 8;

        System.out.println("[songTitle="+ song.SongTitle + ","+"singer=" +
                song.singer + ", "
                + "albumName=" + song.albumName + ", "
                +"trackNumber=" + song.trackNumber + "]");
    }
}
