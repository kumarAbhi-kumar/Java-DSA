public class sortingArrays{

    public static void bubbleSort(int []arr){
        int temp;
        for( int i = 0; i < arr.length - 1; i++ ){
            for( int j = 0; j < arr.length - (i + 1); j++ ){
                if( arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int []arr){
        int smallestIndex = 0;
        int temp;
        for( int i = 0; i < arr.length - 1; i++){
            for ( int j = i + 1; j < arr.length; j++ ){
                if( arr[smallestIndex] > arr[j])
                    smallestIndex = j;
            }
            temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int []arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1)
                System.out.print(arr[i]+"]");
            else
                System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int []arr = {5, 4, 1, 3, 2};
        // bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
}