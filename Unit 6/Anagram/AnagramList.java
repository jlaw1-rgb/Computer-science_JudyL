
import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {

    private ArrayList<Word> wordList;

    public AnagramList() {
        this.wordList = new ArrayList<>();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        return word1.getSortedWord().equals(word2.getSortedWord());
    }

    public ArrayList<Word> searchAnagrams(String key) {
        Word Wkey = new Word(key);
        ArrayList<Word> set = new ArrayList<>();
        for (Word word : wordList) {
            if (checkAnagram(word, Wkey)) {
                set.add(word);
            }
        }
        return set;
    }

    @Override
    public Object get(int index) {
        return wordList.get(index);
    }

    @Override
    public int size() {
        return wordList.size();
    }

}
