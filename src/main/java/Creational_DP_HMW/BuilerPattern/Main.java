package Creational_DP_HMW.BuilerPattern;

public class Main {
    public static void main(String[] args) {

        BookBuilder bookBuilder=new BookBuilder();
        Client client =new Client();
        Client client1=new Client();
        Client client2=new Client();
        client.makeBook1(bookBuilder);
        client1.makeBook(bookBuilder);
        client2.makebook2(bookBuilder);
        Book book=bookBuilder.build();
        Book book1=bookBuilder.build();
        Book book2=bookBuilder.build();
        System.out.println(book.print());
        System.out.println(book1.print());
        System.out.println(book2.print());

    }
}
