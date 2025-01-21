package com.xworkz.assign.things;

import java.util.Objects;

public class BookDetails {

    private int bookId;
    private String bookName;
    private String authorName;
    private String authorEmail;
    private String publishedBy;
    private String placeOfPublication;
    private String language;
    private int bookPrice;
   

    // Constructors
    public BookDetails() {
    	System.out.println("Default Constructor");
    }


	public BookDetails(int bookId, String bookName, String authorName, String authorEmail, String publishedBy,
			String placeOfPublication, String language, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.authorEmail = authorEmail;
		this.publishedBy = publishedBy;
		this.placeOfPublication = placeOfPublication;
		this.language = language;
		this.bookPrice = bookPrice;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getAuthorEmail() {
		return authorEmail;
	}


	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}


	public String getPublishedBy() {
		return publishedBy;
	}


	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}


	public String getPlaceOfPublication() {
		return placeOfPublication;
	}


	public void setPlaceOfPublication(String placeOfPublication) {
		this.placeOfPublication = placeOfPublication;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", authorEmail=" + authorEmail + ", publishedBy=" + publishedBy + ", placeOfPublication="
				+ placeOfPublication + ", language=" + language + ", bookPrice=" + bookPrice + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(authorEmail, authorName, bookId, bookName, bookPrice, language, placeOfPublication,
				publishedBy);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookDetails other = (BookDetails) obj;
		return Objects.equals(authorEmail, other.authorEmail) && Objects.equals(authorName, other.authorName)
				&& bookId == other.bookId && Objects.equals(bookName, other.bookName) && bookPrice == other.bookPrice
				&& Objects.equals(language, other.language)
				&& Objects.equals(placeOfPublication, other.placeOfPublication)
				&& Objects.equals(publishedBy, other.publishedBy);
	}
	
}
