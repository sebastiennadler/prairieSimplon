import java.util.Scanner;

class suites{
    public static void main(String args[]){ 
    int n;
    int s;
    int s_1;
    int s_2;
    Scanner in=new Scanner(System.in);
    System.out.println("Entrer un entier n>0");
    n=in.nextInt(); 
    
    s=1;
    System.out.println("Le pas croissant ");
    for (int i=1;i<=n;i++){
        s=s+i-1;
        
        System.out.print(" "+s); 
    }
    System.out.println(); 
    

    System.out.println("La boîteuse "); 
    for (int i=1;i<=n;i++){
    if (i==1){s=1;}
    else if (i%2==0) {s=s+1;}
    else {s=s+2;}
        System.out.print(" "+s);
    } 
    System.out.println(); 
    
    s_1=0;
    System.out.println("Fibonacci");
     for (int i=1;i<=n;i++){
        if (i==1){s=0;}
        else if (i==2){s=1;s_1=0;}
        else {s_2=s_1;
              s_1=s;
              s=s_1+s_2;}
        System.out.print(" "+s);
    }
    }
} 
