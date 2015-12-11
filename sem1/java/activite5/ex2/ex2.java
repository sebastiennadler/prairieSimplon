class ex2{
    public static void main(String args[]){
        int tabInt[]={1,2,3,4};
        int min=0,max=0;

        System.out.println("Tableau : ");
        for (int i=0;i<tabInt.length;i++){
            System.out.print(" "+tabInt[i]);
        if (i==0){min=tabInt[i]; max=tabInt[i];}
        if (tabInt[i]<min)
            min=tabInt[i];
        if (tabInt[i]>max)
            max=tabInt[i];         
        }
        System.out.println();
        System.out.println("Min : ");
        System.out.println(" "+min);
        System.out.println("Max : "); 
        System.out.println(" "+max);
    
    }

}

