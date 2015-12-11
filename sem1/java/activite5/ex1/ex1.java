class ex1{
    public static void main(String args[]){
        int tabInt[]={1,2,3,4};
        
        System.out.println("Tableau : ");
        for (int i=0;i<tabInt.length;i++){
            System.out.print(" "+tabInt[i]);
        }
        System.out.println();
        System.out.println("Somme chiffres : ");
        System.out.println(" "+somme(tabInt)); 
    
    }

    public static int somme(int tab[]){
            int somme=0; 
        for (int i=0;i<tab.length;i++){
            somme=somme+tab[i];
        }
    return somme; 
    }

}

