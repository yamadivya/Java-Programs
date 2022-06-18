package divya;

public class MaxMin {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(maximum(A, A.length-1));
        System.out.println(minimum(A, A.length-1));
    }

    static int maximum(int[] A, int index){
        if(index == 0)
            return A[0];

        return Math.max(A[index], maximum(A, index-1));
    }

    static int minimum(int[] A, int index){
        if(index == 0)
            return A[0];

        return Math.min(A[index], minimum(A, index-1));
    }
}
