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
public class SavrsenPar {
    public static void prikaz(){
        Stage stage = new Stage();
        stage.setTitle("Savrsen par");
        stage.setHeight(400);
        stage.setWidth(1000);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        HBox layout = new HBox(30);
        Label li = new Label();
        li.setText("Jednog lepog dana sreli su se jedan savrsen covek i jedna savrsena zena.\n Posle savrsenog udvaranja, imali su i savrseno vencanje.\n Njihov zajednicki zivot je takodje bio savrsen.\n Jedne olujne, snezne veceri uoci Nove Godine,\n ovaj savrseni par je vozio njihova savrsena kola jednim vijugavim putem.\n Odjednom, na sred puta ugledase jednu osobu u nevolji.\n Buduci da su savrseni par, stali su da pruze pomoc.\n Bio je to Deda Mraz a pored njega je stajao ogroman svezanj pun igracaka.\n Posto nisu mogli da dozvole da deca za Novu Godinu ostanu bez igracaka,\n savrseni par je primio u svoja kola Deda Mraza i njegov veliki svezanj\nMedjutim,uslovi za voznju bili su jako losi i savrseni par i Deda Mraz koji je bio sa njima,\n doziveli su saobracajnu nesrecu.\n Samo jedno od njih troje je prezivelo.\nSta mislite, ko je preziveo?");
        Button b1 = new Button();
        b1.setText("Deda Mraz");
        Button b2 = new Button();
        b2.setText("Savrsen covek");
        Button b3 = new Button();
        b3.setText("Savrsena zena");
        Button b4 = new Button();
        b4.setText("Izadji iz price");
        layout.getChildren().addAll(li,b1,b2,b3,b4);
        layout.setAlignment(Pos.CENTER);
        Scene s = new Scene(layout);
        
        b1.setOnAction(evt ->{
            DedaMraz.prikaz();
        });
        b2.setOnAction(evt ->{
            SavrsenCovek.prikaz();
        });
        b3.setOnAction(evt ->{
            SavrsenaZena.prikaz();
            stage.close();
        });
        b4.setOnAction(evt ->{
            stage.close();
        });
        stage.setScene(s);
        stage.showAndWait();
       }
}
