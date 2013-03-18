package com.kullmann.java.sax;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Book class stores book information, after parsing the xml
 * @author Ganesh Tiwari
 */
public class Book {
    private String lang;
    private String title;
    private String id;
    private String isbn;
    private Date regDate;
    private String publisher;
    private int price;
    private List<String> authors;
    public Book(){
        setAuthors(new ArrayList<String>());
    }
    //getters and setters
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
    @Override
    public String toString(){
    	String result = "";
    	
    	result = "Book: " + this.getId() + ", " + this.getIsbn() + ", " + this.getLang() + ", " + this.getPublisher() + ", " + this.getAuthors() + ", " + this.getTitle() + ", " + this.getPrice();
    	
    	return result;
    }
}

