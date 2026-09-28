package op_test.ch07;

public class Main {
    public static void main(String[] args) {
        MusicDao musicDao = new MusicDao();
        MusicService musicService = new MusicService(musicDao);

        musicService.addMusic("abc", "가나다");
        musicService.addMusic("bcd", "나다라");
        musicService.addMusic("cde", "다라마");

        musicService.printPlaylist();
    }
}
