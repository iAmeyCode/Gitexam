import javafx.stage.StageStyle;

class Fibonacci{

    public static void main(String args[]){

        int n1 =0;
        int n2 =1;
        int n3;
        int count=20;

        for(int i = 2; i<count ; i++ ){
            n3= n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }


    }
}


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