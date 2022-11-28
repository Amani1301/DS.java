
import java.util.Arrays;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toutou
 */
public class Puzzule {
   int[][] puzzule = new int [9][9];
   
       
void Affiche(){
       for(int x[] : puzzule){
           System.out.println(Arrays.toString(x));
      
   }  
}
public void remplire_0(int [][] puzzule){
    Scanner clavier = new Scanner(System.in);
    do{
    for (int i=0;i<9;i++){
        for(int j=0;j<9;j++){
             System.out.println("Enter une valeur TAB["+i+"]["+j+"] : ");
             int val;
             val=clavier.nextInt(); 
             puzzule[i][j]=val;  
            }
        }   
    }while(valide(puzzule));
} 

private static boolean  test_box(int [][]puzzule ,int val, int L, int C){
    
    
    int L_box = L-L % 3;
    int C_box = C-C % 3;

    for (int i =L_box; i < L_box + 3; i ++)
    {
      for (int j = C_box; j < C_box + 3; j++) {
        if (puzzule[i][j] == val ) {
            return true;}
    }
    
}
 return false;  
    
}
 private static boolean test_L (int[][] puzzule, int val, int L) {
    for (int i = 0; i < 9; i++) {
      if (puzzule[L][i] == val) {
        return true;
      }
    }
    return false;
  }
 
  private static boolean test_C (int[][] puzzule, int val, int C) {
    for (int i = 0; i < C; i++) {
      if (puzzule[i][C] == val) {
        return true;
      }
    }
    return false;
  }
   private static boolean test_valide(int[][] puzzule, int val, int L, int C) {
    return !test_L(puzzule, val, L) &&
        !test_C(puzzule, val, L) &&
        !test_box(puzzule, val, L, C);
  }
   public  boolean valide(int[][] puzzule) {
    for (int L = 0; L < 9; L++) {
      for (int C = 0; C < 9; C++) {
        if (puzzule[L][C] == 0) {
          for (int val = 1; val <= 9; val++) {
            if (test_valide(puzzule, val, L, C)) {
              puzzule[L][C] = val;}
             if(valide(puzzule)){
                 return true;
             }
              else {
                (puzzule[L][C]) = 0;
              }
            }
          }
          return false;
        }
      }
     return true;
    }
   
   public void affiche_final(){
       if(valide(puzzule)){
            System.out.println("Solution reussite ");
            Affiche(); 
        }
        else{
            System.out.println("Solution echec");
        }
   }
  }
  



