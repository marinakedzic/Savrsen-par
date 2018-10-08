/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savrseni.par;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Marina
 */
public class Iznenadjenje {
        public static void prikaz(){
        Stage stage = new Stage();
        stage.setTitle("Iznenadjenje");
        stage.setHeight(400);
        stage.setWidth(700);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        HBox layout = new HBox(30);
        Label l1 = new Label();
        l1.setText("Stvarno mislis da postoji ovde nesto?");
        Button b1 = new Button();
        b1.setText("Stisni me");
        Button b2 = new Button();
        b2.setText("Ne stiskaj dok ne nadjes iznenadjenje");
        layout.getChildren().addAll(l1,b1,b2);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        
        b1.setOnAction(evt ->{
        });
        b2.setOnAction(evt ->{
            stage.close();
        });
        stage.setScene(s);
        stage.showAndWait();
       }
}