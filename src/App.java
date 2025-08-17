import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var book1=new Book();
        var book2=new Book("Programacion en Java","Tatiana Rubio",800);
        var book3=new Book("Learn English","Luisa Perdomo",700,
        LocalDate.of(2022,10,25),
        "English School","Aprendizaje");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        var person=new Person("Santiago","Rubio");
    }
}
