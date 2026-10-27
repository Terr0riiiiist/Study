package OOP.finaltest;

public class test {
    static void main() {
        Student s = new Student();
        s.setName("Kanade");
        s.setAge(19);
        s.setHeight(180);
        s.setWeight(70);

        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", Height: " + s.getHeight() + ", Weight: " + s.getWeight());
        s.study();
        
        /*增重10kg */
        int newweight = s.getWeight() + 10;
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", Height: " + newweight + ", Weight: " + s.getWeight());
    }
}
