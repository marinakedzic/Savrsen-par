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
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Marina
 */
public class KrajPrice {
    public static void prikaz(){
        Stage stage = new Stage();
        stage.setTitle("Kraj price");
        stage.setHeight(400);
        stage.setWidth(700);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UTILITY);
        Label li = new Label();
        li.setText("Dakle, ako Deda Mraz i savrsen covek ne postoje to znaci da je savrsena zena vozila savrsena kola.\nA posto je vozila zena, pa bila ona makar i svarsena, nesreca je bila neminovna!\nOsim toga, ako ste zena koja trenutno cita ove redove, evo jos jedne bolne cinjenice:\nZene NIKADA, ali bas NIKADA ne slede uputstva!");
        Button b1 = new Button();
        b1.setText("Slazem se");
        Button b2 = new Button();
        b2.setText("Ne slazem se");
        VBox layout = new VBox(30);
        layout.getChildren().addAll(li,b1,b2);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        b1.setOnAction(evt ->{
            stage.close();
        });
        b2.setOnAction(evt ->{
            stage.close();
        });
        stage.setScene(s);
        stage.showAndWait();
        
}
}