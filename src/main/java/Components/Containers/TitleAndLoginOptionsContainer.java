package Components.Containers;

import Components.Labels.BurgerNightTitle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class TitleAndLoginOptionsContainer {
	
	public static VBox titleLoginContainer() {
		VBox accountOptionsContainer = new VBox();
		
		//Creation of the VBox container holding the BurgerNight Title and the HBox that is holding the two login option buttons. THIS WILL BE PUT INTO A CONTAINERS COMPONENT FOLDER
				accountOptionsContainer.getChildren().addAll(BurgerNightTitle.companyTitle(), LoginOrCreateAccountBtnsContainer.loginorCreateContainer());
//				accountOptionsContainer.getChildren().addAll( 0, LoginOrCreateAccountBtnsContainer.loginorCreateContainer());
				accountOptionsContainer.setMinWidth(320);
				accountOptionsContainer.setMaxWidth(900);
				accountOptionsContainer.setMinHeight(620);
				accountOptionsContainer.setAlignment(Pos.CENTER);
				accountOptionsContainer.setMargin(BurgerNightTitle.companyTitle(), new Insets(350,0,0,0));
				return accountOptionsContainer;
	}
}
