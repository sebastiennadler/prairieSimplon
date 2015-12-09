import java.util.Scanner;

class signe{
    public static void main(String args[]){ 
    int nb1; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre entier quelconque ");
    nb1=in.nextInt(); 

    if (nb1<0)
    System.out.println("La valeur est strictement négative"); 
    else if (nb1==0)
    System.out.println("L'entier est nul"); 
    else
    System.out.println("L'entier est strictement positif"); 
    }
} 
