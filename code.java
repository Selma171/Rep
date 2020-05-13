
package democours4;

import java.util.Scanner;


public class Chiffreventemax {
    
public static void main(String[] args) {
    
double chV1, chV2, chV3, max;
String nV1, nV2, nV3, nmax;
      

Scanner clavier = new Scanner(System.in);

System.out.println ("Entrez le chiffre et le vendeur No 1"); 
chV1 = clavier.nextDouble ();
nV1 = clavier.next ();

System.out.println ("Entrez le chiffre et le vendeur No 2");   
chV2 = clavier.nextDouble ();
nV2 = clavier.next ();

System.out.println ("Entrez le chiffre et le vendeur No 3");  
chV3 = clavier.nextDouble (); 
nV3 = clavier.next ();



max=chV1;
nmax=nV1;

if (chV2>chV1 && chV2>chV3 ){
max=chV2;
nmax=nV2;
}

else if (chV3>chV1 && chV3>chV1 ){
max=chV3; 
nmax=nV3;


 System.out.println("Le plus grand chiffre de vente est " + max + " le vendeur qui a réalisé le plus grand chiffre est " + nmax); 
 
 
 
}


}
    
}
