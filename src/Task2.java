public class Task1 {
    public static void main(String[] args) {
        //1
        final int[] arr = new int[]{2, 3, 22, -1, -5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }
    }
}