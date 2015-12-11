import java.util.Scanner;

class factorielle{
    public static void main(String args[]){ 
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un entier n>0");
    n=in.nextInt(); 
    
    System.out.println("Factorielle "+n+"="+fact(n));
    }
    
    

    static int fact(int n){
        if (n==0) return 1; 
        else return (n*fact (n-1)); 
    }

} 
