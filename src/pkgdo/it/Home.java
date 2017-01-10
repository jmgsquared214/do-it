package pkgdo.it;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.*;

public class Home extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		
		
		Button b1 = new Button("First Button");
		Button b2 = new Button("Second longer button");
		Button b3 = new Button("Third");
		Button b4 = new Button("Fourth");
		
		GridPane.setConstraints(b1, 1, 1);
		GridPane.setConstraints(b2, 2, 1);
		GridPane.setConstraints(b3, 2, 1);
		GridPane.setConstraints(b4, 2, 2);
		
		grid.getChildren().addAll(b1, b2, b3, b4);
		
		Scene scene = new Scene(grid, 300, 400);
		stage.setTitle("Do-It!");
		stage.setAlwaysOnTop(true);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
