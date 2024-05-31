import org.jetbrains.kotlinx.lincheck.LinChecker;
import org.jetbrains.kotlinx.lincheck.annotations.Operation;
//import org.jetbrains.kotlinx.lincheck.strategy.managed.modelchecking.ModelCheckingCTest;
import org.jetbrains.kotlinx.lincheck.strategy.stress.StressCTest;
import org.junit.jupiter.api.Test;
import org.jetbrains.kotlinx.lincheck.strategy.managed.modelchecking.*;

import java.util.concurrent.ConcurrentLinkedDeque;

@StressCTest
@ModelCheckingCTest
public class DequeTest {

    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<Integer>();

    @Operation public void addFirst(Integer e) {
        deque.addFirst(e);
    }
    @Operation public void addLast(Integer e) {
        deque.addLast(e);
    }
    @Operation public void pollFirst() {
        deque.pollFirst();
    }
    @Operation public void pollLast() {
        deque.pollLast();
    }
    @Operation public int peekFirst() {
        return deque.peekFirst();
    }
    @Operation public int peekLast() {
        return deque.peekLast();
    }

    @Test public void test() {
        LinChecker.check(DequeTest.class);
    }

}
