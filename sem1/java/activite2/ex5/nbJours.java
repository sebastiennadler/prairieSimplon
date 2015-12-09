import java.util.Scanner;

class nbJours{
    public static void main(String args[]){ 
    int nb;
    int nbJours;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre entier correspondant à un mois ");
    nb=in.nextInt();

    switch (nb){
        case 1 : nbJours=31;
                break;
        case 2 : nbJours=28;
                break;
        case 3 : nbJours=31;
                break; 
        case 4 : nbJours=30;
                break;
        case 5 : nbJours=31; 
                break; 
        case 6 : nbJours=30;
                break; 
        case 7 : nbJours=31; 
                break; 
        case 8 : nbJours=31; 
                break; 
        case 9 : nbJours=30;
                break; 
        case 10 : nbJours=31; 
                break; 
        case 11 : nbJours=30;
                break; 
        case 12 : nbJours=31; 
                break; 
        default : nbJours=0; 
                break; 
        }
    System.out.println("Le nombre de jour correspondant au mois est : "+nbJours); 
    }
} 
