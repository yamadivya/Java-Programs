package divya;

public class FlipInvert {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            swapArray(image[i]);
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == 1) image[i][j] = 0;
                else image[i][j] = 1;
            }
        }
        return image;
    }

    public static void swapArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
