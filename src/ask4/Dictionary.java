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
    
    String forbiddenWords = "ETI,PG,kurcze,kurde,Gdańsk,polityka,słowa";
    String[] words = forbiddenWords.split(",");
    String message = "";

    Dictionary(String frames){
        for (String word : words) {
        frames = frames.replaceAll(word, "***");
        
}
       message=frames;
       System.out.println(message);
    }
    
}
