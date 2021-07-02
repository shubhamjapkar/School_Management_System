package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    Button submitbutton;

    @FXML
    TextField textfild1;

    @FXML
    TextField textfild2;

    @FXML
    TextField textfild3;

    @FXML
    TextField textfild4;

    @FXML
    TextField textfild5;

    @FXML
    ImageView imageView;

    public void setSubmitbutton(ActionEvent event){

    try {
        String name = textfild1.getText();
        String address = textfild2.getText();
        String course = textfild3.getText();

        int ageno= Integer.parseInt(textfild4.getText());
        long contact = Long.parseLong(textfild5.getText());

        if (name!="" && address!="" && course!="") {
            insert_value_33 obj = new insert_value_33();
            obj.insert(name, address, course, ageno, contact);
        }
        else {
            JOptionPane.showMessageDialog(null,"Please Enter Right Information", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (Exception e){
        System.out.println("check 1");
        System.out.println(e);
    }
}

}
