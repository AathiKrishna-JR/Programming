public class SecondMinMax {
    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int fMax=Integer.MIN_VALUE,sMax = fMax;
        int fsm=Integer.MAX_VALUE,ssm = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            if(fMax < arr[i])
            {
                sMax = fMax;
                fMax = arr[i];

            }
            else if(sMax < arr[i] && fMax != arr[i])
            {
                sMax=arr[i];
            }


            if(fsm > arr[i])
            {
                ssm = fsm;
                fsm = arr[i];

            }

            else if (ssm > arr[i] && fsm != arr[i])
            {
                ssm = arr[i];
            }
        }
        return new int[] {sMax,ssm};
    }
}