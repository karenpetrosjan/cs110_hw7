package utils;
public class Math {
    public static int factorial(int num) {
        if(num==1) 
        return 1;
        return num*factorial(num-1);
    }
    public static int factorialLoop(int num) {
        int i=1;
        for(; num>1; num-- ) 
          i*=num;
        return i;
    }
}