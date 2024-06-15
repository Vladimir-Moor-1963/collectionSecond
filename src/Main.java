import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //Есть список оценок учеников
    //посчитайте среднее значение
    //найдите оценку, которая является второй среди самых лучших
    //100 бальная система
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1,101);
            list.add(number);

        }
        System.out.println(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
           // sum += list.get(i);
            int element = list.get(i);
            sum += element;

        }
        System.out.println(sum);
        System.out.println(sum / list.size());
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element > max){
                secondMax = max;
                max = element;
            }
           else if ( element > secondMax){
                secondMax = element;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);




    }
}
