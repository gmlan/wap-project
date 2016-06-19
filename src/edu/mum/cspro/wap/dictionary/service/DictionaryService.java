package edu.mum.cspro.wap.dictionary.service;

import java.util.List;

import edu.mum.cspro.wap.dictionary.entity.DictionaryItem;

public interface DictionaryService {
	List<String> search(String query);
	List<DictionaryItem> searchWord(String query);
}
