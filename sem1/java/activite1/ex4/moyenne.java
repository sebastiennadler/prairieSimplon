import java.util.Scanner;

class moyenne{
    public static void main(String args[]){ 
    float note1,note2,note3,moyenne;
    int coef1,coef2,coef3;




    
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer note 1 ");
    note1=in.nextFloat(); 
    System.out.println("Entrer note 2"); 
    note2=in.nextFloat(); 
    System.out.println("Entrer note 3"); 
    note3=in.nextFloat(); 
    System.out.println("Entrer coef 1"); 
    coef1=in.nextInt();
    System.out.println("Entrer coef 2"); 
    coef2=in.nextInt();
    System.out.println("Entrer coef 3"); 
    coef3=in.nextInt();
   
    moyenne=(note1*coef1+note2*coef2+note3*coef3)/(coef1+coef2+coef3); 
    System.out.println("La moyenne pondérée est égale à : "+moyenne); 
    
    }
} 
