import java.util.Scanner;

class validDate{
    public static void main(String args[]){ 
        int jour,mois,annee;
        boolean bissextile;
        boolean dateValide; 
        Scanner in=new Scanner(System.in);
        System.out.println("Entrer un nombre entier correspondant à une année du calendrier ");
        annee=in.nextInt();
        System.out.println("Entrer un nombre entier correspondant à un mois du calendrier");
        mois=in.nextInt(); 
        System.out.println("Entrer un nombre entier correspondant à un jour du calendrier");
        jour=in.nextInt();
    
   
    
        if ( ((1<=mois)&&(12>=mois))&&((1<=jour)&&(nbJours(mois,annee)>=jour)) )
        System.out.println("La date est valide");
        else System.out.println("La date n'est pas valide"); 

    }
    
    static boolean bissextile(int nb){
        boolean bissextile; 
        if (nb%400==0) {bissextile=true;}
        else if (nb%100==0) {bissextile=false;}
        else if  (nb%4==0) {bissextile=true;}
        else {bissextile=false;}
        
        if (bissextile)
            System.out.println("L'année est bissextile");
        else
            System.out.println("L'année n'est pas bissextile"); 
        return bissextile;
    }

    static int nbJours(int mois,int annee){
        int nbJours; 
    switch (mois){
        case 1 : nbJours=31;
                break;
        case 2 : if (bissextile(annee)) {nbJours=29;}
                else nbJours=28;
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
    
    return nbJours;
    } 
  
} 
