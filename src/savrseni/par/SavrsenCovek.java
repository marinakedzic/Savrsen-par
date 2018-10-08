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
public class SavrsenCovek {
    public static void prikaz(){
        Stage stage = new Stage();
        stage.setTitle("Savrsen Covek");
        stage.setHeight(400);
        stage.setWidth(700);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        HBox layout = new HBox(30);
        Label l1 = new Label();
        l1.setText("Ma daj, razmisli malo...");
        Button b2 = new Button();
        b2.setText("Pokusaj ponovo");
        layout.getChildren().addAll(l1,b2);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        b2.setOnAction(evt ->{
            stage.close();
        });
        stage.setScene(s);
        stage.showAndWait();
       }
}
