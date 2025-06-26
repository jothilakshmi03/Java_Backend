package zoho;

public class Twosum {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 7};
        int target = 5;
        int[] result = findTwoSum(array, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum pair found.");
        }
    }

    public static int[] findTwoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return null; // not found
    }
}
