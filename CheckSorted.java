public class CheckSorted {
    public static int isSorted(int n, int []a) {
        for(int curr = 0;curr + 1 < n;curr++)
        {
            if(a[curr] > a[curr+1]) return 0;
        }
        return 1;
    }
}
