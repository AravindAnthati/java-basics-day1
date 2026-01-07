public class VariablesDemo {

    int instanceVar = 10;
    static double staticVar = 99.99;

    public static void main(String[] args) {

        int age = 19;
        float height = 5.6f;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Ashish";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Static Variable: " + staticVar);

        VariablesDemo obj = new VariablesDemo();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
