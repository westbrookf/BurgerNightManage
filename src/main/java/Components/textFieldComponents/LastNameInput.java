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

public class LastNameInput {
	public static TextField lastNameInp() {
		//Creation of the Last name input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
		TextField lastNameInput = new TextField();
		lastNameInput.setPromptText("Last name");
		lastNameInput.setFont(Font.font("System", 18));
		lastNameInput.setBorder(TextFieldBorder.textBorder());
		lastNameInput.setBackground(null);
		lastNameInput.setMaxWidth(300);
		lastNameInput.setMinHeight(33);
//		firstNameInput.setAlignment(Pos.CENTER);
		lastNameInput.setOnMouseEntered(e-> {
			lastNameInput.setBorder(new Border(new BorderStroke(Color.RED,
					BorderStrokeStyle.SOLID,
					new CornerRadii(0),
					new BorderWidths(0,0,1,0))));
		});
		lastNameInput.setOnMouseExited(e-> {
			lastNameInput.setBorder(TextFieldBorder.textBorder());
		});
		return lastNameInput;
	}

}
