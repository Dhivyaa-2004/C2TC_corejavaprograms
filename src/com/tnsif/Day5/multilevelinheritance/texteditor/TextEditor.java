package com.tnsif.Day5.multilevelinheritance.texteditor;

public class TextEditor {
    public static void main(String[] args) {
        Word word = new Word();

        word.write("Perfect ");
        word.formatText(true);   // Bold the current content
        word.write("Day!");      // Add more text
        word.displayContent();   // Display content with formatting

        word.spellCheck();       // Run spell check

        // Correct: use object reference, not static
        System.out.println("Was the day good? Bold? " + word.isBold());

        System.out.println("Disable spell check in Word.");
        ((Word) word).enableSpellCheck(false);
        ((Word) word).spellCheck();       // Spell check should be disabled now
    }
}


