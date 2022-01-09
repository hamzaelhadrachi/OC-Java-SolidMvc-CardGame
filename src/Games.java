import com.zerotohero.controller.GameController;
import com.zerotohero.model.Deck;
import com.zerotohero.view.View;

public class Games {

	public static void main(String[] args) {
		GameController gc = new GameController(new Deck(), new View());
		gc.run();
	}
}
