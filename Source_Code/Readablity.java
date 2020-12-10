
public class Readablity {
    
    private double score1;
    private double score2;
    private double score3;
    private double score4;
    private int age;
    private String ARI;
    private String FK;
    private String SMOG;
    private String CL;
    private double words;
    private double sentences;
    private double characters;
    private int syllableCount;
    private int polySyllableCount = 0;
    private int[] ages = {0,6,7,9,10,11,12,13,14,15,16,17,18,24,25};
    private StringAnalyser a;
    private Syllable b;

    public Readablity(StringAnalyser c, Syllable d) {
        this.a  = c;
        this.b = d;
        words = a.getWords();
        sentences = a.getSentences();
        characters = a.getCharacters();
        syllableCount = b.getSyllable();
        polySyllableCount = b.getPolySyllable();
    }

    private void ARI() {
        double d =(4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43);
//        double e = Math.round(d * 100.0) / 100.0;       // .0 is important
        score1 = round(d);
        age = calculateAge(score1);
        String a = combine(age);
        ARI = score1 + a;
    }

    private void FK() {
        double s = syllableCount;
        double score = 0.39 * (words / sentences) + 11.8 * (s / words) - 15.59;
        score2 = round(score);
        age = calculateAge(score2);
        String a = combine(age);
        FK = score2 + a;
    }

    private void SMOG() {
        double score = 1.043 * (Math.sqrt((double) polySyllableCount * (30.0 / sentences))) + 3.1291;
        score3 = round(score);
        age = calculateAge(score3);
        String a = combine(age);
        SMOG =  score3 + a;
    }
    private void CL() {
        double score = (0.0588 * (characters / (words)) * 100.0) - (0.296 * (sentences / (words)) * 100.0) - 15.8;
        score4 = round(score);
        age = calculateAge(score4);
        String a = combine(age);
        CL = score4 + a;
    }


    public String getARI() {
        ARI();
        return ARI;
    }

    public String getFK() {
        FK();
        return FK;
    }

    public String getSMOG() {
        SMOG();
        return SMOG;
    }

    public String getCL() {
        CL();
        return CL;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public double getScore4() {
        return score4;
    }

    public int calculateAge(double a) {
        return ages[(int)Math.round(a)];
    }




    public String combine(int c) {

        String a =  " (about ";
        String b = " year olds).";
        if (c == 25) {
            return a + "24"+" "+ b;
        } else {
            return a + c + b;
        }
    }
    public double round(double a) {
        a = Math.round(a * 100.0) / 100.0;
        return a;
    }
}
