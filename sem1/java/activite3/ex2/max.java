import java.util.Scanner;

class max{
    public static void main(String args[]){ 
    int note=0;
    int max=0; 
    Scanner in=new Scanner(System.in);
    

    while (note>=0){
    System.out.println("Entrer une note entre 1 et 20, -1 pour stopper, -1 pour stopper.");
    note=in.nextInt(); 
    if (max<note){max=note;}
    }   
    System.out.println("La note maximum est : "+max); 
    }
} 
