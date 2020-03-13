import java.io.*;
import java.util.*;
/**
 * @author Zyablitsev Sergey
 */
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/words");
        Scanner sc = new Scanner(file);
        ArrayList arrayList = new ArrayList();
        while (sc.hasNext()) {
            String word = sc.next();
            arrayList.add(word);
        }
        System.out.println("Файл содержит слова: " + arrayList);
        Set<String> sSet = new TreeSet<>();

        Map<String, Integer> search = new HashMap<>();
        int x = 0;
        String a;
        String max[];
        max = new String[1];
        for (int i = 0; i < arrayList.size(); i++) {
            a = (String) arrayList.get(i);
            sSet.add(a);
            Integer count = search.get(a);
            if (count == null) {
                count = 0;
            }
            search.put(a, ++count);
            if (count > x) {
                x = count;
                max[0] = a;
            }
        }
        System.out.println("Сортировка в алфавитном порядке: " + sSet);
        System.out.println("Количество слов: " + search);
        System.out.println("Наибольшее содержание: " + max[0] + ", Количество повторений: " + x);
    }
}