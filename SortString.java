package StringPractice;

/**
 * SortString
 */
public class SortString {
    public static void main(String[] args) {
        String name = "deepak"; 
        // char tamp;

        char[] arr = name.toCharArray();
        int l = arr.length;
        sort(arr, l);

        
        System.out.print(arr);
    }


    public static void sort(char[] arr, int l){
        if(l==1){
            return;
        }

    int count = 0;

    for (int i = 0; i < n - 1; i++)
        if (arr[i] > arr[i + 1]) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            count = count + 1;
        }

    if (count == 0)
        return;

    bubbleSort(arr, n - 1);
    }
}