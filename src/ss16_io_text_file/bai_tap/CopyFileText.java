package ss16_io_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static int count(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c != ' ' && c != '\n')
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file nguồn: "); //src\\ss16_io_text_file\\source.txt
        Scanner scanner = new Scanner(System.in);
        String sourcePath = scanner.nextLine();
        File file = new File(sourcePath);
        try {
            if (file.createNewFile()) {
                System.out.println("Đã tạo File...");
            } else {
                System.out.println("File đã tồn tại...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập đường dẫn file đích: "); //src\\ss16_io_text_file\\target.txt
        String targetFile = scanner.nextLine();
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(sourcePath);
            bufferedReader = new BufferedReader(fileReader);
            StringBuffer result = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
            try {
                fileWriter = new FileWriter(targetFile);
                fileWriter.write(String.valueOf(result));
                fileWriter.write("\nSố ký tự: " + count(String.valueOf(result)));
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
