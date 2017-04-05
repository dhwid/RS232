/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ask4;


/**
 *
 * @author Dawid
 */
import com.sun.jmx.snmp.internal.SnmpTools;
import java.util.*;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

public class Reconverter {
    
    public int[] binary = new int[8];
    public int binarka;
    public String message = "";
    public int binars_int;
    public char alphabetic;
    StringBuilder output = new StringBuilder();
    
        
    Reconverter (Vector frames){
                
        for(int i=8; i<frames.size();i+=11){
             for(int j=7; j>0;j--){
               //binary[j] =(Integer)frames.elementAt(i-j);
               binars_int += (Integer)frames.elementAt(i-j)*Math.pow(2,(7-j));
             }
             alphabetic = (char)binars_int;
             message += alphabetic;
             binars_int =0;
             }

            }
    
    
}
