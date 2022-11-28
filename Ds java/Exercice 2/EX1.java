
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class EX1 {
    
    public static void main(String[] args) {
        Scanner clavier=new Scanner (System.in);
        int res;
        int rep[]=new int[5];
               
        set1 t1 =new set1();
        set2 t2=new set2();
        set3 t3 =new set3();
        set4 t4=new set4();
        set5 t5=new set5();
        System.out.println("La date de naissance est dans set1 ?");
        t1.Affiche();
        System.out.println("Si la date existe tapez '1' pour oui si non '0' ");
        res=clavier.nextInt();        
            if (res==1)
                rep[0] =1;
            else if (res==0)
                rep[0]=0;  
            
        System.out.println("La date de naissance est dans set2 ?");
        t2.Affiche();
        System.out.println("Si la date existe tapez '1' pour oui si non '0' ");
           res=clavier.nextInt();
            if (res==1)
                rep[1] =1;
            else if (res==0)
                rep[1]=0;
            
        System.out.println("La date de naissance est dans set3 ?");
        t3.Affiche();
        System.out.println("Si la date existe tapez '1' pour oui si non '0' ");
           res=clavier.nextInt();
            if (res==1)
                rep[2] =1;
            else if (res==0)
                rep[2]=0;
            
        System.out.println("La date de naissance est dans set4 ?");
        t4.Affiche();
        System.out.println("Si la date existe tapez '1' pour oui si non '0' ");
           res=clavier.nextInt();
            if (res==1)
                rep[3] =1;
            else if (res==0)
                rep[3]=0;
            
        System.out.println("La date de naissance est dans set5 ?");
        t5.Affiche();
        System.out.println("Si la date existe tapez '1' pour oui si non '0' ");
           res=clavier.nextInt();
            if (res==1)
                rep[4] =1;
            else if (res==0)
                rep[4]=0;
            
          int date =0;
            
          for(int i=0;i<rep.length;i++){
              while(rep[i]==1){
               date+=Math.pow(2,i);
               i++;
            }
          }                                                            
         System.out.println("Votre date de naissance est : " +date);                         
    }                       
}

        
            
       
       

