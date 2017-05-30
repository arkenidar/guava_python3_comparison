
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class DemoMain {

    public static void main(String[] args) {
        String url = "https://stackoverflow.com/questions/16711147/populating-a-list-with-a-contiguous-range-of-integers";
        System.out.println(url);
        System.out.println("python3: print(list(range(1,101)))");
        System.out.println("guava: ContiguousSet.create(Range.closed(1, 100), DiscreteDomain.integers()).asList())");
        System.out.println(ContiguousSet.create(Range.closed(1, 100), DiscreteDomain.integers()).asList());
    }
}

