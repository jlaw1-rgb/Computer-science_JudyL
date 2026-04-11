
public class Tester {

    public static void main(String[] args) {
        Word abc = new Word("abc");
        Word word = new Word("word");
        Word pineapple = new Word("pineapple");
        Word cba = new Word("cba");
        Word s = new Word("silent");

        AnagramList a = new AnagramList();
        a.add(abc);
        a.add(word);
        a.add(pineapple);
        a.add(cba);
        // System.out.println("\n" + a.searchAnagrams("abc"));
        System.out.println("" + s.getSortedWord());
    }
}
