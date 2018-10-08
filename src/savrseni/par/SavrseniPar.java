/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savrseni.par;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Marina
 */
public class SavrseniPar extends Application {
    
    Stage stage;
    @Override
    public void start(Stage primaryStage) {
        stage=primaryStage;
        Label li = new Label();
        li.setText("Ispricacu vam jednu pricu: Da li ste spremni?");
        Button b1 = new Button();
        b1.setText("Da naravno");
        b1.setOnAction(event ->{
            SavrsenPar.prikaz();
        });
        HBox root = new HBox(30);
        Scene scene = new Scene(root, 700, 400);
        Button b2 = new Button();
        b2.setText("Iznenadjenje");
        b2.setOnAction(event ->{
            Iznenadjenje.prikaz();
        });
        Button b3 = new Button();
        b3.setText("Izlaz iz programa");
        b3.setOnAction(evt->{
            boolean rez =Izlaz.prikaz();
            if(rez==true){
                stage.close();
            }
            else{
                stage.setScene(scene);}
        });
        Label l1 = new Label();
        l1.setText("Birajte zeljenu igricu iz menija");
        l1.setText("Lepo se provedite");
        
        root.getChildren().addAll(li,b1,b2,b3);
        root.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Savrseni par");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
