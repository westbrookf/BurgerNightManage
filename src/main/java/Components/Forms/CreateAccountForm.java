package Components.Forms;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CreateAccountForm {

	public static void createAccForm() {
		//creation of the Border for the textfield components, THIS WILL MOST LIKELY SIT IN A UTILITIES COMPONENT FOLDER 
				Border inputBorder = new Border(new BorderStroke(Color.DARKGREY,
						BorderStrokeStyle.SOLID,
						new CornerRadii(0),
						new BorderWidths(0,0,1,0)));
				
				
				
				//Creation of the First name input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
//				TextField firstNameInput = new TextField();
//				firstNameInput.setPromptText("First name");
//				firstNameInput.setFont(Font.font("System", 18));
//				firstNameInput.setStyle("-fx-prompt-text-fill: darkgrey;");
//				firstNameInput.setBorder(inputBorder);
//				firstNameInput.setBackground(null);
//				firstNameInput.setMaxWidth(300);
//				firstNameInput.setMinHeight(33);
////				firstNameInput.setAlignment(Pos.CENTER);
//				firstNameInput.setOnMouseEntered(e-> {
//					firstNameInput.setBorder(new Border(new BorderStroke(Color.RED,
//							BorderStrokeStyle.SOLID,
//							new CornerRadii(0),
//							new BorderWidths(0,0,1,0))));
//				});
//				firstNameInput.setOnMouseExited(e-> {
//					firstNameInput.setBorder(inputBorder);
//				});
//				
//				//Creation of the Last name input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
//				TextField lastNameInput = new TextField();
//				lastNameInput.setPromptText("Last name");
//				lastNameInput.setFont(Font.font("System", 18));
//				lastNameInput.setBorder(inputBorder);
//				lastNameInput.setBackground(null);
//				lastNameInput.setMaxWidth(300);
//				lastNameInput.setMinHeight(33);
////				firstNameInput.setAlignment(Pos.CENTER);
//				lastNameInput.setOnMouseEntered(e-> {
//					lastNameInput.setBorder(new Border(new BorderStroke(Color.RED,
//							BorderStrokeStyle.SOLID,
//							new CornerRadii(0),
//							new BorderWidths(0,0,1,0))));
//				});
//				lastNameInput.setOnMouseExited(e-> {
//					lastNameInput.setBorder(inputBorder);
//				});
//				
//				//Creation of the Email input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
//				TextField emailInput = new TextField();
//				emailInput.setPromptText("Email");
//				emailInput.setFont(Font.font("System", 16));
//				emailInput.setBorder(inputBorder);
//				emailInput.setBackground(null);
//				emailInput.setMaxWidth(300);
//				emailInput.setMinHeight(33);
////				firstNameInput.setAlignment(Pos.CENTER);
//				emailInput.setOnMouseEntered(e-> {
//					emailInput.setBorder(new Border(new BorderStroke(Color.RED,
//							BorderStrokeStyle.SOLID,
//							new CornerRadii(0),
//							new BorderWidths(0,0,1,0))));
//				});
//				emailInput.setOnMouseExited(e-> {
//					emailInput.setBorder(inputBorder);
//				});
				
				//Creation of the Password input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
//				PasswordField passwordInput = new PasswordField();
//				passwordInput.setPromptText("Password");
//				passwordInput.setFont(Font.font("System", 16));
//				passwordInput.setBorder(inputBorder);
//				passwordInput.setBackground(null);
//				passwordInput.setMaxWidth(300);
//				passwordInput.setMinHeight(33);
////				firstNameInput.setAlignment(Pos.CENTER);
//				passwordInput.setOnMouseEntered(e-> {
//					passwordInput.setBorder(new Border(new BorderStroke(Color.RED,
//							BorderStrokeStyle.SOLID,
//							new CornerRadii(0),
//							new BorderWidths(0,0,1,0))));
//				});
//				passwordInput.setOnMouseExited(e-> {
//					passwordInput.setBorder(inputBorder);
//				});
				
				//Creation of the Password input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
//				PasswordField confirmPasswordInput = new PasswordField();
//				confirmPasswordInput.setPromptText("Confirm your password");
//				confirmPasswordInput.setFont(Font.font("System", 16));
//				confirmPasswordInput.setBorder(inputBorder);
//				confirmPasswordInput.setBackground(null);
//				confirmPasswordInput.setMaxWidth(300);
//				confirmPasswordInput.setMinHeight(33);
////				firstNameInput.setAlignment(Pos.CENTER);
//				confirmPasswordInput.setOnMouseEntered(e-> {
//					confirmPasswordInput.setBorder(new Border(new BorderStroke(Color.RED,
//							BorderStrokeStyle.SOLID,
//							new CornerRadii(0),
//							new BorderWidths(0,0,1,0))));
//				});
//				confirmPasswordInput.setOnMouseExited(e-> {
//					confirmPasswordInput.setBorder(inputBorder);
//				});
	}
}
