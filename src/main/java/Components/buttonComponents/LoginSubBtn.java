package Components.buttonComponents;

import javax.security.auth.login.FailedLoginException;

import Backend.Security;
import Backend.Session;
import Backend.UserDAO;
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

		public static Button submitLogin(TextField email, PasswordField password) {
			
			Button createAccountFormBtn = new Button();
			createAccountFormBtn.setText("Login");
			createAccountFormBtn.setTextFill(Color.RED);
			createAccountFormBtn.setFont(Font.font("System", 18));
			createAccountFormBtn.setStyle("-fx-background-radius:15; -fx-background-color: red");
			createAccountFormBtn.setTextFill(Color.WHITESMOKE);
			createAccountFormBtn.setMaxWidth(300);
			createAccountFormBtn.setCursor(Cursor.HAND);
			createAccountFormBtn.setOnAction(e -> {
				try {
					loginSubmit(email, password);
				} catch (FailedLoginException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			return createAccountFormBtn;
		}
		
//		private static Object submitNewAccount(TextField firstNameInp, TextField lastNameInp, TextField emailInp,
//				TextField passwordInp, TextField confirmPasswordInp, VBox titleLoginContainer, VBox accountFContainer,
//				Pane mainPane) {
//			// TODO Auto-generated method stub
//			return null;
//		}

			//Functionality of the create account button at the bottom of the create account form. THIS WILL GO WITH THE CREATE ACCOUNT BUTTON IN WHATEVER COMPONENT FOLDER IT WILL BE IN
			public static void loginSubmit( TextField email, PasswordField password) throws FailedLoginException{
				
				var finalEmail = email.getText();
				var finalPassword = password.getText();
				
				Users user = UserDAO.findByEmail(finalEmail);
				
				if (user != null && Security.verifyPassword(password.getText(), user.getPasswordHash())) {
					Session.login(user);
					MainPaneContainer.show(
						    TitleAndLoginOptionsContainer.titleLoginContainer(),BackgroundFillers.loginBackground
						);
				}else {
					throw new FailedLoginException("Incorrect email or password");
				}
					
			}

}
