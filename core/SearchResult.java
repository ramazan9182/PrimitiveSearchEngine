package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchResult {
	
	private List<Map<String,Integer>> results;
	
	public SearchResult() {
		this.results = new ArrayList<Map<String,Integer>>();
	}
	
	public SearchResult(List<Map<String,Integer>> results) {
		this.results = results;
	}
	
	public void setResults(List<Map<String, Integer>> results) {
		this.results = results;
	}
	
	
	public List<Map<String, Integer>> getResults() {
		return results;
	}
	
}
