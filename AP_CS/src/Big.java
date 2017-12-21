import java.math.BigInteger;
public class Big {

    public static void main (String [] args){
        for (int i = 0; i <= 30 ; i++){
            System.out.println(factorial(i));
        }
            //2. Since the upper bound of integer has been reached.
            BigInteger small = BigInteger.valueOf(17);
            BigInteger big = BigInteger.valueOf(1700000000);
            BigInteger total = small.add(big);
            //9. Mutable, since the value of it might be changed.

    }

    public static BigInteger factorial (double n){
        if (n == 0 || n == 1){
            return BigInteger.valueOf(1);
        }
        BigInteger n1,n2;
        n1 = BigInteger.valueOf(1);
        n2 = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            BigInteger i2 = BigInteger.valueOf(i);
            n1 = n2;
            n2 = n1.multiply(i2);
        }
        return n2;
    }


//    public static double factorial (double n){
//        if (n == 0 || n == 1){
//            return 1;
//        }
//        double n1,n2;
//        n1 = 1;
//        n2 = 1;
//        for (int i = 2; i <= n; i++){
//            n1 = n2;
//            n2 = n1 * i;
//        }
//        return n2;
//    }

}
