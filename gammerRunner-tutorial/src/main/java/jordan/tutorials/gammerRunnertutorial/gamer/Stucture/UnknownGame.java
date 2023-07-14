package jordan.tutorials.gammerRunnertutorial.gamer.Stucture;

import jordan.tutorials.gammerRunnertutorial.gamer.interfaces.GammingConsole;
import org.springframework.stereotype.Component;

@Component
public class UnknownGame implements GammingConsole {

    @Override
    public void up() {
        System.out.println("Unknow up");
    }

    @Override
    public void down() {
        System.out.println("Unnow down");
    }

    @Override
    public void left() {
        System.out.println("Unknow left");
    }

    @Override
    public void right() {
        System.out.println("Unnow right");
    }
}
