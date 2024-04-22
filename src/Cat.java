public class Cat extends Animal{
    private String coatColor;
    public Cat(String animalName, int animalAge, double animalWeight, String coatColor) {
        super(animalName, animalAge, animalWeight);
        this.coatColor = coatColor;
    }
    public String getCoatColor() { return coatColor; }
    public void setCoatColor(String coatColor) { this.coatColor = coatColor; }

    @Override
    public String toString() {
        return super.toString() + " " + coatColor;
    }
}
