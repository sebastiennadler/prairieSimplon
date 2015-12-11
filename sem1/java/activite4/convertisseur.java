import java.util.Scanner;

class convertisseur{
    public static void main(String args[]){ 
    int mode; 
    double T;
    char conv='O'; 
    Scanner in=new Scanner(System.in);
    
    
    System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
    System.out.println("-------------------------------------------------");    

    do{
        System.out.println("Choissez le mode de conversion : "); 
        System.out.println("1 - Convertisseur Celsius - Fahrenheit");  
        System.out.println("2 - Convertisseur Fahrenheit - Celsius");
        mode=in.nextInt();
        System.out.println("Température à convertir : ");
        T=in.nextDouble(); 
        if (mode==1){
            System.out.println(T+" °C correspond à : "+conv_celsius(T)+"°F.");
        }
        if (mode==2){
            System.out.println(T+" °F correspond à : "+conv_fahr(T)+"°C.");
        }
    
    
        System.out.println("Souhaitez-vous convertir une autre température? (O/N)");
        conv=in.next().charAt(0);
        } while (conv=='O');
    
    System.out.println("Au revoir !"); 
    }

    public static double conv_celsius(double temp){
        return ((9./5)*temp+32);
    }       
    public static double conv_fahr(double temp){
        return ((temp-32.)*5)/9;   
    }
}
