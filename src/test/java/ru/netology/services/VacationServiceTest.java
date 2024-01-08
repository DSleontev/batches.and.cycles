import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;


public class VacationServiceTest {

    @Test
    public void shouldCalcVacationСonditionsOne () {
        VacationService services = new VacationService();
        int expected = 2;
        int actual = services.calculate(100000,60000,150000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcVacationСonditionsTwo () {
        VacationService services = new VacationService();
        int expected = 3;
        int actual = services.calculate(10000,3000,20000);

        Assertions.assertEquals(expected, actual);
    }
}
