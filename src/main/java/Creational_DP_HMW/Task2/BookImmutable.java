package Creational_DP_HMW.Task2;

final class BookImmutable {
    private final String code;
    private final String title;
    private final String genre;
    private final String Author;
    private final String publishingYear;

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public String getDescribtion() {
        return describtion;
    }

    private final String describtion;

    public BookImmutable(String code, String title, String genre, String author, String publishingYear, String describtion) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        Author = author;
        this.publishingYear = publishingYear;
        this.describtion = describtion;
    }



}
