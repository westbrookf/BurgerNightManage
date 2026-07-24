package Components.utilities;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class TextFieldBorder {

	public static Border textBorder() {
		//creation of the Border for the textfield components, THIS WILL MOST LIKELY SIT IN A UTILITIES COMPONENT FOLDER 
		Border inputBorder = new Border(new BorderStroke(Color.DARKGREY,
				BorderStrokeStyle.SOLID,
				new CornerRadii(0),
				new BorderWidths(0,0,1,0)));
		return inputBorder;
	}
}
