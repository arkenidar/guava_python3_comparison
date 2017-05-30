
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class DemoMain {

    public static void main(String[] args) {
        // write your code here
        System.out.println("python3: print(list(range(1,101)))");
        System.out.println(ContiguousSet.create(Range.closed(1, 100), DiscreteDomain.integers()).asList());
    }
}

