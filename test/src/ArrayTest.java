import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = new String[6];
        strings[1] = "a";
        strings[5] = "b";
        System.out.println(Arrays.toString(strings));

        Integer []  integer = {2 , 10 , 1000 ,20 , 100};
        Integer max = integer[1];
        for (int i = 0; i < integer.length; i++) {
            if(integer[i] > max){
                max = integer[i];
            }
        }
        System.out.println(max);
    }
}
