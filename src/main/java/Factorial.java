public class Factorial {
    public static int calculate(int number){
        if(number == 0){
            return 1;
        }
        return number * calculate(number-1);
    }
}
