package jordan.tutorials.gammerRunnertutorial.gamer.Stucture;

import jordan.tutorials.gammerRunnertutorial.gamer.interfaces.GammingConsole;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GammingConsole {
    public MarioGame(){}
    public void up(){
        System.out.println("jump");;
    }
    public void down(){
        System.out.println("down into a hole");;
    }
    public void left(){
        System.out.println("Stop");;
    }
    public void right(){
        System.out.println("accelerate");;
    }
}
