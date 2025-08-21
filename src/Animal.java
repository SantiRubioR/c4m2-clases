public class Animal {
    private String name;
    private Integer age;

    public Animal(String name, Integer age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public void sleep(){
        System.out.println("Z Z Z");
    }

    public void makeNoise(){
        System.out.println("Grrr");
    }
}