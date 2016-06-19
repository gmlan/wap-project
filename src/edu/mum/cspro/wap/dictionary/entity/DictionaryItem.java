package edu.mum.cspro.wap.dictionary.entity;

public class DictionaryItem {

	String word;
	String wordtype;
	String definition;
	
	public DictionaryItem(String word, String type, String definition) {
		super();
		this.word = word;
		this.wordtype = type;
		this.definition = definition;
	}

	public DictionaryItem() {
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
 

	public String getWordtype() {
		return wordtype;
	}


	public void setWordtype(String wordtype) {
		this.wordtype = wordtype;
	}


	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
}
