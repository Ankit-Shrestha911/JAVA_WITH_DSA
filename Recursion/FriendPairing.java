public class FriendPairing {

    public static int friendPairing(int n) {
        if (n == 1 || n == 2)
            return n;

        /*
         * Here we have choice for every friend whether he want to single
         * or in pair
         * For single: if n friend are there and 1 friend separate from other
         * then n-1 friends are remain
         * For pair: pair made up of 2 friends atmost so if a,b,c are friends
         * then 'a' separate from (b,c) then 'a' has choice whether he pair up
         * with b or c we have combination are:
         * (a,b) and (a,c) which is 2
         */

        return friendPairing(n - 1) + (n - 1) * friendPairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(4));
    }
}
