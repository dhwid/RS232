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

public class ConverterBinarytoACII {
    
    public byte[] binary;
    
    ConverterBinarytoACII (Vector frames){
        
        for(int i=1; i<frames.size();i+=11){
             for(int j=i+8; j>i;i--){
                 //binary[j]=frames.elementAt(i);
             }
            //SnmpTools.ascii2binary()
            }
    }
    
}
