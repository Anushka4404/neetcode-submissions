class Solution {
    public boolean isHappy(int n) {
        Set<Integer>visit = new HashSet<>();
        while (!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquares(n);
            if (n==1)  return true;
        }
        return false;
    }
    public int sumOfSquares(int n) {
        int sum=0;
            for (int i=n;n!=0;n=n/10) {
                int rm = n%10;
                sum = sum + rm*rm;
            }
            return sum;
    }
}
