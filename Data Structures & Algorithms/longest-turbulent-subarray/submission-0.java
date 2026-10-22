class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n<2) {
            return n;
        }
        int start=0,end=0;
        int maxi=1;
        
        while (start+1<n) {
            if (arr[start]==arr[start+1]) {
                start++;
                continue;
            }
        end=start+1;
        while (end+1<n && isTurbulentRules(arr,end)) {
            end++;
        }
        maxi= Math.max(maxi,end-start+1);
        start=end;
        }
        return maxi;
    }
    public boolean isTurbulentRules(int[] arr,int k) {
        return (arr[k]>arr[k-1] && arr[k]>arr[k+1]) || (arr[k]<arr[k-1] && arr[k]<arr[k+1]);
    }
    
}