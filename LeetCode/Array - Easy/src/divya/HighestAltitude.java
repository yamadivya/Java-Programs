package divya;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int l=gain.length;
        int s=0;
        for(int i=0;i<l;i++){
            s=s+gain[i];
            max=Math.max(s,max);
        }
        if(max<0)
            return 0;
        return max;

    }
}
