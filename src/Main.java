import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Parašykite programą, "Gyvūnų prieglauda". Jums reikės sukurti pagrindinę klasę Gyvūnas,
//        kuri turės šiuos atributus: vardas, amžius ir svoris. Sukurkite reikiamus getterius ir setterius,
//        taip pat konstruktorių, leidžiantį sukurti gyvūno objektą su nurodytais atributais.
//
//        Toliau sukurti tris subklases: Šuo, Katė ir Paukštis. Kiekviena subklasė turi papildomus atributus,
//        pavyzdžiui, šuo turi veislę, katė turi kailio spalvą ir paukštis turi sparnų ilgį. Kiekviena subklasė
//        taip pat turi turėti savo konstruktorių, kuris prideda šiuos papildomus atributus, ir tinkamus getterius ir setterius.
//
//        Pridėkite funkcionalumą, kuris leidžia gyvūnus prisidėti prie prieglaudos sąrašo, juos pašalinti iš sąrašo
//        ir parodyti informaciją apie visus prieglaudos gyvūnus, įskaitant jų papildomus atributus.
//        Jūsų programa turėtų leisti vartotojui interaktyviai valdyti gyvūnų prieglaudos funkcijas,
//        įskaitant pridėjimą, pašalinimą ir informacijos rodymą. Taip pat svarbu, kad visi gyvūnai būtų tinkamai
//        atpažįstami pagal savo tipą ir turėtų skirtingas charakteristikas, priklausomai nuo subklasės, kuriai jie priklauso.
//        (Su įvestimi Scanner)

        Scanner scanner = new Scanner(System.in);
        Animal animal = null;
        //List<Animal> animalList = new ArrayList<>();
        String animalType = "";
        String choice = "";
        do{
            System.out.println("Pasirinkite veiksmą: ");
            System.out.println("(1)- aprašyti gyvūną ir pridėti į prieglaudos sąrašą, (2)- pašalinti gyvūną iš sąrašo");
            System.out.println("(3)- spausdinti prieglaudos gyvūnų sąrašą, (0)- pabaiga");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Aprašysite (1)- šunį, (2)- katę, (3) paukštį: ");
                    animalType = scanner.nextLine();
                    switch (animalType) {
                        case "1":
                            System.out.println("Įveskite: (vardas), (amžius), (svoris), (rūšis): ");
                            animal = new Dog(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble(), scanner.nextLine());
                            scanner.nextLine();
                            //animalList.add(animal);
                            animal.addAnimalToList(animal);
                            break;
                        case "2":
                            System.out.println("Įveskite: (vardas), (amžius), (svoris), (kailio spalva): ");
                            animal = new Cat(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble(), scanner.nextLine());
                            scanner.nextLine();
                            //animalList.add(animal);
                            animal.addAnimalToList(animal);
                            break;
                        case "3":
                            System.out.println("Įveskite: (vardas), (amžius), (svoris), (sparnų plotis): ");
                            animal = new Bird(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble());
                            scanner.nextLine();
                            //animalList.add(animal);
                            animal.addAnimalToList(animal);
                            break;
                        default:
                            System.out.println("Neteisingas pasirinkimas");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Prieglaudos gyvūnų sąrašas:");
                    for(Animal item : animal.getAnimalList()){
                        System.out.println(item);
                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas, bandykite dar kartą.");
            }
        } while(!choice.equals("0"));
        scanner.close();

    }
}