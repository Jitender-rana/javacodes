public class quicksort{
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quick_sort(arr, low, pivotIndex - 1);
            quick_sort(arr, pivotIndex + 1, high);
        }
    }

    public static void print(int[] arr, int low, int high) {
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 1, 5, 9, 8};
        int low = 0;
        int high = arr.length - 1;
        quick_sort(arr, low, high);
        print(arr, low, high);
    }
}