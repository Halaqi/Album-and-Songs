public class Main {
    public static void main(String[] args) {
        Albums album1 = new Albums("Eminem", "Rock");
        Albums album2 = new Albums("5 Maroon", "Jazz");

        Songs song1 = new Songs("Mocking Bird", album1);
        Songs song2 = new Songs("lose your self", album1);
        Songs song3 = new Songs("Girl like you", album2);

        System.out.println(song1.getTitle() + " and " + song2.getTitle() + " on the same album: " + song1.onSameAlbum(song2));
        System.out.println(song1.getTitle() + " and " + song3.getTitle() + " on the same album: " + song1.onSameAlbum(song3));

        System.out.println("Album 1 has rock music: " + album1.hasRockMusic());
        System.out.println("Album 2 has rock music: " + album2.hasRockMusic());
    }
}
