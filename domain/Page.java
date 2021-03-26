package domain;

public class Page {
	
	private String title;
	private String content;
	
	
	public Page(String title, String content) {
		this.content = content;
		this.title = title;
	}
		
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getContent() {
		return content;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return title + "\n" + content + "\n";
	}
}

