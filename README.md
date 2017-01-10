# do-it
Java SE Java FX application Building your first
-JavaFX = Library with seet of interoperable API written in java for the prupose of creating a User Interface Application. 
* Java and XML
*consistent UI
*CSS Styling

AWT First framework
Swing - 1997
JavaFX - 2008

High performance lazy binding
binding expressions
open source
JavaFX 8.0 is now part of JRE
Java -version
command line
To complie run: javac (name of file.java)
to run: run java (name of file) (no .java)
JavaFX Lifecycle

 Layouts- TilePane, StackPane, Grid, AnchorPane
grid- constraints ( node, column, row)

Controls- 
(Label)Class = javafx.scene.control.Label
A simple label is with a graphic on the left. Non Editable content

Label l1 = new label (); (create a label without text
Label l2 = new Label("search"); Create label with text
Image image = new Image(getClass().getResourceAsStream("pig.jpg)); Prepare image to use with label

l1.setGraphic(new ImageView(image); Attach image to the label.

Text Field- 
Class - javafx.scene.control.TextField
Accepts textual input from user
getText() method returns text
setText() to set value programatically

Code;
TextField name - new TextField(); creates a text field
name.setPromptText("Enter Name."); text when field is empty
hbox.getChildren().add(name); can be added to layout
name.setText("my text"); setting value programatically

ComboBox-
Class javafx.scene.control.ComboBox
Lets user choose from list values
getItems().addAll() to add options
setValues() to selects value
getValue()returns selected values
Variations- ChoiceBox

Code;

ComboBox comboBox = new ComboBox(); creates combo  box
priorityComboBox.getItems().addAll(
"Highest",
"High",
"Normal",
"Low");

Adds list of values
 comBox.setValue("Normal");

CheckBox

Class- javafx.scene.control.CheckBox
Deselect or select
setSelected() to change state
getSelected()to get state
setIndeterminate(true) for 3 state checkbox
 Code;

CheckBox cb1 = new Checkbox Checkbox without label

CheckBox cb2 = new CheckBox("1"); Checkbox with label
cb1.setText("2"); setting label
cb1.setSelected(true); selects the checkbox

TableView
Class- javafx.scene.control.TableView
setEditable() to change read only status
setColumns().addAll() to add Columns
setCellFactor() for complicated Cells

Code;
TableView table = new TableView(); creation of Table View

table.setEditable(true); make the table editable

TableColumn firstNameCol= new TableColumn("First Name");
TableColumn lastNameCol = new TableColumn("Last Name"); creation of columns

table.getColumns().addAll(firstName Col, lastNameCol);
Other Controls; Progressbar and spinner

