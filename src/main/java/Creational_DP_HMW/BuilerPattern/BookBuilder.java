package Creational_DP_HMW.BuilerPattern;

public class BookBuilder implements Builder {
    private String author;
    private String title;
    private String code;
    private String publishingYear;
    private String description;
    private String genre;

    public BookBuilder setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;

    }

    @Override
    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;


    }

    @Override
    public BookBuilder setCode(String code) {
        this.code = code;
        return this;

    }

    public Book build() {
        return new Book(code,title,genre,author,publishingYear,description);
    }
}
