public class powerOf2 {
    
    public static boolean checkPowerOf2(int n)
    {
        return (n&(n-1)) == 0; // property of bits
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(16)); // true
        System.out.println(checkPowerOf2(15)); // false

        
    }
    
}

/*
 * if n is a power of 2 then AND with n-1 also be zero.
 */