


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
 
public class RunnerTest {
 
      public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MathsTest.class);
        for (Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
        }
        if (result.wasSuccessful()){
            System.out.println("Both Tests finished successfully...");
        }
    } 
}