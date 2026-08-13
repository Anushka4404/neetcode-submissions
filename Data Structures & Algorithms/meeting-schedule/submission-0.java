/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        //Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for (int i=0;i<n;i++) {
            Interval A = intervals.get(i);
            for (int j=i+1;j<n;j++) {
                Interval B = intervals.get(j);
                if (Math.min(A.end, B.end) > Math.max(A.start, B.start)) {
                    return false;
                }
            }
        }
        return true;
    }
}
