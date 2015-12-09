import java.util.Scanner;

class validDate{
    public static void main(String args[]){ 
    int nb1,nb2,nb3;
    int max; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer premier élément de la date ");
    nb1=in.nextLine(); 
    System.out.println("Entrer un deuxième nombre entier ");
    nb2=in.nextInt();
    System.out.println("Entrer un troisième nombre entier ");
    nb3=in.nextInt();
    

    
    if (nb2>nb1) {max=nb2;}
    else {max=nb1;}
    System.out.println("La valeur du plus grand nombre est : "+max); 
    }
} 
