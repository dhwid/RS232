/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ask4;

import java.util.*;


/**
 *
 * @author Dawid
 */
public class ConverterToBinary {
    
    public byte[] bites;
    public int[] frame = new int[8];
    Vector frames = new Vector();
    


    
    public ConverterToBinary(String message){
        int i=0;
        bites = message.getBytes();
        for (int j = 0; j < bites.length; j++){
            frames.add(0); //dodajemy bit startu
            frame=printBinaryform(bites[j],frame);
            addingFrametoFrames(frames,frame);
            frames.add(1); //dodajemy bit stopu
            frames.add(1); //dodajemy drugi bit stopu
        }
    }
    
        private static int[] printBinaryform(int number,int[] frame) {
                 
        for (int k=0; k<8;k++){
        if (number <= 1) {
            frame[k++]=number;
            for (int n=k; n<8;n++){
                frame[k]=0;
            }
            return frame;
        }

        frame[k]=number%2;
        number = number >> 1;
        }
        return frame;
    }
        
        private static void addingFrametoFrames(Vector frames, int[] frame){
                for(int i=0; i < frame.length; i++)
                    frames.add(frame[i]);
    }
}
