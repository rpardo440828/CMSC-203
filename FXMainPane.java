import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button btn1, btn2, btn3, btn4, btn5;
	Label mainLabel;
	TextField txtField;
	
	HBox firstBox;
	HBox secondBox;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		btn1 = new Button("Hello");
		btn2 = new Button("Howdy");
		btn3 = new Button("Chinese");
		btn4 = new Button("Clear");
		btn5 = new Button("Exit");
		mainLabel = new Label("Feedback");
		txtField = new TextField();
		
		firstBox = new HBox();
		secondBox = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		dataManager = new DataManager();
		
		HBox.setMargin(btn1,new Insets(10, 30, 30, 0));
		HBox.setMargin(btn2,new Insets(10, 30, 30, 0));
		HBox.setMargin(btn3,new Insets(10, 30, 30, 0));
		HBox.setMargin(btn4,new Insets(10, 0, 30, 0));
		HBox.setMargin(btn5,new Insets(10, 0, 30, 30));
		HBox.setMargin(mainLabel,new Insets(0, 20, 0, 0));
		firstBox.setAlignment(Pos.CENTER);
		secondBox.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		secondBox.getChildren().addAll(mainLabel, txtField);
		firstBox.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
		getChildren().addAll(firstBox, secondBox);
		
		btn1.setOnAction(new ButtonHandler());
		btn2.setOnAction(new ButtonHandler());
		btn3.setOnAction(new ButtonHandler());
		btn4.setOnAction(new ButtonHandler());
		btn5.setOnAction(new ButtonHandler());
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			
			if(event.getSource() == btn1)
			{
				System.out.println("Hello");
				txtField.setText(dataManager.getHello());
			}
			if(event.getSource() == btn2)
			{
				System.out.println("Howdy");
				txtField.setText(dataManager.getHowdy());
			}
			if(event.getSource() == btn3)
			{
				txtField.setText(dataManager.getChinese());
			}
			if(event.getSource() == btn4)
			{
				txtField.setText("");
			}
			else if(event.getSource() == btn5)
			{
				Platform.exit();
				System.exit(0);
			}
		}
	}
}