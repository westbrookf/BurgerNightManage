package Components.Labels;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BurgerNightTitle {

	public static Label companyTitle() {
		Label companyName = new Label();
		//Creation of the company Name above the two login option buttons THIS WILL BE PUT INTO A TITLES COMPONENT FOLDER
				companyName.setText("Burger Night");
				companyName.setTextFill(Color.WHITESMOKE);
				companyName.setMaxWidth(500);
				companyName.setAlignment(Pos.CENTER);
				companyName.setFont(Font.font("System", FontWeight.BOLD, 40));
				return companyName;
	}
}
