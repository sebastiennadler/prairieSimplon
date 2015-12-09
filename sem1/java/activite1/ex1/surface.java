import java.util.Scanner;

class surface{
    public static void main(String args[]){ 
    float base,hauteur,aire;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer la longueur de la base du triangle : ");
    base=in.nextFloat(); 
    System.out.println("Entrer la hauteur du triangle : ");
    hauteur=in.nextFloat();
    aire=base*hauteur/2;
    System.out.println("L'aire du triangle est : "+aire); 
    }
} 
