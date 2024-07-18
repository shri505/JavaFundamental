package OopsProgram.com;

/*
Encapsulation is the
technique of making the fields in a class
private and providing access to them via public methods.
*/


class Project {
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
    public int setBudget(int i) {
        return budget;
    }
}
