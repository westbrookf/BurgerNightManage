package Components.Containers;

import Components.buttonComponents.CreateAccountOptBtn;
import Components.buttonComponents.LoginOptBtn;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class LoginOrCreateAccountBtnsContainer {

	
public static VBox loginorCreateContainer() {
	// Creation of the container holding the login button and the create account button. THIS WILL BE PUT INTO A CONTAINERS COMPONENT FOLDER
			VBox userStart = new VBox();
			userStart.getChildren().addAll(LoginOptBtn.loginOptionBtn(), CreateAccountOptBtn.createAccOptBtn());
			userStart.setMinWidth(320);
			userStart.setMaxWidth(900);
//			userStart.setSpacing(15);
			userStart.setAlignment(Pos.CENTER);
			userStart.setMargin(LoginOptBtn.loginOptionBtn(), new Insets(15,0,0,0));
			return userStart;

}
}
