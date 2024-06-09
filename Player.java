//Factory Design Pattern
public interface Player{
    void play();
}

class HumanPlayer implements Player{

    @Override
    public void play() {
        System.out.println("Human playing");
    }
}

class ComputerPlayer implements   Player{

    @Override
    public void play() {
        System.out.println("Computer playing");
    }
}



 class PlayerTest {
     public Player getplayer(String shapeName) {
         switch (shapeName) {
             case "Human":
                 return new HumanPlayer();
             default:
                 return new ComputerPlayer();
         }
     }

     public static void main(String[] args) {
         PlayerTest p=new PlayerTest();
         Player p1=p.getplayer("Human");
         p1.play();




     }
 }
