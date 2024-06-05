import org.example.SafeCounter;
import org.example.TwoMenOnePairOfShoes;
import org.jetbrains.kotlinx.lincheck.LinChecker;
import org.jetbrains.kotlinx.lincheck.annotations.Operation;
import org.jetbrains.kotlinx.lincheck.strategy.managed.modelchecking.ModelCheckingCTest;
import org.jetbrains.kotlinx.lincheck.strategy.stress.StressCTest;
import org.junit.jupiter.api.Test;

@ModelCheckingCTest
@StressCTest
public class TwoMenOnePairOfShoesTest {
    private TwoMenOnePairOfShoes m = new TwoMenOnePairOfShoes();

    @Operation
    public void left() {
        m.takeLeft();
    }

    @Operation
    public void right() {
        m.takeRight();
    }

    @Test
    public void test() {
        LinChecker.check(TwoMenOnePairOfShoesTest.class);
    }
}
