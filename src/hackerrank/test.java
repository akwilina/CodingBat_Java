package hackerrank;
import java.util.*;

public class test {

    public static void main(String[] args) {



        List<Integer> candles = new ArrayList<>();
        candles.add(0, 8);
        candles.add(1, 9);
        candles.add(2, 1);
        candles.add(3, 8);


            int result = 1;
            int n = 1;

            for(int number : candles) {
                    if (n > candles.size()-1) {
                        break;
                    } else if (candles.get(n) == number){
                        result += 1;
                    }
                    n++;
            }
        System.out.println(result);




    }
}
