import java.util.Scanner;

class ex6{
    public static void main(String args[]){ 
    int n,r;
    int somme=0;
    int tab []=new int[10];
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un entier n>0");
    n=in.nextInt(); 

    for (int i=0;i<tab.length;i++)
        tab[i]=0;

    while(n!=0){
        r=n%10;
        n=(n-r)/10;
        tab[r]++;
        }
    System.out.println(); 
    for(int i=0;i<tab.length;i++)
        if (tab[i]!=0)
            System.out.println(i+" apparaît "+tab[i]+" fois");
        
    }
} 
