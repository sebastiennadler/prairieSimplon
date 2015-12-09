import java.util.Scanner;

class alterne{
    public static void main(String args[]){ 
    int nb1,nb2;
    int max; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer numéro du mois ");
    nb1=in.nextInt(); 
    System.out.println("Entrer le numéro de la maison ");
    nb2=in.nextInt();

    if ( ((nb1<=15) && (nb2%2==1))||((nb1>15)&&(nb2%2==0)) )
    System.out.println("Vous êtes bien garés");
    else
    System.out.println("Vous êtes mal garés");   
    }
} 
