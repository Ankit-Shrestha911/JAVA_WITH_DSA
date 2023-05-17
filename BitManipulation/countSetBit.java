public class countSetBit {

    public static int countSetBits(int number)
    {
        if(number == 0) return 0;
        int count = 0;
        while(number > 0)
        {
            if((number&1) == 1)
                count++;

            number = number>>1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(25));
        
    }
    
}
