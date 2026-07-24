package Components.Containers;

import Components.Labels.CreateAccountFormLabel;
import Components.buttonComponents.AccountCreateFormBackBtn;
import Components.buttonComponents.CreateAccountSubBtn;
import Components.textFieldComponents.ConfirmPasswordInput;
import Components.textFieldComponents.EmailInput;
import Components.textFieldComponents.FirstNameInput;
import Components.textFieldComponents.LastNameInput;
import Components.textFieldComponents.PasswordInput;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class CreateaccountFormContainer {
	
	public static VBox createAccountFContainer() {
		VBox createAContain = new VBox();
		
		//Creation of the VBox containing all of the input options for creating an account. THIS WILL BE PUT IN THE CONTAINER COMPONENTS FOLDER
				createAContain.getChildren().addAll(CreateAccountFormLabel.createAccountLabel(), FirstNameInput.firstNameInp(), LastNameInput.lastNameInp(), EmailInput.emailInp(), PasswordInput.passwordInp(), ConfirmPasswordInput.confirmPasswordInp(), CreateAccountSubBtn.submitCreateAccForm(),AccountCreateFormBackBtn.createAccountBackBtn());
				createAContain.setMargin(CreateAccountFormLabel.createAccountLabel(), new Insets(100,0,15,5));
				createAContain.setMargin( FirstNameInput.firstNameInp(),new Insets(20, 0, 20, 10));
				createAContain.setMargin(LastNameInput.lastNameInp(),new Insets( 0, 0, 20, 10));
				createAContain.setMargin(EmailInput.emailInp(),new Insets( 0, 0, 20, 10));
				createAContain.setMargin(PasswordInput.passwordInp(),new Insets( 0, 0, 20, 10));
				createAContain.setMargin(ConfirmPasswordInput.confirmPasswordInp(),new Insets( 0, 0, 20, 10));
				createAContain.setMargin(CreateAccountSubBtn.submitCreateAccForm(),new Insets(15, 0, 20, 10));
				createAContain.setMargin(AccountCreateFormBackBtn.createAccountBackBtn(),new Insets( 0, 0, 20, 10));
				createAContain.setMinWidth(320);
				createAContain.setMaxWidth(900);
				return createAContain;
	}
}
