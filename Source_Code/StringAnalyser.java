
public class StringAnalyser {
    private double words;
    private double sentences;
    private double characters;
    private String stringCopy;

    public StringAnalyser(String a) {
        this.stringCopy = a;
    }
    public void count() {
        count(stringCopy);
    }

    private void count(String a) {
        this.stringCopy = a;
        words = stringCopy.split(" ").length;
        sentences = stringCopy.split("[!?.]").length;
        characters = stringCopy.replaceAll("[\\s]","").length();
    }

    public double getWords() {
        return words;
    }

    public double getSentences() {
        return sentences;
    }

    public double getCharacters() {
        return characters;
    }
}
