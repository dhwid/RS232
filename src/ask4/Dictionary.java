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
public class Dictionary {
    
    String forbiddenWords = "Java,JVM,Microsoft";
    String[] words = forbiddenWords.split(",");
    String s = "lorem ";
    String message = "";

    Dictionary(String frames){
        for (String word : words) {
        frames = frames.replaceAll(word, "***");
        
}
       message=frames;
       System.out.println(message);
    }
    
}
