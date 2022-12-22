public class Challange_3 {

    public static void main(String[] args) {

        int size = 7; // initialize array size
        int arr[] = { 47, 84, 75, 21, 14, 14, 79 }; // initialize array

        // print funtions
        System.out.println("Median value is: " + findaMedian(arr, size));
        System.out.println("Max value is: " + findaMax(arr, size));
        System.out.println("Mode value is: " + findMode(arr, size));
        findPrimeNum(arr, size);

    }

    static int findaMedian(int arr[], int size) {

        int median = 0;

        median = arr[size / 2]; // divide array size by two and get index

        return median;
    }

    static int findaMax(int arr[], int size) {

        int max = arr[0]; // assing 0th index as max value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // check the max value is grater than to other index in array
                max = arr[i];
            }
        }

        return max;
    }

    static int findMode(int arr[], int size) {

        int maxVal = 0, maxCount = 0, count;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++; // get count of same values in array
                }
            }

            if (count > maxCount) { // if count is grater than max count
                maxCount = count; // get max count
                maxVal = arr[i]; // return max value array index
            }
        }

        return maxVal;
    }

    static void findPrimeNum(int arr[], int size) { //find prime number

        int status = 0;

        System.out.print("List of Prime Numbers: ");

        for (int i = 0; i < arr.length; i++) {
            status = 0;
            for (int j = 2; j < arr[i] / 2; j++) { 
                if (arr[i] % j == 0) { //check if i % j == 0
                    status = 1;
                    break;
                }
            }

            if (status == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

}