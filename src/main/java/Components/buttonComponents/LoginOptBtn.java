package Components.buttonComponents;

import Components.Containers.CreateaccountFormContainer;
import Components.Containers.LoginFormContainer;
import Components.Containers.MainPaneContainer;
import Components.utilities.BackgroundFillers;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LoginOptBtn {

	
	
	public static Button loginOptionBtn() {
		
		Button loginBtn = new Button();
		
		//Creation of the login button on the login option screen. THIS BUTTON, ALONG WITH ITS METHODS WILL BE PUT INTO INTO A BUTTONS COMPONENT FOLDER
				loginBtn.setText("Login");
//				loginBtn.setMinWidth(10);
				loginBtn.setMaxWidth(90);
//				loginBtn.setMinHeight(35);
				loginBtn.setOnAction(e -> accountLogin());
				loginBtn.setOnMouseEntered(e -> {
					loginBtn.setTextFill(Color.RED);
					});
				loginBtn.setOnMouseExited(e -> {
					loginBtn.setTextFill(Color.WHITESMOKE);
					});
				loginBtn.setCursor(Cursor.HAND);
				loginBtn.setFont(Font.font("System",FontWeight.BOLD, 20));
				loginBtn.setBackground(null);
				loginBtn.setBorder(null);
				loginBtn.setTextFill(Color.WHITESMOKE);
				// Creation of the container holding the login button and the create account button. THIS WILL BE PUT INTO A CONTAINERS COMPONENT FOLDER
				
				return loginBtn;
	}
	
	
	//Creation of the login button from the main page of the two login options page. THIS WILL SIT IN THE SAME CLASS AS THE LOGIN BUTTON AS A FUNCTIONALITY METHODS
		public static void accountLogin() {
			MainPaneContainer.show(
			        LoginFormContainer.loginFormContain(), BackgroundFillers.WHITE_BACKGROUND
			    );
		}
}
