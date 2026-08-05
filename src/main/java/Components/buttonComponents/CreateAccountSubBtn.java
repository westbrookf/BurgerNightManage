package Components.buttonComponents;

import Backend.Role;
import Backend.DAO.UserDAO;
import Backend.MODEL.Users;
import Backend.SECURITY.Security;
import Components.Containers.CreateaccountFormContainer;
import Components.Containers.MainPaneContainer;
import Components.Containers.TitleAndLoginOptionsContainer;
import Components.textFieldComponents.ConfirmPasswordInput;
import Components.textFieldComponents.EmailInput;
import Components.textFieldComponents.FirstNameInput;
import Components.textFieldComponents.LastNameInput;
import Components.textFieldComponents.PasswordInput;
import Components.utilities.BackgroundFillers;
import javafx.animation.FadeTransition;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class CreateAccountSubBtn {

	public static Button submitCreateAccForm(TextField firstName, TextField lastName, ComboBox<Role> role,
			TextField email, PasswordField password, PasswordField confirmPassword) {

		Button createAccountFormBtn = new Button();
		createAccountFormBtn.setText("Create Account");
		createAccountFormBtn.setTextFill(Color.RED);
		createAccountFormBtn.setFont(Font.font("System", 18));
		createAccountFormBtn.setStyle("-fx-background-radius:15; -fx-background-color: red");
		createAccountFormBtn.setTextFill(Color.WHITESMOKE);
		createAccountFormBtn.setMaxWidth(300);
		createAccountFormBtn.setCursor(Cursor.HAND);
		createAccountFormBtn.setOnAction(e -> submitNewAccount(firstName, lastName, role, email, password,
				confirmPassword, TitleAndLoginOptionsContainer.titleLoginContainer(),
				CreateaccountFormContainer.createAccountFContainer()));
		return createAccountFormBtn;
	}

	// Functionality of the create account button at the bottom of the create
	// account form. THIS WILL GO WITH THE CREATE ACCOUNT BUTTON IN WHATEVER
	// COMPONENT FOLDER IT WILL BE IN
	public static void submitNewAccount(TextField firstName, TextField lastName, ComboBox<Role> roleInput,
			TextField email, PasswordField password, PasswordField confirmPassword, VBox accountOptionsContainer2,
			VBox createContain) {

		var finalFName = firstName.getText();
		var finalLName = lastName.getText();
		var finalRole = roleInput.getValue();
		var finalEmail = email.getText();
		var finalPassword = password.getText();
		var finalConfirm = confirmPassword.getText();

		if (!finalConfirm.equals(finalPassword)) {
			// Creation of the alert of the confirmation password and the password created
			// not matching. THIS WILL GO IN THE ALERTS COMPONENT FOLDER
			Alert wrongPasswordConfirm = new Alert(AlertType.ERROR,
					"Passwords do not match, please reenter your passwords", ButtonType.OK);
			wrongPasswordConfirm.showAndWait();

			return;

		}
		String hashedPassword = Security.hashPassword(finalPassword);
		Users user = new Users();
		user.setFirstName(finalFName);
		user.setLastName(finalLName);
		user.setUserRole(finalRole);
		user.setUserEmail(finalEmail);
		user.setPasswordHash(hashedPassword);
		
		
		// Method call to the class users method createUser to create the user submitted
		UserDAO.createUser(user);

		MainPaneContainer.show(TitleAndLoginOptionsContainer.titleLoginContainer(), BackgroundFillers.loginBackground);

	}
}
