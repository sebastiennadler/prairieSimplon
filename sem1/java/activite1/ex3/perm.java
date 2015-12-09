import java.util.Scanner;

class perm{
    public static void main(String args[]){ 
    float a,b,perm; 
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un nombre a ");
    a=in.nextFloat(); 
    System.out.println("Entrer un nombre b : ");
    b=in.nextFloat();
    perm=a;
    a=b;
    b=perm; 
    
    System.out.println("Après permutation : "); 
    System.out.println("a = "+a); 
    System.out.println("b = "+b);
    }
} 
