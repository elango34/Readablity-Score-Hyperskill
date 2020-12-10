
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


            Scanner scanner4 = new Scanner(System.in);
            String stringCopy = "";
            try {
                stringCopy = new String(Files.readAllBytes(Paths.get(args[0])));
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }

            StringAnalyser stringAnalyser = new StringAnalyser(stringCopy);
            stringAnalyser.count();
            double words = stringAnalyser.getWords();
            double sentences = stringAnalyser.getSentences();
            double characters = stringAnalyser.getCharacters();
            int syllableCount = 0;
            int polySyllableCount = 0;

            System.out.println("The text is: ");
            System.out.println(stringCopy);
            System.out.println("Words: " + (int)words);
            System.out.println("Sentences: " +(int)sentences);
            System.out.println("Characters: " +(int)characters);
            Syllable syllable = new Syllable(args[0]);
            syllable.countSyllable();
            syllableCount = syllable.getSyllable();
            polySyllableCount = syllable.getPolySyllable();
            System.out.println("Syllables: " + syllableCount);
            System.out.println("Polysyllables: " +polySyllableCount);
            System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
            String e = scanner4.nextLine();
            scanner4.close();
            System.out.println("");

            Readablity readablity = new Readablity(stringAnalyser,syllable);

            if (e.equals("ARI")) {
                String d = readablity.getARI();
                System.out.println("Automated Readability Index: " +d);
            }
            if (e.equals("FK")) {
                String u = readablity.getFK();
                System.out.println("Flesch–Kincaid readability tests: " + u);
            }
            if (e.equals("SMOG")) {
                String s = readablity.getSMOG();
                System.out.println("Simple Measure of Gobbledygook: " + s);
            }
            if (e.equals("CL")) {
                String a = readablity.getCL();
                System.out.println("Coleman–Liau index: " + a);
            }
            if (e.equals("all")) {
                System.out.println("Automated Readability Index: " +readablity.getARI());
                System.out.println("Flesch–Kincaid readability tests: " + readablity.getFK());
                System.out.println("Simple Measure of Gobbledygook: " + readablity.getSMOG());
                System.out.println("Coleman–Liau index: " + readablity.getCL());
                System.out.println("");
                double score = readablity.calculateAge(readablity.getScore1()) + readablity.calculateAge(readablity.getScore2()) + readablity.calculateAge(readablity.getScore3()) + readablity.calculateAge(readablity.getScore4());
                System.out.println("This text should be understood in average by "+ score / 4.0 +" year olds.");
            }

        }


    }


