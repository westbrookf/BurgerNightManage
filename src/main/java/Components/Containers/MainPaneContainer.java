package Components.Containers;

import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import Components.Containers.TitleAndLoginOptionsContainer;

public class MainPaneContainer {
	
	

	private static GridPane mainPane = new GridPane();

    static {

//        Image image = new Image("/Images/discoverShow6.jpg");
////        Image background = new ImageView(image);
//        
//        
//        BackgroundImage bgImage =
//                new BackgroundImage(
//                		image,
//                        BackgroundRepeat.NO_REPEAT,
//                        BackgroundRepeat.NO_REPEAT,
//                        BackgroundPosition.CENTER,
//                        new BackgroundSize(100, 100, false,false,true,true));
//
//        mainPane.setBackground(new Background(bgImage));

        ColumnConstraints col = new ColumnConstraints();
        col.setPercentWidth(100);

        mainPane.getColumnConstraints().add(col);
    }
    
    public static GridPane getPane() {
        return mainPane;
    }
    
    public static void show(Node node, Background backgroundFiller) {
        mainPane.getChildren().clear();
        mainPane.setBackground(backgroundFiller);
        mainPane.add(node,0,0);
        mainPane.setMinWidth(300);
        mainPane.setMaxWidth(900);

        GridPane.setHalignment(node, HPos.CENTER);
        GridPane.setHgrow(node, Priority.ALWAYS);
    }


}
