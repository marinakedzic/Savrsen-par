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
public class SavrsenaZena {
    public static void prikaz(){
        Stage stage = new Stage();
        stage.setTitle("Savrsena Zena");
        stage.setHeight(400);
        stage.setWidth(1200);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        HBox layout = new HBox(30);
        Label l1 = new Label();
        l1.setText("Odgovor je tacan!!! Savrsena zena je prezivela.\nJedino ona STVARNO postoji.\nSvi znaju da Deda Mraz ne postoji.\nJos manje je moguce da postoji bice koje se zove savrseni covek.\nAko ste ZENA:Ovo je kraj price, kliknite CANCEL i izadjite iz programa.\nAko ste COVEK:Kliknite na OK za nastavak price...");
        Button b1 = new Button();
        b1.setText("OK");
        Button b2 = new Button();
        b2.setText("CANCEL");
        layout.getChildren().addAll(l1,b1,b2);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        b1.setOnAction(evt ->{
            KrajPrice.prikaz();
            stage.close();
        });
        b2.setOnAction(evt ->{
            stage.close();
        });
        stage.setScene(s);
        stage.showAndWait();
       }
}
