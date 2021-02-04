package assignment1.solution.exercise2;

public class BookTest {
    public static void main(String[] args) {
        Book myBook1 = new Book("978-0201633610", "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", 25, "Software");
        Book myBook2 = new Book("978-0132350884", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 42, "Biography");
        System.out.println("My first Book Genre = " + myBook1.getGenre());
        System.out.println("My second Book Genre = " + myBook2.getGenre());
    }
}
