package DAO;

import java.util.HashMap;
import java.util.Map;

public class DataDictionary {
    private static Map<String, String> wordList;
    static {
        wordList = new HashMap<>();
        wordList.put("hello", "Xin chào");
        wordList.put("apple", "Quả Táo");
        wordList.put("orange", "Quả Cam");
        wordList.put("lemon", "Quả Chanh");
        wordList.put("chery", "Quả chery");
        wordList.put("sugar", "Đường Ngọt");

    }
    public static boolean isAvailableInDictionary(String word){
        if (wordList.get(word) != null){
            return true;
        } else
            return false;
    }
    public static String displayMeanOfWord(String wordIsFinded){
        return wordList.get(wordIsFinded);
    }

}
