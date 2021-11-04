//https://habr.com/ru/post/440436/
//        Практические задачи по Java


//5.0. Частотный словарь букв русского (или английского) алфавита.
//
//        Задача:
//
//        Постройте частотный словарь букв русского (или английского) алфавита. Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).



import java.util.HashMap;
import java.util.TreeMap;

import static java.util.Map.of;

class Map {
   private char l;
   private int volume;
    HashMap<Character, Integer> h = new HashMap<>();
//
//    Map(char l, int volume) {
//        this.volume = volume;
//        this.l = l;
//   }

    public TreeMap frequency(String string) {   // частота
        char key;
        int volume;

        string.toLowerCase();
        char l = 'а';
        for(int i = 0; i<33; i++) {
            volume = searchLitera(l, string);
            key = l;
            h.put(key, volume);
            l++;
        }
       return sorting(h);
    }
    private TreeMap sorting(HashMap hm) {
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>(hm);
        return treeMap;
    }



    private int searchLitera(char l, String string) { // смотрим сколько раз буква встречается
        int len = string.length();
        int n =0;
        for (int i = 0; i<len; i++) {
            if (string.charAt(i)==l) {
                n++;
            }
        }
        return n;

        }
}
