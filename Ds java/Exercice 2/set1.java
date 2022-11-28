
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toutou
 */
public class set1 {
   
   
    int  set1 [][]={{1,3,5,7},
                    {9,11,13,15},
                    {17,19,21,23},
                    {25,27,29,31}};  

   void Affiche(){
       for(int x[] : set1)
           System.out.println(Arrays.toString(x));
   }    
    
}

