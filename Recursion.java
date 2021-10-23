public class Recursion
{
    public static void main(String[] args){
        System.out.println(Recursion.factorial(4));
    }

    public static long factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}