// Importáljuk a package-ekbe rendezett classokat
import data.Person;
import data.Staff;
import data.Student;

public class Main {
    public static void main(String[] args) {
        // Ezt nyugodtan módosítsd!
        Person person = new Person("Lali","1154 BP Kl");
        Staff staff = new Staff("Liza","1134 BP LK","Kolozsvár",100000);
        Student student = new Student("Gizi","1120 BP IKJ","BACKEND",2023,20140);

        System.out.println(person);
    }
}
