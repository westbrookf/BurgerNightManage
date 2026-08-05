//package Components.textFieldComponents;
//
//import Backend.Role;
//import Components.utilities.TextFieldBorder;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.Border;
//import javafx.scene.layout.BorderStroke;
//import javafx.scene.layout.BorderStrokeStyle;
//import javafx.scene.layout.BorderWidths;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//
//public class RoleInput {
//
//		public static ComboBox<Role> roleInp() {
//			//Creation of the First name input component. THIS WILL SIT IN THE TEXTFIELD COMPONENTS FOLDER
//			TextField roleInput = new TextField();
//			roleInput.setPromptText("Company Role");
//			roleInput.setFont(Font.font("System", 18));
//			roleInput.setStyle("-fx-prompt-text-fill: black;");
//			roleInput.setBorder(TextFieldBorder.textBorder());
//			roleInput.setBackground(null);
//			roleInput.setMaxWidth(300);
//			roleInput.setMinHeight(33);
////			firstNameInput.setAlignment(Pos.CENTER);
//			roleInput.setOnMouseEntered(e-> {
//				roleInput.setBorder(new Border(new BorderStroke(Color.RED,
//						BorderStrokeStyle.SOLID,
//						new CornerRadii(0),
//						new BorderWidths(0,0,1,0))));
//			});
//			roleInput.setOnMouseExited(e-> {
//				roleInput.setBorder(TextFieldBorder.textBorder());
//			});
//			
//			return roleInput;
//		}
//	}


