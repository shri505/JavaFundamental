package OopsProgram.com;

public class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "xyz";
        e1.age = 23;
        e1.display();
    }

        Developer devloper = new Developer();{
        devloper.work();
        devloper.programming();
    }

        Project p = new Project();
    {
        p.setName("Paytracz");
        p.setBudget(2500000);
        System.out.println("Name: " + p.getName());
        System.out.println("Budget: " + p.getBudget());
    }
}
