/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingobjects1;

/**
 *
 * @author hp
 */
public class Copyingobjects1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      wabi jibril=new wabi("JIMMA UNIVERSITY","RU2101/13",2013);  
       wabi jibril2 =new wabi(jibril);
      System.out.println(jibril2.getuniversity()); 
            System.out.println(jibril2.getid());  
      System.out.println(jibril2.getyear());  

    }
    
}
