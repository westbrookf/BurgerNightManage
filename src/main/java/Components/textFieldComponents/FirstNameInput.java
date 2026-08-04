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

public class FirstNameInput {

	public static TextField firstNameInp() {
		//Creation of the First name input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
		TextField firstNameInput = new TextField();
		firstNameInput.setPromptText("First name");
		firstNameInput.setFont(Font.font("System", 18));
		firstNameInput.setStyle("-fx-prompt-text-fill: black;");
		firstNameInput.setBorder(TextFieldBorder.textBorder());
		firstNameInput.setBackground(null);
		firstNameInput.setMaxWidth(300);
		firstNameInput.setMinHeight(33);
//		firstNameInput.setAlignment(Pos.CENTER);
		firstNameInput.setOnMouseEntered(e-> {
			firstNameInput.setBorder(new Border(new BorderStroke(Color.RED,
					BorderStrokeStyle.SOLID,
					new CornerRadii(0),
					new BorderWidths(0,0,1,0))));
		});
		firstNameInput.setOnMouseExited(e-> {
			firstNameInput.setBorder(TextFieldBorder.textBorder());
		});
		
		return firstNameInput;
	}
}
