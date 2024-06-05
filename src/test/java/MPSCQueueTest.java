import org.jctools.queues.atomic.MpscLinkedAtomicQueue;
import org.jetbrains.kotlinx.lincheck.LinChecker;
import org.jetbrains.kotlinx.lincheck.annotations.Operation;
import org.jetbrains.kotlinx.lincheck.strategy.managed.modelchecking.ModelCheckingCTest;
import org.jetbrains.kotlinx.lincheck.strategy.stress.StressCTest;
import org.junit.jupiter.api.Test;

@ModelCheckingCTest
@StressCTest
public class MPSCQueueTest {
    private MpscLinkedAtomicQueue<Integer> queue = new MpscLinkedAtomicQueue<>();

    @Operation
    public void offer(Integer x) {
        queue.offer(x);
    }

    @Operation(nonParallelGroup = "consumers")
    public Integer poll() {
        return queue.poll();
    }

    @Operation(nonParallelGroup = "consumers")
    public Integer peek() {
        return queue.peek();
    }

    @Test
    public void test() {
        LinChecker.check(MPSCQueueTest.class);
    }

}

