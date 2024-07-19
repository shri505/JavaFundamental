package OopsProgram.com;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "xyz";
        e1.age = 23;
        e1.display();

        Developer developer = new Developer();
        developer.name = "John";
        developer.age = 30;
        developer.work();
        developer.programming();


        Project p = new Project();
        p.setName("Paytracz");
        p.setBudget(2500000);
        p.testing();
        p.clientFeedback();
        System.out.println("Project Name: " + p.getName());
        System.out.println("Project Budget: " + p.getBudget());
    }
}
