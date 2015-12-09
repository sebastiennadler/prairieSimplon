import java.util.Scanner;

class bissextile{
    public static void main(String args[]){ 
    int nb;
    boolean bissextile;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre entier correspondant à une année du calendrier ");
    nb=in.nextInt();

    if (nb%400==0) {bissextile=true;}
    else if (nb%100==0) {bissextile=false;}
    else if  (nb%4==0) {bissextile=true;}
    else {bissextile=false;}
        
    if (bissextile)
    System.out.println("L'année est bissextile");
    else
    System.out.println("L'année n'est pas bissextile"); 
    }
} 
