public class Vehicle extends Queue<String> {
    private String descrition;
    private Queue<String> passengers;

    public Vehicle(String descrition) {
        this.descrition = descrition;
        this.passengers = new Queue<>();
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public void getPassageiros() {
        super.printQueue();
    }

    public void addPassageiros(String passageiros) {
        super.add(passageiros);
    }

    public void removePassageiros() {
        super.remove();
    }

    

}
