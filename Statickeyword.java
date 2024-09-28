class StaticDemo {
    static int static_variable;
    int non_static_variable;

    public static void StaticMethod(int x){
        static_variable = x;
    }

    public void increase()
    {
        static_variable++;
        non_static_variable++;
    } 

    public void display()
    {
        System.out.println(static_variable);
        System.out.println(non_static_variable);
    }
}

public class Statickeyword {
    public static void main(String[] args) {
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();

        sd1.increase();
        sd1.increase();
        sd1.display();
        System.out.println("============");
        sd2.increase();
        sd2.increase();
        sd2.display();


        StaticDemo.StaticMethod(10);
        System.out.println(StaticDemo.static_variable);

    }
}

//Static methods can only access static variables

//Non static methods can access both static and non static variables

//When a object is created each method's and variable's instance is formed the times the object is created
//But in case of static variable there wont be forming of different instances for different objects

//Static methods and variables can be accessed directly without objects with the help of class names 
