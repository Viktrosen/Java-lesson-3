import java.util.*;

public class MainClass1 {
static List <String> list = new ArrayList<>();
static String[] arr = {"butterfly","bug","caterpillar","caterpillar","bug","moth","bug","moth","mosquito","mosquito","mosquito","spider","spider","bee","scarab"};
static TreeSet<String> set = new TreeSet<>();
static int j = 0;

    public static void main(String[] args) {
        set.addAll(Arrays.asList(arr)); //Добавляем в множество весь массив, чтоб отбросить все повторяющиеся слова
        System.out.println(set);
        list.addAll(Arrays.asList(arr));//Добавляем в список весь массив, чтоб его отсортировать вместе с повторяющимися словами, для эффективного подсчёта числа повторов
        Collections.sort(list);

        String str = list.get(0);
        Iterator iter = set.iterator();

        for (int i = 1; i < list.size() ; i++) {
            if (str.equals(list.get(i))){
                j++;
            }
            else {
                System.out.println("Слово "+iter.next()+" встречается "+(j+1)+" раз(а)");
                j=0;
            }
            str = list.get(i);
        }
    }
}
