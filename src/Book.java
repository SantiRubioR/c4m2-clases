import java.time.LocalDate;

public class Book {
    
    //Atributos
    private String title; //null
    private String author;
    //Wrapper Classes: Integer -> int, Character -> char. Byte, Short, Long, Float, Double, Boolean
    private Integer pages; //null
    private LocalDate publishDate;
    private String editor;
    private String category;

    //Constructor -> Inicializar el objeto
    //Autoboxing -> int --> Integer
    //Unboxing -> Integer --> int
    public Book(){
        title="Las aventuras de Santiago";
        author="Santiago Rubio";
        pages=200;
        publishDate=LocalDate.now();
        editor="McGrawHill";
        category="Action";
    }

    public Book(String title,String author,Integer pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
        publishDate=LocalDate.now();
        editor="McGrawHill";
        category="Action";
    }

    public Book(String title, String author,Integer pages,LocalDate publishDate, String editor,String category){
        this.title=title;
        this.author=author;
        this.pages=pages;
        this.publishDate=publishDate;
        this.editor=editor;
        this.category=category;
    }

    //Metodos
    public String giveMeYourTitle(){
        return this.title;
    }

    //Metodo getter -> Obtener los valores de los atributos get<Atributos>()
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPages() {
        return pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getEditor() {
        return editor;
    }

    public String getCategory() {
        return category;
    }

    //Setter -> Cambiar de manera directa el valor de un atributo -> set<Atributo>(TD par)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString(){
        return String.format("Libro: titulo=%s, autor=%s, paginas=%s, publicacion=%s, editorial=%s, categoria=%s",
                getTitle(),getAuthor(),
                getPages().toString(),getPublishDate().toString(),
                getEditor(),getCategory());
        //return "Libro[ titulo: "+title+", autor: "+author+", paginas: "+pages+"]";
    }
    
}
