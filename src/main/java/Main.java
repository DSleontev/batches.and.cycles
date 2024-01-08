import ru.netology.services.VacationService;

public class Main {

    public static void main(String[] args) {

        VacationService services = new VacationService();
        System.out.println();
        System.out.println("Количество отпусков за год "+ services.calculate(100000,60000,150000));

    }
}