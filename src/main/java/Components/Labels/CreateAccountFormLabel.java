package Components.Labels;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CreateAccountFormLabel {

	public static Label createAccountLabel() {
		//Creation of the Craate account label, THIS WILL SIT IN THE LABEL COMPONENTS FOLDER WITH OTHER TITLE COMPONENTS
				Label instructText = new Label();
				instructText.setText("Create an Account");
				instructText.setFont(Font.font("System",FontWeight.BOLD, 26));
				instructText.setTextFill(Color.BLACK);
				instructText.setBackground(null);
				instructText.setMaxWidth(300);
//				instructText.setWrapText(true);
				instructText.setAlignment(Pos.CENTER);
				return instructText;
	}
}
