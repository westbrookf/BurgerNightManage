package Components.buttonComponents;

import Backend.Users;
import Components.Containers.MainPaneContainer;
import Components.Containers.TitleAndLoginOptionsContainer;
import Components.textFieldComponents.EmailInput;
import Components.textFieldComponents.PasswordInput;
import Components.utilities.BackgroundFillers;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LoginSubBtn {

		public static Button submitLogin() {
			
			Button createAccountFormBtn = new Button();
			createAccountFormBtn.setText("Login");
			createAccountFormBtn.setTextFill(Color.RED);
			createAccountFormBtn.setFont(Font.font("System", 18));
			createAccountFormBtn.setStyle("-fx-background-radius:15; -fx-background-color: red");
			createAccountFormBtn.setTextFill(Color.WHITESMOKE);
			createAccountFormBtn.setMaxWidth(300);
			createAccountFormBtn.setCursor(Cursor.HAND);
			createAccountFormBtn.setOnAction(e -> loginSubmit(EmailInput.emailInp(), PasswordInput.passwordInp()));
			return createAccountFormBtn;
		}
		
//		private static Object submitNewAccount(TextField firstNameInp, TextField lastNameInp, TextField emailInp,
//				TextField passwordInp, TextField confirmPasswordInp, VBox titleLoginContainer, VBox accountFContainer,
//				Pane mainPane) {
//			// TODO Auto-generated method stub
//			return null;
//		}

			//Functionality of the create account button at the bottom of the create account form. THIS WILL GO WITH THE CREATE ACCOUNT BUTTON IN WHATEVER COMPONENT FOLDER IT WILL BE IN
			public static void loginSubmit( TextField email, PasswordField password){
				
				var finalEmail = email.getText();
				var finalPassword = password.getText();
				
				
				
//				if(!finalConfirm.equals(finalPassword)) {
//					//Creation of the alert of the confirmation password and the password created not matching. THIS WILL GO IN THE ALERTS COMPONENT FOLDER 
//					Alert wrongPasswordConfirm = new Alert(AlertType.ERROR, "Passwords do not match, please reenter your passwords", ButtonType.OK);
//					wrongPasswordConfirm.showAndWait();
//				}else {
//					//Method call to the class users method createUser to create the user submitted
//					Users.createUser(finalFName, finalLName, finalEmail, finalPassword);
					
					
					
					MainPaneContainer.show(
						    TitleAndLoginOptionsContainer.titleLoginContainer(),BackgroundFillers.loginBackground
						);				
					
			}

}
