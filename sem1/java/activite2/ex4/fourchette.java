import java.util.Scanner;

class fourchette{
    public static void main(String args[]){ 
    float nb1,nb2,nb3; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre quelconque ");
    nb1=in.nextFloat(); 
    System.out.println("Entrer borne inférieure de l'intervalle ");
    nb2=in.nextFloat();
    System.out.println("Entrer borne supérieure de l'intervalle ");
    nb3=in.nextFloat();

    if ((nb1>nb2)&&(nb1<nb3))
    System.out.println("Le nombre est bien dans l'intervalle"); 
    else
    System.out.println("Le nombre n'est pas dans l'intervalle"); 
    }
} 
