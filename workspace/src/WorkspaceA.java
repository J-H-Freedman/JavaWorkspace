public class WorkspaceA {
    void sortNumbers(int[] numbers) {
        // on each iteration until the end of the numbers list...
        for (int i = 1; i < numbers.length; i++) {
            //establish key
            int key = numbers[i];

            //insert i into sequence
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test1 = {2, 1, 4, 3, 6, 5, 10, 11};
        int[] test2 = {31, 41, 59, 26, 41, 58};
        printArray(test2);
        WorkspaceA input = new WorkspaceA();
        input.sortNumbers(test2);

        printArray(test2);

    }
}