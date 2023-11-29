public class Songs {

    private String title;
    private Albums onAlbum;

    public Songs(String title, Albums onAlbum) {
        this.title = title;
        this.onAlbum = onAlbum;
    }

    public Albums getOnAlbum() {
        return onAlbum;
    }

    public boolean onSameAlbum(Songs otherSong) {
        return this.onAlbum.equals(otherSong.getOnAlbum());
    }

    public String getTitle() {
        return title;
    }

}
