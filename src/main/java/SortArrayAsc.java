public class SortArrayAsc {
    public static void main(String[] args) {
        int[] result = new int[5];
        result[0] = 234;
        result[1] = 134;
        result[2] = 4;
        result[3] = 34;
        result[4] = 23;
        for (int i = 0; i < result.length; i++) {
            for (int j = result.length - 1; j > i; j--) {
                int temp = 0;
                if (result[i] > result[j]) {
                    temp = result[j];
                    result[j] = result[i];
                    result[i] = temp;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


