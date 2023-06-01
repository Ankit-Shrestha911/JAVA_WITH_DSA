public class OperationBits {

    public static int getBit(int bit, int pos) {
        return (bit >> (pos - 1)) & 1;
    }

    public static int setBit(int bit, int pos) {
        return (1 << (pos - 1)) | bit;
    }

    public static int clearBit(int bit, int pos) {
        return ~(1 << (pos - 1)) & bit;
    }

    public static int updateBit(int bit, int pos, int val) {
        // if (val == 0)
        //     return clearBit(bit, pos);
        // else
        //     return setBit(bit, pos);

        bit = clearBit(bit, pos);

        return (val<<(pos-1))|bit;
        

    }

    public static int clearNthBit(int bit, int pos)
    {
        return (~0)<<(pos)&bit;
    }

    public static int clearInRange(int bit, int i, int j)
    {
        int a = (~0)<<(j+1-1);
        int b = (1<<(i-1))-1;

        return (a|b)&bit;
    }

    public static void main(String[] args) {
        
         System.out.println(clearInRange(10, 2, 4));
        

    }

}
