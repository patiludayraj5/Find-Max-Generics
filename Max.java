public class Max{
    private static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if (y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.printf("maximum of %d, %d, %d is %d\n ",3,5,2,maximum(3,5,2));
        System.out.printf("maximum of %.1f, %.1f, %.1f is %.1f \n",4.3,1.5,8.2,maximum(4.3,1.5,8.2));
        System.out.println("Maximum of Red,Yellow,Blue is "+maximum("Red","Yellow","Blue"));
    }
}