package com.biswajit.condigpatterns.twopointer;

public class ValidWordAbbrevation {
    /*
    physiotherapist -> 3sio5pist

    This is the only valid word abbreviation because “phy sio thera pist”
    exactly matches the given word and contains no leading zeroes.
     */

    public static void main(String[] args) {
        String[] words = {"a", "a", "abcdefghijklmnopqrst", "abcdefghijklmnopqrst", "word", "internationalization", "localization"};
        String[] abbreviations = {"a", "b", "a18t", "a19t", "w0rd", "i18n", "l12n"};

        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ".\t word: '" + words[i] + "'");
            System.out.println("\t abbr: '" + abbreviations[i] + "'");
            System.out.println("\n\t Is '" + abbreviations[i] + "' a valid abbreviation for the word '" + words[i] + "'? " + (validWordAbbreviation(words[i], abbreviations[i]) ? "Yes" : "No"));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

    private static boolean validWordAbbreviation(String word, String abbr) {

        if (word.length() < abbr.length())
            return false;

        int wordIndex = 0;
        int abbrIndex = 0;

        while (abbrIndex < abbr.length()) {
            if (Character.isDigit(abbr.charAt(abbrIndex))) {
                if (abbr.charAt(abbrIndex) == '0') {
                    return false;
                }
                int num = 0;


                while (abbrIndex < abbr.length() && Character.isDigit(abbr.charAt(abbrIndex))) {
                    num = num * 10 + (abbr.charAt(abbrIndex) - '0');
                    abbrIndex++;
                }
                wordIndex += num;
            } else {
                if (wordIndex >= word.length() || word.charAt(wordIndex) != abbr.charAt(abbrIndex)) {
                    return false;
                }
                wordIndex++;
                abbrIndex++;
            }
        }

        return wordIndex == word.length() && abbrIndex == abbr.length();
    }
}







