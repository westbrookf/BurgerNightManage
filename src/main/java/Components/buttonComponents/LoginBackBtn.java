package Components.buttonComponents;

import Components.Containers.MainPaneContainer;
import Components.Containers.TitleAndLoginOptionsContainer;
import Components.utilities.BackgroundFillers;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LoginBackBtn {

	public static Button loginBackBtn() {
		// Creation of the go back button create account form to allow users to go back
		// to login option instead of creating an account. THIS WILL BE ADDED TO THE
		// BUTTONS COMPONENT FOLDER
		Button createAccountBackBtn = new Button();
		createAccountBackBtn.setText("Go Back");
		createAccountBackBtn.setTextFill(Color.RED);
		createAccountBackBtn.setFont(Font.font("System", 18));
		createAccountBackBtn.setStyle("-fx-background-radius:15; -fx-background-color: red");
		createAccountBackBtn.setTextFill(Color.WHITESMOKE);
		createAccountBackBtn.setMaxWidth(300);
		createAccountBackBtn.setCursor(Cursor.HAND);
		createAccountBackBtn.setOnAction(e -> goBackLoginOptions(TitleAndLoginOptionsContainer.titleLoginContainer()));
		return createAccountBackBtn;
	}

	// Functionality of the go back button at the bottom of the create account form.
	// THIS WILL GO WITH THE GO BACK BUTTON IN WHATEVER COMPONENT FOLDER IT WILL BE
	// IN
	public static void goBackLoginOptions(VBox accountOptionsContainer2) {

		MainPaneContainer.show(TitleAndLoginOptionsContainer.titleLoginContainer(), BackgroundFillers.loginBackground);

	}
}
