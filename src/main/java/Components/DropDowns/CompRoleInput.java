package Components.DropDowns;

import Backend.Role;
import javafx.scene.control.ComboBox;

public class CompRoleInput {

	public static ComboBox<Role> roleInp(){
		ComboBox<Role> roleInput = new ComboBox<>();
		roleInput.getItems().addAll(Role.values());
		roleInput.setPromptText("Select Your Role");
		
		return roleInput;
	}
}
