public class Reformatory {
    private int totalWeightMeasured;
    
    public Reformatory() {
        this.totalWeightMeasured = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.totalWeightMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.totalWeightMeasured;
    }

}
