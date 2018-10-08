/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savrseni.par;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Marina
 */
public class Izlaz {
    public static boolean rezultat; 
    public static boolean prikaz(){
        Stage stage = new Stage();
        stage.setTitle("Izaci ili ne pitanje je sad?");
        stage.setHeight(400);
        stage.setWidth(700);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UTILITY);
        Button b1 = new Button();
        b1.setText("Da");
        Button b2 = new Button();
        b2.setText("Ne");
        VBox layout = new VBox(30);
        layout.getChildren().addAll(b1,b2);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        b1.setOnAction(evt ->{
            rezultat= true;
            stage.close();
        });
        b2.setOnAction(evt ->{
            rezultat=false;
            stage.close();
        });
        stage.setScene(s);
        stage.showAndWait();
        
        return rezultat;
       }
    
}
