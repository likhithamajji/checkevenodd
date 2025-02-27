public class checkevenodd{
    public static void main(String[]args){
        int num=43;
        evenorodd(num);
    }
    public static void evenorodd(int num){
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.print("odd number");
        }
    }
}