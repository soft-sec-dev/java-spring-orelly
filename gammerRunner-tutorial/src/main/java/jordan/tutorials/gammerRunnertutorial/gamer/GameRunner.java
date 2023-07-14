package jordan.tutorials.gammerRunnertutorial.gamer;

import jordan.tutorials.gammerRunnertutorial.gamer.interfaces.GammingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GammingConsole gammingConsole;
    public GameRunner(GammingConsole gammingConsole){

        this.gammingConsole = gammingConsole ;
    }
    public void run(){
        gammingConsole.up();
        gammingConsole.left();
        gammingConsole.down();
        gammingConsole.right();
    }
}
