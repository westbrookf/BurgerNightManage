package Components.Containers;

import Components.Labels.CreateAccountFormLabel;
import Components.Labels.LoginLabel;
import Components.buttonComponents.AccountCreateFormBackBtn;
import Components.buttonComponents.CreateAccountSubBtn;
import Components.buttonComponents.LoginBackBtn;
import Components.buttonComponents.LoginSubBtn;
import Components.textFieldComponents.ConfirmPasswordInput;
import Components.textFieldComponents.EmailInput;
import Components.textFieldComponents.FirstNameInput;
import Components.textFieldComponents.LastNameInput;
import Components.textFieldComponents.PasswordInput;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class LoginFormContainer {
	
public static VBox loginFormContain() {
		
		
		var title = LoginLabel.userLoginLabel();
		var email = EmailInput.emailInp();
		var password = PasswordInput.passwordInp();
		var submit = LoginSubBtn.submitLogin(email, password);
		var back = LoginBackBtn.loginBackBtn();

		
		VBox loginContain = new VBox();
		
		//Creation of the VBox containing all of the input options for creating an account. THIS WILL BE PUT IN THE CONTAINER COMPONENTS FOLDER
				
				loginContain.setMinWidth(320);
				loginContain.setMaxWidth(900);
				loginContain.setMinHeight(600);
				loginContain.setMaxHeight(900);
				loginContain.setAlignment(Pos.CENTER);
		loginContain.getChildren().addAll(
		    title,
		    email,
		    password,
		    submit,
		    back
		);

		VBox.setMargin(title, new Insets(0, 0, 15, 0));
		VBox.setMargin(email, new Insets(0, 0, 20, 0));
		VBox.setMargin(password, new Insets(0, 0, 20, 0));
		VBox.setMargin(submit, new Insets(15, 0, 20, 0));
		VBox.setMargin(back, new Insets(10, 0, 20, 0));
				
		return loginContain;
	}


}
