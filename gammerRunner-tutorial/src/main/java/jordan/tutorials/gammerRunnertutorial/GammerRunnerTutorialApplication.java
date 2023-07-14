package jordan.tutorials.gammerRunnertutorial;

import jordan.tutorials.gammerRunnertutorial.Bussiness.example.MyWebController;
import jordan.tutorials.gammerRunnertutorial.gamer.GameRunner;
import jordan.tutorials.gammerRunnertutorial.gamer.Stucture.MarioGame;
import jordan.tutorials.gammerRunnertutorial.gamer.Stucture.PackmanGame;
import jordan.tutorials.gammerRunnertutorial.gamer.Stucture.SuperContractGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GammerRunnerTutorialApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(GammerRunnerTutorialApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBussinesServuce());
		runner.run();
	}

}
