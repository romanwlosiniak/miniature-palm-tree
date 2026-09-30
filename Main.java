package slides.Games;

public class Main {
    void main(){
        Game game1 = new Game();
        Game game2 = new Game();

        game1.download();

        game1.setTitle("Fifa");
        System.out.println(game1.getTitle());


    }
}
