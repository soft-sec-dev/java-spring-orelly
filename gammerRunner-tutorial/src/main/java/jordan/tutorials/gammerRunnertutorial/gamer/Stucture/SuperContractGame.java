package jordan.tutorials.gammerRunnertutorial.gamer.Stucture;

import jordan.tutorials.gammerRunnertutorial.gamer.interfaces.GammingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContractGame implements GammingConsole {
    public SuperContractGame(){}
    public void up(){
        System.out.println("SuperContratGame jump");;
    }
    public void down(){
        System.out.println("SuperContractGame down into hole");;
    }
    public void left(){
        System.out.println("SuperContractGame stop");;
    }
    public void right(){
        System.out.println("SuperContractGame accelerate");;
    }
}
