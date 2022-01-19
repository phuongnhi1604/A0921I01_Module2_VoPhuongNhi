package ss16_io_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("src\\ss16_io_text_file\\country.csv"));

            while ((line = bufferedReader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<String> parseCsvLine(String csvline) {
        List<String> result = new ArrayList<>();
        if (csvline != null) {
            String[] splitData = csvline.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> county) {
        System.out.println("Country [id = " + county.get(0) + ", code = " + county.get(1)
                + ", name = " + county.get(2) + "]");
    }
}
