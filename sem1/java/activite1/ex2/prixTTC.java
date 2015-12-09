import java.util.Scanner;

class prixTTC{
    public static void main(String args[]){ 
    float HT,prix,TVA;
    int nb; 
    Scanner in=new Scanner(System.in);
    System.out.println("Donner le prix du produit HT ");
    HT=in.nextFloat(); 
    System.out.println("Entrer la quantité ");
    nb=in.nextInt();
    System.out.println("Entrer le taux de TVA"); 
    TVA=in.nextFloat(); 
    prix=nb*HT/(1-TVA);
    System.out.println("Le prix total à payer est :"+prix); 
    }    
} 
