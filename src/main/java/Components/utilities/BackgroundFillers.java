package Components.utilities;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundImage;

public class BackgroundFillers {
	
	public static final Background loginBackground =
			new Background(
		            new BackgroundImage(
		                new Image("/Images/discoverShow6.jpg"),
		                BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT,
		                BackgroundPosition.CENTER,
		                new BackgroundSize(
		                    100,100,false,false,true,true)
		            ));
		       
	
	//WHITE BACKGROUND
	public static final Background WHITE_BACKGROUND =
	        new Background(
	            new BackgroundFill(
	                Color.WHITE,
	                CornerRadii.EMPTY,
	                Insets.EMPTY
	            )
	        );


}
