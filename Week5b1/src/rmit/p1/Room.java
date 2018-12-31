package rmit.p1;

public class Room {
    private String number;
    private int pcs;
    private int capacity;

    public boolean canTeachP1(){
        if(pcs>15) return true;
        else return false;
    }

    public int getMaxNumberOfStudents(){
       if(pcs>capacity) return capacity;
       else return pcs;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", pcs=" + pcs +
                ", capacity=" + capacity +
                '}';
    }

    public Room(String number, int pcs, int capacity) {
        this.number = number;
        this.pcs = pcs;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
