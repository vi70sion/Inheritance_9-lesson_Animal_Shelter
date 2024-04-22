public class Bird extends Animal{
    double wingSpan;

    public Bird(String animalName, int animalAge, double animalWeight, double wingSpan) {
        super(animalName, animalAge, animalWeight);
        this.wingSpan = wingSpan;
    }
    public double getWingSpan() { return wingSpan; }
    public void setWingSpan(double wingSpan) { this.wingSpan = wingSpan; }

    @Override
    public String toString() {
        return super.toString() + " " + wingSpan;
    }
}
