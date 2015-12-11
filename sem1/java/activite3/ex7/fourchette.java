import java.util.Scanner;
import java.util.Random; 
class fourchette{
    public static void main(String args[]){ 
    int min=1,max=100;
    int nombreAleatoire;
    int compteur=1;
    int n=0;
    Scanner in=new Scanner(System.in);
    
    Random rand = new Random();
    nombreAleatoire = rand.nextInt(max - min + 1) + min;
    
    while((compteur<=8)&&(n!=nombreAleatoire)){
        System.out.println("Entrer un entier :1<n<100");
        n=in.nextInt(); 
        if (n==nombreAleatoire)
            System.out.println("Bravo, vous avez trouvé le nombre en "+compteur+" essais"); 
        else if (n<nombreAleatoire)
            System.out.println("Le nombre à trouver est plus grand"); 
        else 
            System.out.println("Le nombre à trouver est plus petit"); 
        compteur=compteur+1;
    }
    if ((compteur>8) && (n!=nombreAleatoire))
        System.out.println("Désolé, le nombre était "+n); 
    }
} 
