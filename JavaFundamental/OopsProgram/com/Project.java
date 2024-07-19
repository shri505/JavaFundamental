package OopsProgram.com;

/*
Encapsulation is the
technique of making the fields in a class
private and providing access to them via public methods.
*/

/*
Java does not support multiple inheritance directly with classes,
 meaning a class cannot inherit from more than one class. However,
  Java does support multiple inheritance of type, which is achieved through
  interfaces. A class can implement multiple interfaces, thus inheriting multiple sets of methods.
  In this code multiple interfaces used.
 */



public class Project implements Deploy, FeedBack {
    private String name;
    private int budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public void testing() {
        System.out.println("The project will be deployed after testing");
    }

    @Override
    public void clientFeedback() {
        System.out.println("Clients are satisfied by using the application");
    }
}
