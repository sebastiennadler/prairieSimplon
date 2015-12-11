class ex5{
    public static void main(String args[]){
        int tabInt[]={1,1,3,4};
        int min=0,max=0;
        boolean ord=true; 
        System.out.println("Tableau : ");
        for (int i=0;i<tabInt.length;i++){
            System.out.print(" "+tabInt[i]);
            if (i>0){
                if (tabInt[i]<=tabInt[i-1])
                    ord=false;
            }
        }
        System.out.println();  
        if (ord) 
            System.out.println("Le tableau est ordonné"); 
        else 
            System.out.println("Le tableau n'est pas ordonné");    
    }

}

