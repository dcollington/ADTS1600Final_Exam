package com.example.adts1600_digitalprototype;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBox;

    private String [] sitte = {"Less Than 45 Minutes", "Circa 45 Minutes", "More Than 45 Minutes"};

    @FXML
    private TextArea txtOut;

    @FXML
    private TextField txtWeight;

    @FXML
    private TextField txtHeight;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(sitte);
        choiceBox.setOnAction(this::getChoice);
    }

    public void getChoice(ActionEvent event){
        String sitte = choiceBox.getValue();

    }


    @FXML
    void save(ActionEvent event) {
        String vektInn = txtWeight.getText();
        String hoydeInn = txtHeight.getText();
        String sitteInn = choiceBox.getValue();

        int vektUt = 0;
        int hoydeUt = 0;

       try{
          vektUt = Integer.parseInt(vektInn);
           hoydeUt= Integer.parseInt(hoydeInn);
       }
       catch (Exception e){
           txtOut.setText("Du må skrive inn gyldige verdier");
           System.out.println("Dette ble feil");
       }


       if(vektUt < 200 && vektUt> 10){
           vektUt = Integer.parseInt(vektInn);

       }
       else {
           txtOut.setText("Du må skrive inn gyldige verdier iFF");
       }

        if(Integer.parseInt(hoydeInn) < 220 && Integer.parseInt(hoydeInn) > 100){
            hoydeInn = String.valueOf(hoydeUt);

        }
        else {
            txtOut.setText("Du må skrive inn gyldige verdier tada");
        }





        txtOut.setText("Congratulations! Your settings have now been saved. \nYou have chosen the following values:" +
                "\nWeight: " + vektUt + "\nHeight: " + hoydeUt + "\nSession length: " + sitteInn);

    }




}
