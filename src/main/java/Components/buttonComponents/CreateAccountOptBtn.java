package Components.buttonComponents;

import java.util.List;

import Components.Containers.CreateaccountFormContainer;
import Components.Containers.MainPaneContainer;
import Components.Containers.NumberGuesser;
import Components.Containers.TitleAndLoginOptionsContainer;
import javafx.animation.FadeTransition;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CreateAccountOptBtn extends NumberGuesser {
	
	public static Button createAccOptBtn() {
		
		Image image = new Image("/Images/discoverShow6.jpg");
		//Background properties: true:widthAsPercentage, true: heightAsPercentage, true:Contain, true:Cover
		BackgroundImage bgImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(320,635,true,true,false,true));

		
		Button createAccountBtn = new Button();
		//Creation of the create account button on the login option screen. THIS BUTTON ALONG WITH ITS METHODS WILL BE PUT INTO A BUTTONS COMPONENT FOLDER
		createAccountBtn.setText("Create Account");
		createAccountBtn.setMinWidth(125);
//		Button button = new Button();
		//createAccountBtn.setMaxWidth(120);
//		createAccountBtn.setMinHeight(35);
		createAccountBtn.setOnAction(e -> createAccount());
		createAccountBtn.setOnMouseEntered(e -> {
		createAccountBtn.setTextFill(Color.RED);
		});
		createAccountBtn.setOnMouseExited(e -> {
			createAccountBtn.setTextFill(Color.WHITESMOKE);
		});
		createAccountBtn.setCursor(Cursor.HAND);
		createAccountBtn.setFont(Font.font("System",FontWeight.BOLD,20));
		createAccountBtn.setBackground(null);
		createAccountBtn.setBorder(null);
		createAccountBtn.setTextFill(Color.WHITESMOKE);
		return createAccountBtn;
		
	}
	

	private static void createAccount() {
		MainPaneContainer.show(
		        CreateaccountFormContainer.createAccountFContainer()
		    );
		
	}

}
