package pkgdo.it;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.*;

public class Home extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		grid.setMinWidth(600);
		grid.setMinHeight(400);
		grid.setGridLinesVisible(false);
		grid.setHgap(5);
		grid.setVgap(20);

		Label tableArea = new Label("This is where tasks table will come");
		tableArea.setMinWidth(600);
		
		GridPane.setConstraints(tableArea, 1, 1, 3, 1);
		
		TextField taskName = new TextField();
		taskName.setPromptText("Enter Task Name");
		taskName.setText("Default Text");
		taskName.setMinWidth(300);
		GridPane.setConstraints(taskName, 2, 2);
		
		ComboBox priority = new ComboBox();
		priority.getItems().addAll("High", "Low", "Medium");
		priority.setPromptText("Enter Priority");
		GridPane.setConstraints(priority, 1, 2);
		
		Button addButton = new Button("Add");
		addButton.setMinWidth(100);
		GridPane.setConstraints(addButton, 3, 2);
		
		Button cancelButton = new Button("Cancel");
		addButton.setMinWidth(100);
		GridPane.setConstraints(cancelButton, 3, 3);
		
		grid.getChildren().addAll(tableArea, taskName, priority, addButton, cancelButton);
		
		Scene scene = new Scene(grid, 600, 400);
		
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
