package slides.Games;

public class Game {
    private String title;
    private double price;
    private int downloads;
    private boolean freeToPlay;

    public void download(){
        System.out.println("Download finished");
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String nieuweNaam){
        title = nieuweNaam;
    }
}