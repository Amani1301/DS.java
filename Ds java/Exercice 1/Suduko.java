
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
public class Suduko {
        public static void main(String[] args) {
        Scanner clavier=new Scanner (System.in);
        Puzzule sol = new Puzzule();
        sol.Affiche();
        sol.remplire_0(sol.puzzule);
        sol.affiche_final();
        
        
       
        
}
}

