package entity.Media;

import java.util.Date;

public class Book extends Media{

    String author;

    String coverType;

    String publisher;

    String language;

    String bookType;

    Date publisherDate;

    int numOfPage;

    public Book(String title,String category, int price, int value, int quantity, String imageUrl, String author, String coverType, String publisher, String language, String bookType, int numOfPage, Date publisherDate) {
        super(title,category, price, value, quantity, imageUrl);
        this.author = author;
        this.coverType = coverType;
        this.publisher = publisher;
        this.language = language;
        this.bookType = bookType;
        this.numOfPage = numOfPage;
        this.publisherDate = publisherDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getPublisherDate() {
        return publisherDate;
    }

    public void setPublisherDate(Date publisherDate) {
        this.publisherDate = publisherDate;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }
}
