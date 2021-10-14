/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class InputChecking {
     

    public static boolean dateChecking(String date) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            format.parse(date);
            return true;            
        } catch (ParseException e) {
            return false;

        }

    }

}
