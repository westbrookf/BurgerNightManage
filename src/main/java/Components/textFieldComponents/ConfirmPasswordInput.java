package Components.textFieldComponents;

import Components.utilities.TextFieldBorder;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ConfirmPasswordInput {

	public static PasswordField confirmPasswordInp() {
		//Creation of the Password input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
		PasswordField confirmPasswordInput = new PasswordField();
		confirmPasswordInput.setPromptText("Confirm your password");
		confirmPasswordInput.setFont(Font.font("System", 16));
		confirmPasswordInput.setStyle("-fx-prompt-text-fill: black");
		confirmPasswordInput.setBorder(TextFieldBorder.textBorder());
		confirmPasswordInput.setBackground(null);
		confirmPasswordInput.setMaxWidth(300);
		confirmPasswordInput.setMinHeight(33);
//		firstNameInput.setAlignment(Pos.CENTER);
		confirmPasswordInput.setOnMouseEntered(e-> {
			confirmPasswordInput.setBorder(new Border(new BorderStroke(Color.RED,
					BorderStrokeStyle.SOLID,
					new CornerRadii(0),
					new BorderWidths(0,0,1,0))));
		});
		confirmPasswordInput.setOnMouseExited(e-> {
			confirmPasswordInput.setBorder(TextFieldBorder.textBorder());
		});
		return confirmPasswordInput;
	}
}
