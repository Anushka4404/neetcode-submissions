class Solution {
    public int reverse(int x) {
        int res=0;
        final int MIN = -2147483648; // -2^31
        final int MAX = 2147483647;
        for (int i=x;x!=0;x=x/10) {
            int rm = x%10;
            if (res > MAX / 10 || (res == MAX / 10 && x > MAX % 10))
                return 0;
            if (res < MIN / 10 || (res == MIN / 10 && x < MIN % 10))
                return 0;
            res = res*10 + rm;
        }
        return res;
    }
}
