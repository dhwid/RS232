/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ask4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

/**
 *
 * @author Dawid
 */
public class FXMLDocumentController implements Initializable {
    
    private String message;

    @FXML
    private Button send1;

    @FXML
    private Button send2;

    @FXML
    private TextArea user1;

    @FXML
    private TextArea user2;
    
    @FXML
    private TextArea frame;
    
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        message = user1.getText();
        Converter converter = new Converter(message);
        frame.setText((converter.frames.toString()));
        Reconverter reconverter = new Reconverter(converter.frames);
        Dictionary dict = new Dictionary(reconverter.message);
        user2.setText(dict.message);
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        message = user2.getText();
        Converter converter = new Converter(message);
        frame.setText((converter.frames.toString()));
        Reconverter reconverter = new Reconverter(converter.frames);
        Dictionary dict = new Dictionary(reconverter.message);
        user1.setText(dict.message);
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
