package Components.Containers;

import Backend.Role;
import Components.DropDowns.CompRoleInput;
import Components.Labels.CreateAccountFormLabel;
import Components.buttonComponents.AccountCreateFormBackBtn;
import Components.buttonComponents.CreateAccountSubBtn;
import Components.textFieldComponents.ConfirmPasswordInput;
import Components.textFieldComponents.EmailInput;
import Components.textFieldComponents.FirstNameInput;
import Components.textFieldComponents.LastNameInput;
import Components.textFieldComponents.PasswordInput;
//import Components.textFieldComponents.RoleInput;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class CreateaccountFormContainer {

	public static VBox createAccountFContainer() {
		
		
		var title = CreateAccountFormLabel.createAccountLabel();
		var firstName = FirstNameInput.firstNameInp();
		var lastName = LastNameInput.lastNameInp();
		var role = CompRoleInput.roleInp();
		var email = EmailInput.emailInp();
		var password = PasswordInput.passwordInp();
		var confirmPassword = ConfirmPasswordInput.confirmPasswordInp();
		var submit = CreateAccountSubBtn.submitCreateAccForm(firstName, lastName, role, email, password, confirmPassword);
		var back = AccountCreateFormBackBtn.createAccountBackBtn();

		
		VBox createAContain = new VBox();
		
		//Creation of the VBox containing all of the input options for creating an account. THIS WILL BE PUT IN THE CONTAINER COMPONENTS FOLDER
				
				createAContain.setMinWidth(320);
				createAContain.setMaxWidth(900);
				createAContain.setMinHeight(600);
				createAContain.setMaxHeight(900);
				createAContain.setAlignment(Pos.CENTER);
		createAContain.getChildren().addAll(
		    title,
		    firstName,
		    lastName,
		    role,
		    email,
		    password,
		    confirmPassword,
		    submit,
		    back
		);

		VBox.setMargin(title, new Insets(50, 0, 15, 0));
		VBox.setMargin(firstName, new Insets(20, 0, 20, 0));
		VBox.setMargin(role, new Insets(0, 0, 20, 0));
		VBox.setMargin(lastName, new Insets(0, 0, 20, 0));
		VBox.setMargin(email, new Insets(0, 0, 20, 0));
		VBox.setMargin(password, new Insets(0, 0, 20, 0));
		VBox.setMargin(confirmPassword, new Insets(0, 0, 20, 0));
		VBox.setMargin(submit, new Insets(15, 0, 20, 0));
		VBox.setMargin(back, new Insets(10, 0, 20, 0));
				
		return createAContain;
	}
}
