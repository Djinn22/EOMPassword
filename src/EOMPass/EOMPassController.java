/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EOMPass;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author lloyd
 */
public class EOMPassController implements Initializable {
    

    @FXML
    private Label EOMpassword;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /**
       * 
       * EOM PASSWORD
       * 
       */
    
        //Get the calendar instance and populate the date variables
        Calendar cal = Calendar.getInstance();
        Date now = new Date();
        Date then;
        
        //Set formatting for the return of the date formats
        SimpleDateFormat curr_M = new SimpleDateFormat("MMMM");
        SimpleDateFormat last_M = new SimpleDateFormat("MMMM");
        
        //Set variable for last month
        cal.setTime(now);
        cal.add(Calendar.MONTH, -1);
        then = cal.getTime();
        
        //Populate Current Month and Previous month variables, get 3rd Char of each and change to UpperCase
        String currentM = curr_M.format(now);
        String previousM = last_M.format(then);
        char char_aa = Character.toUpperCase(currentM.charAt(2));
        char char_bb = Character.toUpperCase(previousM.charAt(2));
        
        /**
       * 
       * DAILY PASSWORD
       */
       
        
        
        //Print passwords to screen
        EOMpassword.setText(Character.toString(char_aa) + Character.toString(char_bb) + (cal.get(Calendar.DAY_OF_MONTH) + 12));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }    
    
}
