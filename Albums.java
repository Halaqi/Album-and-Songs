public class Albums {
    private String name;
    private String genre;

    Albums(String name, String genre)
    {
      this.name=name;
      this.genre=genre;
    }

    public String getName()
    {
        return name;
    }
    public String getGenre()
    {
        return genre;
    }
    public boolean hasRockMusic()
    {
        return genre.equals("Rock");
    }







    }