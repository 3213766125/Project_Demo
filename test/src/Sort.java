import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        sequence();
    }

    public static void sequence(){
        int[] num = {1000, 15, 10, 5, 1};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
                if(num[j] > num[j+1]){
                    int temp;
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(num));
    }
}
