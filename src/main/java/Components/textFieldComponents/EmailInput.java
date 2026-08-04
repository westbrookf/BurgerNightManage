package Components.textFieldComponents;

import Components.utilities.TextFieldBorder;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EmailInput {

	public static TextField emailInp() {
		//Creation of the Email input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
		TextField emailInput = new TextField();
		emailInput.setPromptText("Email");
		emailInput.setFont(Font.font("System", 16));
		emailInput.setStyle("-fx-prompt-text-fill: black");
		emailInput.setBorder(TextFieldBorder.textBorder());
		emailInput.setBackground(null);
		emailInput.setMaxWidth(300);
		emailInput.setMinHeight(33);
//		firstNameInput.setAlignment(Pos.CENTER);
		emailInput.setOnMouseEntered(e-> {
			emailInput.setBorder(new Border(new BorderStroke(Color.RED,
					BorderStrokeStyle.SOLID,
					new CornerRadii(0),
					new BorderWidths(0,0,1,0))));
		});
		emailInput.setOnMouseExited(e-> {
			emailInput.setBorder(TextFieldBorder.textBorder());
		});
		return emailInput;
	}
}
