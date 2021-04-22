public class Factorial {
    public static int calculate(int number){
        int i = 0;
        int result = 1;
        while(i++ < number) {
            result *= i;
        }
        return result;
    }
}
