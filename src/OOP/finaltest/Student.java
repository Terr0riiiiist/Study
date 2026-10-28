package OOP.finaltest;

public class Student {
    private String name;
    private int age;
    private int weight;
    private int height;

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public void study(){
        System.out.printf("%s is studying.",name);
    }





}
