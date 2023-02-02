

class Prime{


   

    public static void main(){

        int i , j, isprime = 0;

        for(i= 1; i<=20; i++){

            for (j = 2; j<= i/2; j++){

                if(i%j == 0){
                    isprime = 1;
                    break;
                }
            }
           
            if(isprime == 0 ){
                System.out.println(i +" ");
            }
        }

    }

}
        
    