
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Syllable {
   private int syllableCount = 0;
   private int polySyllableCount = 0;
   private int length = 0;
   private int count = 0;
   private String fileName;

   public Syllable(String fileName) {
        this.fileName =  fileName;
   }

   public void countSyllable() {
       countSyllable(fileName);
   }

    public int getSyllable() {
        return this.syllableCount;
    }

    public int getPolySyllable() {
        return this.polySyllableCount;
    }

    private void countSyllable(String fileName) {
        File file = new File(fileName);

        try {
            Scanner a = new Scanner(file);

            while (a.hasNext()) {
                count++;
                String g = a.next().toLowerCase();
                String j = g.replaceAll("you", "x");
                String f = j.replaceAll("[aeiouy]{2}", "x");
                String i = f.replaceAll("e\\b", "x");
                String h = i.replaceAll("[aeiouy]", "");
                length = g.length() - h.length();
                if (length == 0) {
                    length = 1;
                }

                syllableCount = syllableCount + length;

                if (length > 2) {
                    polySyllableCount++;
                }
            }
            a.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}



