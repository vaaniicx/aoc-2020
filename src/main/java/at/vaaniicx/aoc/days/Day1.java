package at.vaaniicx.aoc.days;

import at.vaaniicx.aoc.util.FileHelper;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Day1 {

    private Day1() {

    }

    public static void solve() throws IOException {
        List<Integer> numbers = FileHelper.getLinesFromFile(FileHelper.getFileName(1)).stream()
                .map(Integer::parseInt) // Mappen auf Integer
                .collect(Collectors.toList()); // Als Liste zurückgeben

        System.out.println("The sum of the two numbers (x + y = 2020) is: " + solvePart1(numbers));
        System.out.println("The sum of the three numbers (x + y + z = 2020) is: " + solvePart2(numbers));
    }

    private static int solvePart1(List<Integer> numbers) {

        return -1;
    }

    private static int solvePart2(List<Integer> numbers) {

        return -1;
    }
}
