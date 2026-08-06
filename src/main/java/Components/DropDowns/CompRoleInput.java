package Components.DropDowns;

import Backend.DAO.RoleDAO;
import Backend.MODEL.Role;
import javafx.scene.control.ComboBox;

public class CompRoleInput {

	public static ComboBox<Role> roleInp(){
		ComboBox<Role> roleInput = new ComboBox<>();
		roleInput.getItems().addAll(RoleDAO.findAll(0));
		roleInput.setPromptText("Select Your Role");
		
		return roleInput;
	}
}
