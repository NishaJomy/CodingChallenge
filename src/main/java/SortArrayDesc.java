public class SortArrayDesc {
    public static void main(String[] args) {
        int[] result= {1,45,234,7};
        int temp=0;
        for (int i=0;i<result.length;i++) {
            for (int j = i+1; j <result.length; j++) {
                if (result[i] < result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
        }
    }

