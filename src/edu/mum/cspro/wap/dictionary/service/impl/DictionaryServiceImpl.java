package edu.mum.cspro.wap.dictionary.service.impl;

import java.util.List;

import edu.mum.cspro.wap.dictionary.dao.DictionaryDataAccessor;
import edu.mum.cspro.wap.dictionary.dao.impl.DictionaryDataAccessorImpl;
import edu.mum.cspro.wap.dictionary.entity.DictionaryItem;
import edu.mum.cspro.wap.dictionary.service.DictionaryService;

public class DictionaryServiceImpl implements DictionaryService {

	private DictionaryDataAccessor dao = new DictionaryDataAccessorImpl();
	
	@Override
	public List<DictionaryItem> searchWord(String query) {
		return dao.searchWord(query);
	}

	@Override
	public List<String> search(String query) {
		return dao.search(query);
	}

}
