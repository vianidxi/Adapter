public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Reproduciendo archivo vlc: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
