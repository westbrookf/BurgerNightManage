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

public class PasswordInput {

	public static PasswordField passwordInp() {
		//Creation of the Password input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
		PasswordField passwordInput = new PasswordField();
		passwordInput.setPromptText("Password");
		passwordInput.setFont(Font.font("System", 16));
		passwordInput.setStyle("-fx-prompt-text-fill: black");
		passwordInput.setBorder(TextFieldBorder.textBorder());
		passwordInput.setBackground(null);
		passwordInput.setMaxWidth(300);
		passwordInput.setMinHeight(33);
//		firstNameInput.setAlignment(Pos.CENTER);
		passwordInput.setOnMouseEntered(e-> {
			passwordInput.setBorder(new Border(new BorderStroke(Color.RED,
					BorderStrokeStyle.SOLID,
					new CornerRadii(0),
					new BorderWidths(0,0,1,0))));
		});
		passwordInput.setOnMouseExited(e-> {
			passwordInput.setBorder(TextFieldBorder.textBorder());
		});
		return passwordInput;
	}
}
