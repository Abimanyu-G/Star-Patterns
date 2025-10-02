public class star{
    public static void main(String args[]){

     
     /* ***
        ***
        ***   <-indha pattern ku */

        for(int i = 0; i<5; i++){
        
            for(int j = 0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

System.out.println();

        /*  *
            * *
            * * *
            * * * *      <-- indha pattern ku */

        for(int i =0; i<5; i++){
            for(int j = i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();


       /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5       <-- indha pattern ku  */

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print( j +  " ");
            }
            System.out.println();
        }
     System.out.println();



     /*
        * * * *
        * * *
        * *
        *               <--indha pattern ku */

      for(int i =  0; i<5; i++){
        for(int j = i; j<5 ; j++){
            System.out.print("* ");
        }
        System.out.println();
      }
System.out.println();

 
     /*
        1 2 3 4 5
        1 2 3 4
        1 2 3 
        1 2
        1        <-- indha pattern ku  */

        for(int i=5; i>0; i--){
         for(int j = 1 ; j<=i; j++){
            System.out.print(j + " ");
         }
         System.out.println();
        }


    /*      *
          * * *  
        * * * * *
      * * * * * * *    <-- indha pattern ku  */

     for(int i =0; i<5;i++){
        for(int j = 0; j < 5 -i-1; j++){
            System.out.print(" ");
        }
        for(int j = 0; j < i*2+1; j++){
            System.out.print("*");
        }
        for(int j = 0; j < 5 -i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
     }
     
    }
}