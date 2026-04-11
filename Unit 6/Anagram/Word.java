
import java.util.ArrayList;

public class Word {

    private String originalWord;
    private String sortedWord;
    private ArrayList<String> characters;

    public Word(String word) {
        originalWord = word;
        word = word.toLowerCase();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            int num = (int) word.charAt(i);
            if (num < 97 || num > 122) {
                throw new IllegalArgumentException("Error. Word contains numbers or special characters.");
            }
            list.add(i, "" + word.charAt(i));
        }
        characters = list;
        sortedWord = sortWord();
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public String sortWord() {
        for (int i = 0; i < characters.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < characters.size(); j++) {
                char a = characters.get(j).charAt(0);
                char b = characters.get(min).charAt(0);
                if ((int) a < (int) b) {
                    min = j;
                }
            }
            if (min != i) {
                swap(i, min);
            }
        }
        String ret = "";
        for (int i = 0; i < characters.size(); i++) {
            ret = ret + characters.get(i);
        }
        return ret;
    }

    public void swap(int a, int b) {
        String temp = characters.get(b);
        characters.set(b, characters.get(a));
        characters.set(a, temp);
    }
}
