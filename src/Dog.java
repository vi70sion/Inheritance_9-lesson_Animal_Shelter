public class Dog extends Animal{
    private String dogBreed;
    public Dog(String animalName, int animalAge, double animalWeight, String dogBreed) {
        super(animalName, animalAge, animalWeight);
        this.dogBreed = dogBreed;
    }
    public String getDogBreed() { return dogBreed; }
    public void setDogBreed(String dogBreed) { this.dogBreed = dogBreed; }

    @Override
    public String toString() {
        return super.toString() + " " + dogBreed;
    }
}
