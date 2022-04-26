package Creational_DP_HMW.BuilerPattern;

public class Book {
    private String code;
    private String title;
    private String genre;
    private String author;
    private String publishingYear;
    private String description;

    public Book(String code, String title, String genre, String author,
                String publishingYear, String description) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }

    public String getCode() {
        return code;
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String print() {
        String info = "";
        info += "Author of book: " + author + "\n";
        info += "Title of book: " + title + "\n";
        info += "Code is book: " + code+ "\n";
        info += "Genre of book: " + genre + "\n";
        info+="The publishing year: "+publishingYear+"\n";
        info+="The description of book: "+description+"\n";

        return info;
    }
}
