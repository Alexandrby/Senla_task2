package Task_3;

import java.util.*;

public class Task_3_words {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       String [] array;
       System.out.println("Enter sentence:");
       Scanner scanner = new Scanner(System.in);
       String str= scanner.nextLine();
       array =str.split(" ");
       for (String s:array){
            list.add(s);
       }
       Collections.sort(list);
      for (int i=0; i<list.size();i++){
            System.out.println(firstUpperCase(list.get(i)));
       }
    }
    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

}
