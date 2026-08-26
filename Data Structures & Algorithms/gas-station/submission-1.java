// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int n = gas.length;
//         int start = n-1, end = 0;
//         int tank = gas[start] - cost[start];
//         while (start>end) {
//             if (tank<0) {
//                 start--;
//                 tank+=gas[start]-cost[start];
//             }
//             else {
//                 tank+=gas[end]-cost[end];
//                 end++;
//             }
//         }
//         return tank>=0?start:-1;
//     }
// }


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        int total = 0,res=0;
        for (int i=0;i<gas.length;i++) {
            total+=(gas[i]-cost[i]);
            if (total<0) {
                total = 0;
                res=i+1;
            }
        }
        return res;
    }
}
