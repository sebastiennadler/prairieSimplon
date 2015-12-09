import java.util.Scanner;

class somme{
    public static void main(String args[]){ 
    int n; 
    int n1; 
    int somme; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre entier positif<1000 : ");
    n=in.nextInt(); 
    n1=(n-n%10)/10; 
    somme=n%10+n1%10+(n1-n1%10)/10;
    System.out.println("La somme des chiffres est : "+somme); 
    }
} 
