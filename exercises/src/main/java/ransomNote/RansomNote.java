package ransomNote;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 * Note:
 * In case of invalid arguments you should throw java.lang.IllegalArgumentException
 */

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine == null || ransomNote == null || magazine.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (ransomNote.length() > magazine.length()) {
            return false;
        } else {
            List<Character> ransomList = ransomNote.toLowerCase().chars()
                    .mapToObj(c -> (char) c)
                    .sorted()
                    .collect(toList());

            List<Character> magazineList = magazine.toLowerCase().chars()
                    .mapToObj(c -> (char) c)
                    .sorted()
                    .collect(toList());

            List<Character> intersection = new ArrayList<>();
            for (Character character : magazineList) {
                if (ransomList.contains(character)) {
                    intersection.add(character);
                }
            }
            for (char c : ransomList) {
                System.out.print(c);
            }
            System.out.println();
            for (char c : magazineList) {
                System.out.print(c);
            }
            System.out.println();
            for (char c : intersection) {
                System.out.print(c);
            }
            return ransomList.equals(intersection);
        }
    }

}