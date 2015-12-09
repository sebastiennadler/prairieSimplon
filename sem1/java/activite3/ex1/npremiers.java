import java.util.Scanner;

class npremiers{
    public static void main(String args[]){ 
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un entier n>0");
    n=in.nextInt(); 
    
    System.out.println("n premiers entiers ");
    for (int i=1;i<=n;i++)
        System.out.print(" "+i); 
    
    System.out.println(); 
    System.out.println("n premiers en sens décroissants"); 
    for (int i=n;i>0;i--)
        System.out.print(" "+i); 
    System.out.println(); 
   System.out.println("n premiers carrés parfaits");
     for (int i=1;i<=n;i++)
        System.out.print(" "+i*i);
    System.out.println();  
    System.out.println("n premiers nombres impairs"); 
    for (int i=1;i<2*n;i=i+2)
        System.out.print(" "+i); 
    System.out.println();
    System.out.println("n premiers nombres impairs inférieurs à n"); 
    for (int i=1;i<n;i=i+2)
        System.out.print(" "+i); 
    }
} 
