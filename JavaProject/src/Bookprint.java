public class Bookprint {
    public static void main(String[] args) {
        Book book = new Book();

        book.title = "goodMorning";
        book.setAuthor("강탄우");
        System.out.println(book.title);
        System.out.println(book.getAuthor());
    }
}
