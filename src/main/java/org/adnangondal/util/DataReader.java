package org.adnangondal.util;

import javafx.util.Pair;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
  public static List<List<Integer>> readDay1NumbersFromFile(String fileName) {
    List<Integer> firstList = new ArrayList<>();
    List<Integer> secondList = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    try (InputStream is = DataReader.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] numbers = line.trim().split("\\s+");
        if (numbers.length >= 2) {
          firstList.add(Integer.parseInt(numbers[0]));
          secondList.add(Integer.parseInt(numbers[1]));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    result.add(firstList);
    result.add(secondList);
    return result;
  }

  public static List<List<Integer>> readDay2NubersFromFile(String filePath) {
    List<List<Integer>> result = new ArrayList<>();

    try (InputStream is = DataReader.class.getClassLoader().getResourceAsStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = br.readLine()) != null) {
        List<Integer> numbers =
            Arrays.stream(line.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        result.add(numbers);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return result;
  }

  public static String readDay3FromFile(String filepath) {
    StringBuilder contentBuilder = new StringBuilder();

    try (InputStream is = DataReader.class.getClassLoader().getResourceAsStream(filepath);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

      if (is == null) {
        throw new IOException("File not found: " + filepath);
      }

      String line;
      while ((line = br.readLine()) != null) {
        contentBuilder.append(line).append(System.lineSeparator());
      }
    } catch (IOException e) {
      // Handle the exception (e.g., log it)
      System.err.println("Error reading file: " + e.getMessage());
      return ""; // Return an empty string on error
    }

    return contentBuilder.toString();
  }

  public static String[][] readDay4FromFile(String filepath) {
    List<String[]> rows = new ArrayList<>();

    try (InputStream is = DataReader.class.getClassLoader().getResourceAsStream(filepath);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = br.readLine()) != null) {
        if (!line.trim().isEmpty()) {
          rows.add(line.split(""));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return rows.toArray(new String[0][]);
  }

  public static List<Pair<String, String>> parseRulesFromFile_day5(String fileName) throws IOException {
    List<Pair<String, String>> rules = new ArrayList<>();

    // Get the input stream for the file in the resources folder
    InputStream inputStream = DataReader.class.getClassLoader().getResourceAsStream(fileName);

    if (inputStream == null) {
      throw new IOException("File not found: " + fileName);
    }

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split("\\|");
        if (parts.length == 2) {
          rules.add(new Pair<>(parts[0], parts[1]));
        }
      }
    }

    return rules;
  }
  public static List<String> parsePageNumbersFromFile_day5(String fileName) throws IOException {
    List<String> pageNumbers = new ArrayList<>();

    // Get the input stream for the file in the resources folder
    InputStream inputStream = DataReader.class.getClassLoader().getResourceAsStream(fileName);

    if (inputStream == null) {
      throw new IOException("File not found: " + fileName);
    }

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = reader.readLine()) != null) {
        // Trim the line to remove any leading or trailing whitespace
        line = line.trim();
        if (!line.isEmpty()) {
          pageNumbers.add(line);
        }
      }
    }

    return pageNumbers;
  }
}

