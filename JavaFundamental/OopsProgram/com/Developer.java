package OopsProgram.com;


// Inheritance,Polymorphism and abstraction.
public class Developer extends Employee {

    void programming() {
        System.out.println("The Developer is programming in java");
    }

    // Abstraction is the concept of hiding the implementation details and
    //showing only functionality to the user.
   void talking()
    {
        System.out.println("Employee is talking with other people");
    }
}
