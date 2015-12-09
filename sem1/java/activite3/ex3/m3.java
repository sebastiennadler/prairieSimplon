import java.util.Scanner;

class m3{
    public static void main(String args[]){ 
    int n=-1;
    int count=0;

    Scanner in=new Scanner(System.in);
    
    while(n!=0){ 
    System.out.println("Entrer un entier n>0, 0 pour finir.");
    n=in.nextInt(); 
    if (n%3==0){
        System.out.println("Le nombre "+n+" est multiple de 3"); 
        count=count+1; } 
    }
    System.out.println("Nombre de multiples : " +count);
    }
} 
