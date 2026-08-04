package Components.buttonComponents;

import Backend.Users;
import Components.Containers.CreateaccountFormContainer;
import Components.Containers.MainPaneContainer;
import Components.Containers.TitleAndLoginOptionsContainer;
import Components.textFieldComponents.ConfirmPasswordInput;
import Components.textFieldComponents.EmailInput;
import Components.textFieldComponents.FirstNameInput;
import Components.textFieldComponents.LastNameInput;
import Components.textFieldComponents.PasswordInput;
import Components.textFieldComponents.RoleInput;
import Components.utilities.BackgroundFillers;
import javafx.animation.FadeTransition;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
import Backend.Users;

public class CreateAccountSubBtn {

	public static Button submitCreateAccForm() {
		
		Button createAccountFormBtn = new Button();
		createAccountFormBtn.setText("Create Account");
		createAccountFormBtn.setTextFill(Color.RED);
		createAccountFormBtn.setFont(Font.font("System", 18));
		createAccountFormBtn.setStyle("-fx-background-radius:15; -fx-background-color: red");
		createAccountFormBtn.setTextFill(Color.WHITESMOKE);
		createAccountFormBtn.setMaxWidth(300);
		createAccountFormBtn.setCursor(Cursor.HAND);
		createAccountFormBtn.setOnAction(e -> submitNewAccount(FirstNameInput.firstNameInp(), LastNameInput.lastNameInp(), RoleInput.roleInp(), EmailInput.emailInp(), PasswordInput.passwordInp(), ConfirmPasswordInput.confirmPasswordInp(), TitleAndLoginOptionsContainer.titleLoginContainer(), CreateaccountFormContainer.createAccountFContainer()));
		return createAccountFormBtn;
	}
	
//	private static Object submitNewAccount(TextField firstNameInp, TextField lastNameInp, TextField emailInp,
//			TextField passwordInp, TextField confirmPasswordInp, VBox titleLoginContainer, VBox accountFContainer,
//			Pane mainPane) {
//		// TODO Auto-generated method stub
//		return null;
//	}

		//Functionality of the create account button at the bottom of the create account form. THIS WILL GO WITH THE CREATE ACCOUNT BUTTON IN WHATEVER COMPONENT FOLDER IT WILL BE IN
		public static void submitNewAccount(TextField firstName, TextField lastName, TextField role, TextField email, PasswordField password, PasswordField confirmPassword, VBox accountOptionsContainer2, VBox createContain){
			
			var finalFName = firstName.getText();
			var finalLName = lastName.getText();
			var finalRole = role.getText();
			var finalEmail = email.getText();
			var finalPassword = password.getText();
			var finalConfirm = confirmPassword.getText();
			
			
			
			if(!finalConfirm.equals(finalPassword)) {
				//Creation of the alert of the confirmation password and the password created not matching. THIS WILL GO IN THE ALERTS COMPONENT FOLDER 
				Alert wrongPasswordConfirm = new Alert(AlertType.ERROR, "Passwords do not match, please reenter your passwords", ButtonType.OK);
				wrongPasswordConfirm.showAndWait();
			}else {
				//Method call to the class users method createUser to create the user submitted
				Users.createUser(finalFName, finalLName, finalRole, finalEmail, finalPassword);
				
				
				
				//Creation of the pane effect again. When constantly reusing this, put in one method, call that method with an override and make alterations to the pane as needed
//				accountOptionsContainer2.setOpacity(1);
//				createContain.setOpacity(0);
//				pane2.getChildren().add(accountOptionsContainer2);
//				pane2.getChildren().remove(createContain);
//				FadeTransition paneTransition2 = new FadeTransition(Duration.millis(1450), accountOptionsContainer2);
//				paneTransition2.setToValue(1);
////				paneTransition.setOnFinished(e -> pane2.getChildren().remove(createContain));
//				paneTransition2.play();
//				Image image = new Image("/Images/discoverShow6.jpg");
//				//Background properties: true:widthAsPercentage, true: heightAsPercentage, true:Contain, true:Cover
//				BackgroundImage bgImage1 = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(320,635,true,true,false,true));
//
//				
//				pane2.setBackground(new Background(bgImage1));
				
				MainPaneContainer.show(
					    TitleAndLoginOptionsContainer.titleLoginContainer(),BackgroundFillers.loginBackground
					);				
				
			}
		}
}
