package utils;

public class ArrayUtils {    
    public static int[] reverse(int[] arr) 
    {
        int[] array = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            array[i] = arr[arr.length-i-1];
        return array;
    }
    public static String stringifyArray(int[] arr) {
        String[] array = new String[arr.length];
        for(int i = 0; i<arr.length; i++)
            array[i] = Integer.toString(arr[i]);
        return String.join(",", array);
    }
}