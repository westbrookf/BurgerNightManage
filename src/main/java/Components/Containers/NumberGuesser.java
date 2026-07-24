package Components.Containers;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class NumberGuesser extends Application {


	@Override
	public void start(Stage stage) throws Exception {
		
		MainPaneContainer.show(
			    TitleAndLoginOptionsContainer.titleLoginContainer()
			);
		
		Scene scene = new Scene(
				MainPaneContainer.getPane(), 
				320,635);
		
		stage.setTitle("Login");
		stage.setScene(scene);
		stage.show();

	}
	
	
	//Creation of the Create Account button from the main page of the two login options page. THIS WILL SIT IN THE SAME CLASS AS THE CREATE ACCOUNT BUTTON AS A FUNCTIONALITY METHOD
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(NumberGuesser.class, args);

	}

}
