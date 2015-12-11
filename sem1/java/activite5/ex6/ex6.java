class ex6{
    public static void main(String args[]){
        int tabInt[]={2,1,1,3,4};
        int tamp;
        boolean ord=true; 

        System.out.println("Tableau : ");
        for (int i=0;i<tabInt.length;i++){
            System.out.print(" "+tabInt[i]);
            }
        System.out.println();  
        
        for (int i=0;i<tabInt.length/2;i++){
            tamp=tabInt[i];
            tabInt[i]=tabInt[tabInt.length-1-i];
            tabInt[tabInt.length-1-i]=tamp;
            }
        
        System.out.println("Tableau_inv : ");
        for (int i=0;i<tabInt.length;i++){
            System.out.print(" "+tabInt[i]);
            }
        System.out.println();  
           
    }

}

