package edu.mum.cspro.wap.dictionary.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import edu.mum.cspro.wap.dictionary.dao.DictionaryDataAccessor;
import edu.mum.cspro.wap.dictionary.entity.DictionaryItem;
import edu.mum.cspro.wap.dictionary.util.JdbcUtil; 

public class DictionaryDataAccessorImpl implements DictionaryDataAccessor {

	
	@SuppressWarnings("serial")
	List<DictionaryItem> fakeDatas = new ArrayList<DictionaryItem>(){
		{
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPLE","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPX","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZZZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("zzc","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("zb","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("za","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
			add(new DictionaryItem("APPZ","none","asdf  asdfasd asd asd sadf adsf asd dsa fasd d "));
		}
	};
	
	@Override
	public List<DictionaryItem> searchWord(String query) {
		/*return fakeDatas
				.stream()
				.filter(item -> item.getWord().toUpperCase().equals(query.toUpperCase()))
				.collect(Collectors.toList());*/
		
	//	String sql = "SELECT * FROM entries WHERE word = '" +  query +"'";
		String sql = "SELECT * FROM entries WHERE word = ?";
		try {
			 return JdbcUtil.getQueryRunner().query(sql, new BeanListHandler<DictionaryItem>(DictionaryItem.class), new Object[]{query});
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<String> search(String query) {
		/*return fakeDatas
				.stream()
				.filter(item -> item.getWord().toUpperCase().startsWith(query.toUpperCase()))
				.map(item -> item.getWord())
				.distinct()
				.collect(Collectors.toList());*/
		//List<String> sz = query( "SELECT distinct word FROM entries WHERE word LIKE '"  + query +"%'", String.class, new String[]{query});

		query = query + "%";
		String sql = "SELECT distinct word FROM entries WHERE word LIKE ?";
		try {
			 return JdbcUtil.getQueryRunner().query(sql, new ColumnListHandler<String>(1), new Object[]{query});
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
