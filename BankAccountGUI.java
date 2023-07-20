package replit;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BankAccountGUI extends Application{
  
  private BankAccount account = new BankAccount();

  @Override
  public void start (Stage stage){

    TextField depositField = new TextField();
    depositField.setMaxWidth(50);

    TextField withdrawField = new TextField();
    withdrawField.setMaxWidth(50);
    //do we have to know about the size numbers wise
    TextArea display = new TextArea();
    display.setEditable(false);
    display.setMaxSize(210, 50);
    display.setText("Balance: " + account.getBalance());

    Button depositButton = new Button("Deposit");

    Button withdrawButton = new Button("Withdraw");

    depositButton.setOnAction(e -> {
      
      account.deposit(Double.parseDouble(depositField.getText()));

      display.setText("Balance: $" + account.getBalance());

    });

    withdrawButton.setOnAction(e -> {
      if(account.withdraw(Double.parseDouble(withdrawField.getText()))){
        
        display.setText("Balance: $" + account.getBalance());


      }else{
        display.setText("Withdrawal unsuccesful. Not enough Funds!");
      }
      



    });

    HBox inputParts = new HBox(40);
    inputParts.setAlignment(Pos.CENTER);

    inputParts.getChildren().addAll(depositField, withdrawField);

    HBox inputButtons = new HBox(20);
    inputButtons.setAlignment(Pos.CENTER);

    inputButtons.getChildren().addAll(depositButton, withdrawButton );
    //does it matter where we put the buttons if its in
    //hbox or vbox
    VBox root = new VBox(25);
    root.setAlignment(Pos.CENTER);

    root.getChildren().addAll(inputParts, inputButtons, display);

    Scene scene3 = new Scene(root, 350, 250);
    stage.setScene(scene3);
    stage.setTitle("Bank ATM");
    stage.show();



  }
  public static void main(String[] args) {
    launch(args);

 } 

}