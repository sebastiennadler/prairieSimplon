import java.util.Scanner;

class max3{
    public static void main(String args[]){ 
    int nb1,nb2,nb3;
    int max; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre entier quelconque ");
    nb1=in.nextInt(); 
    System.out.println("Entrer un deuxième nombre entier ");
    nb2=in.nextInt();
    System.out.println("Entrer un troisième nombre entier ");
    nb3=in.nextInt();
    if (nb2>nb1) {max=nb2;}
    else {max=nb1;}
    if (nb3>max){max=nb3;}
    System.out.println("La valeur du plus grand nombre est : "+max); 
    }
} 
