package op_test.ch07;

import java.util.List;

public class MusicService {
    private MusicDao dao;

    public MusicService(MusicDao dao) {
        this.dao = dao;
    }

    public void addMusic(String title, String artist) {
        Music music = new Music(title, artist);
        dao.insert(music);
    }

    public void printPlaylist() {
        List<Music> musicList = dao.findAll();
        System.out.println("--- 곡 전체 조회 ---");
        for(Music music : musicList) {
            System.out.println("곡: " + music.getTitle() + " || 아티스트: " + music.getArtist());
        }

    }
}
