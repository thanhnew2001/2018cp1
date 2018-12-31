package rmit.p1;

public class Course {
    private String id;
    private String name;
    private double credits;
    public boolean isCapstone(){
        if(credits>30) return true;
        else return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
