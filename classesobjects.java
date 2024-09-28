class Student 
{
    String Name;
    int id;
    String Subject;

    public void setdata(String Name, String Subject)
    {
        this.Name=Name;
        this.Subject=Subject;
    }

    public void display()
    {
        System.out.println("Name os Student: "+Name);
        System.out.println("Subject of student: "+Subject);
    }
}

public class classesobjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setdata("Rudalph", "Computer Engineering");
        s1.id=9608;
        System.out.println("Id of student: "+s1.id);
        s1.display();

        s2.setdata("Gonsalves", "Computer Science Engineering");
        s2.id=9567;
        System.out.println("Id of student: "+s2.id);
        s2.display();
    }
}
