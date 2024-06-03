import org.example.SafeCounter;
import org.jetbrains.kotlinx.lincheck.LinChecker;
import org.jetbrains.kotlinx.lincheck.annotations.Operation;
import org.jetbrains.kotlinx.lincheck.annotations.Param;
import org.jetbrains.kotlinx.lincheck.paramgen.IntGen;
import org.jetbrains.kotlinx.lincheck.strategy.managed.modelchecking.*;
import org.jetbrains.kotlinx.lincheck.strategy.stress.StressCTest;
//import org.junit.Test;

import org.junit.jupiter.api.Test;
import org.example.Counter;
//

@ModelCheckingCTest()
@StressCTest()
public class BasicCounterTest {
    private Counter c = new Counter(); // initial state
    //private SafeCounter c = new SafeCounter();

    // operations on the Counter
    @Operation
    public void inc() {
        c.inc();
    }

    @Operation
    public Integer get() {
        return c.get();
    }

    @Test
    public void test() {
        LinChecker.check(BasicCounterTest.class);
    }

}