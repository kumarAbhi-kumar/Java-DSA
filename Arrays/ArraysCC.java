public class ArraysCC{
    public static void proffOfArrayBeingPassedAsReference(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static int findLargest(int marks[]){
        int largestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < marks.length; i++){
            largestNumber = (largestNumber < marks[i]) ? marks[i] : largestNumber;
        }
        return largestNumber;
    }

    public static int findSmallest(int marks[]){
        int smallestNumber = Integer.MAX_VALUE;
        for(int i = 0; i < marks.length; i++){
            if(smallestNumber > marks[i])
                smallestNumber = marks[i];
        }
        return smallestNumber;
    }

    public static int binarySearch(int []arr, int key){
        // 14, 12, 10, 8, 6, 4, 2
        int lPr = 0;
        int uPr = arr.length-1;
        int mid;
        while(lPr <= uPr){
            mid = (lPr + uPr) / 2;
            if(key > arr[mid])
                uPr = mid-1;
            else if(key < arr[mid])
                lPr = mid + 1;
            else if(key == arr[mid])
                return mid+1;
        }
        return -1;
    }

    public static void printSubarrays(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\n");
            for(int j = i+1; j < arr.length; j++){
                for(int startIndex = i; startIndex <= j; startIndex++)
                    System.out.print(arr[startIndex]+" ");
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
         * Once the array is defined all its position is given a default value int - 0, string - "", double = 0.0, boolean = false;
         * Arrays are always passed by reference to the function while primitive data types are not, not even String, not even Wrapper Class
         */
        
         /*
        int []marks = {10, 15, 16};
        proffOfArrayBeingPassedAsReference(marks);
        for (int i : marks) {
            System.out.println(i);
        }
        */
       
        // findLargest() & findSmallest
        /*
            int numbers[] = {1, 2, 9, 6, 8, 10, 25, 8};
            int largestNumber = findLargest(numbers);
            System.out.println(largestNumber);

            System.out.println(findSmallest(numbers));
        */

        // BinarySearh
        /*
        int []number = {14, 12, 10, 8, 6, 4, 2};
        int result = binarySearch(number, 10);
        if(result == -1)
            System.out.println("Element Not Found!");
        else
            System.out.println("Element found at position " + result);
         */

         int arr[] = {2, 4, 6, 8, 10};
         printSubarrays(arr);
         
    }
}