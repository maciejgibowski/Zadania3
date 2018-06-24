package pl.coderslab.web;

public class Quote {
	private String author = "";
	private String content = "";

	public Quote() {
	}
	public Quote(String author, String content) {
		this.author = author;
		this.content = content;
	}
	public static Quote [] addSlot (Quote [] array) {
		Quote [] newArray = new Quote [array.length+1];
		if (array!=null) {
			for (int i=0; i<array.length; i++) {
				newArray[i]=array[i];
			}
		}
		return newArray;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}