import java.util.Scanner;

class sommeChiffres{
    public static void main(String args[]){ 
    int n,r;
    int somme=0;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un entier n>0");
    n=in.nextInt(); 

    while(n!=0){
        r=n%10;
        n=(n-r)/10;    
        somme=somme+r;
        }
    System.out.println("Somme des chiffres : "+somme); 
    }
} 
