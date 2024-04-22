import java.util.ArrayList;
import java.util.List;
public class Animal {
    private String animalName;
    private int animalAge;
    private double animalWeight;

    private List<Animal> animalList = new ArrayList<>();

    public Animal(String animalName, int animalAge, double animalWeight) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }
    public String getAnimalName() { return animalName; }
    public void setAnimalName(String animalName) { this.animalName = animalName; }
    public int getAnimalAge() { return animalAge; }
    public void setAnimalAge(int animalAge) { this.animalAge = animalAge; }
    public double getAnimalWeight() { return animalWeight; }
    public void setAnimalWeight(double animalWeight) { this.animalWeight = animalWeight; }

    public List<Animal> getAnimalList() { return animalList; }
    public void addAnimalToList(Animal animal) { this.animalList.add(animal); }

    @Override
    public String toString() {
        return animalName + " " + animalAge + " " + animalWeight;
    }
}
