public class Challange_3 {

    public static void main(String[] args) {

        int size = 7;
        int arr[] = { 47, 84, 75, 21, 14, 14, 79 };

        System.out.println("Median value is: " + findaMedian(arr, size));
        //System.out.println("Max value is: " + findaMax(arr, size));
        //System.out.println("Mode value is: " + findMode(arr, size));

    }

    static int findaMedian(int arr[], int size) {

        int median = 0;

        if (size % 2 == 1) {
            median = arr[(size + 1) / 2];
        } else {
            median = arr[size / 2];
        }

        return median;
    }

    static int findaMax(int arr[], int size) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
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
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxVal = arr[i];
            }
        }

        return maxVal;
    }

}