package replit;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BackgroundColorChanger extends Application{

  @Override
  public void start(Stage stage){
    //Do we have to set positioning for it or is it set by the hbox
    //what is the label specifically for
    Label label = new Label("Background color changer");
    label.setFont(Font.font("Arial", 15));
   //  Text caption = new Text(68, 240, "Background Color    Changer");
   //  caption.setFill(Color.BLACK);
   //  caption.setFont(Font.font("Arial", 15));
   // can we use caption or is this only part of a group.

   Button redButton = new Button("Red");

   Button blueButton = new Button("Blue");
   //So the 10 is spacing between the button
   HBox buttonBox = new HBox(10);
   buttonBox.setAlignment(Pos.CENTER);

   buttonBox.getChildren().addAll(redButton, blueButton);
    //and the 10 is spacing between what here.
   VBox root = new VBox(20);
   root.setAlignment(Pos.CENTER);

   root.getChildren().addAll(label, buttonBox);

   root.setBackground(Background.EMPTY);

   //again here how do we know what numbers to use.
   Scene scene2 = new Scene(root, 200, 300, Color.YELLOW);

   redButton.setOnAction(e -> scene2.setFill(Color.RED));

   blueButton.setOnAction(e -> scene2.setFill(Color.BLUE));

   stage.setTitle("Background Color Changer");
   stage.setScene(scene2);
   //do we have to use this method.
   stage.show();
    
  } 
  public static void main(String[] args) {
    launch(args);
  }
}