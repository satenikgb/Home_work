package Creational_DP_HMW.BuilerPattern;

public class Client {
    public void makeBook(BookBuilder bookBuilder){
        bookBuilder.setAuthor("AAAA");
        bookBuilder.setTitle("SSSS");
        bookBuilder.setCode("1111");
    }
    public void makeBook1(BookBuilder bookBuilder){
        bookBuilder.setAuthor("HermanHesse");
        bookBuilder.setTitle("Sidharta");

    }
    public void makebook2(BookBuilder bookBuilder){
        bookBuilder.setPublishingYear("2022");
        bookBuilder.setCode("1111");
        bookBuilder.setDescription("aaaaaaaaaaaaaaaaaaaaa");
        bookBuilder.setTitle("ssssssss");
        bookBuilder.setGenre("fantastic");
    }
}
