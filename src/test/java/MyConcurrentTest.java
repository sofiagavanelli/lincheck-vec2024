import org.jetbrains.kotlinx.lincheck.LinChecker;
import org.jetbrains.kotlinx.lincheck.strategy.stress.StressCTest;
import org.junit.Test;

//import org.junit.jupiter.api.Test;

@StressCTest // stress execution strategy is used
public class MyConcurrentTest {
    //<empty constructor and operations>

    @Test
    public void runTest() {
        LinChecker.check(MyConcurrentTest.class);
    }
}