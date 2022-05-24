package at.vaaniicx.aoc.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    private FileHelper() {

    }

    public static List<String> getLinesFromFile(String fileName) throws IOException {

        List<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        bufferedReader.close();

        return lines;
    }

    public static String getFileName(int day) {
        return "src/main/resources/files/day_" + day + ".txt";
    }
}
