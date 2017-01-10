package pkgdo.it;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.CheckBox;
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
		
		TableView table = new TableView();
		table.setMinHeight(300);
		table.setMinWidth(550);
		
		TableColumn column1 = new TableColumn("Priority");
		TableColumn column2 = new TableColumn("Description");
		TableColumn column3 = new TableColumn("Progress");
		table.getColumns().addAll(column1, column2, column3);
		
		GridPane.setConstraints(table, 1, 1, 3, 1);

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
		
		HBox progressArea = new HBox();
		progressArea.getChildren().addAll(new Label("Progress"),
										new Spinner<Integer>(0, 100, 0),
										new CheckBox("Completed"));
		progressArea.setAlignment(Pos.CENTER_RIGHT);
		progressArea.setSpacing(10);
		GridPane.setConstraints(progressArea, 1, 3, 2, 1);
		
		
		
		grid.getChildren().addAll(tableArea, table, taskName, priority, addButton, cancelButton, progressArea);
		
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
