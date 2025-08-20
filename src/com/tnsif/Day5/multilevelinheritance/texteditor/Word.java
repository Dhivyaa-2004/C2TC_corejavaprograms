package com.tnsif.Day5.multilevelinheritance.texteditor;

public class Word extends Wordpad {
    private boolean spellCheckEnabled;

    public Word() {
        super();
        this.spellCheckEnabled = true;
    }

    public void spellCheck() {
        if (spellCheckEnabled) {
            System.out.println("Running spell check...");
        } else {
            System.out.println("Spell check is disabled.");
        }
    }

    public void enableSpellCheck1(boolean enable) {
        spellCheckEnabled = enable;
    }

	public void enableSpellCheck(boolean enable) {
		// TODO Auto-generated method stub
		
	}
}

