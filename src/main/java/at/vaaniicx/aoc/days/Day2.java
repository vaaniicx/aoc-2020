package at.vaaniicx.aoc.days;

import at.vaaniicx.aoc.util.FileHelper;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Day2 {

    private Day2() {

    }

    public static void solve() throws IOException {
        List<String> lines = FileHelper.getLinesFromFile(FileHelper.getFileName(2));
        System.out.println("There are " + solvePart1(lines) + " valid passwords!");
        System.out.println("There are " + solvePart2(lines) + " valid passwords!");

    }

    private static int solvePart1(List<String> lines) {
        int min;
        int max;
        int counter = 0;
        int valids = 0;
        for (String line : lines) {
            String[] splits = line.split(" ");
            String[] minmax = splits[0].split("-");
            min = Integer.parseInt(minmax[0]);
            max = Integer.parseInt(minmax[1]);
            char character = splits[1].charAt(0);
            for (int i = 0; i < splits[2].length(); i++) {
                splits[2].charAt(i);
                if (character == splits[2].charAt(i)) {
                    counter++;
                }
            }
            if (counter <= max && counter >= min) {
                valids++;
            }
            counter = 0;
        }
        return valids;
    }

    private static int solvePart2(List<String> lines) {
        int pos1;
        int pos2;
        int valids = 0 ;
        for (String line : lines) {
            String[] splits = line.split(" ");
            String[] positions = splits[0].split("-");
            char key = splits[1].charAt(0);
            pos1 = Integer.parseInt(positions[0]);
            pos2 = Integer.parseInt(positions[1]);
            if (splits[2].charAt(pos1-1) == key ^ key == splits[2].charAt(pos2-1)){
                valids++;
            }
        }
        return valids;
    }
}
