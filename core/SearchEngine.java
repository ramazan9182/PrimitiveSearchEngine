package core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Page;
import util.PageGenerator;

public class SearchEngine {

	private static final String DEFAULT_DELIMITER = " ";
	
	public SearchResult search(String key) {
		SearchResult result = new SearchResult();
		for(Page page : PageGenerator.generatePages(10)) {
			result.getResults().add(calculateWordFrequency(parse(DEFAULT_DELIMITER,page.getContent())));
			//TODO: calculate ranks
		}
		return result;
	}
	
	private String[] parse(String delimiter, String content) {
		return content.split(delimiter);
	}
	
	private Map<String,Integer> calculateWordFrequency(String[] words){
		Map<String,Integer> wordFrequencies = new HashMap<String, Integer>();
		for(int i = 0; i < words.length; i ++) {
				String key = words[i].toLowerCase();
				if(key.length() > 0) {
					if(!wordFrequencies.containsKey(key)) {
						wordFrequencies.put(key,1);
					}else {
						int value = wordFrequencies.get(key);
						wordFrequencies.put(key,++value);
					}
				}
		}
		
		return wordFrequencies;
		
	}
	
}
