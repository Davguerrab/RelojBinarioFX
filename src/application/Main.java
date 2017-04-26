package application;
	

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
		    Font.loadFont(getClass().getResourceAsStream("/resources/IntelClearPro_Bd.TTF"), 
		      10
		    );
		    Font.loadFont(
		    		getClass().getResourceAsStream("/resources/IntelClear_WLat_Rg.TTF"), 
		      10
		    );
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main2.fxml"));
			Scene scene = new Scene(root);

			
			ObservableList<Screen> screen = Screen.getScreens();

			Rectangle2D bounds = screen.get(1).getVisualBounds();

			
			primaryStage.setX(bounds.getMinX() + 100);
			primaryStage.setY(bounds.getMinY() + 100);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setFullScreen(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}


