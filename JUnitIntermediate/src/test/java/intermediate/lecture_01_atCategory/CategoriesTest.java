package intermediate.lecture_01_atCategory;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

public class CategoriesTest {

    public interface FastTests {
    }

    public interface SlowTests {
    }

    public interface SmokeTests {
    }

    public static class A {
        @Test
        public void a() {
            System.out.println("running A#a()");
        }

        @Category(SlowTests.class)
        @Test
        public void b() {
            System.out.println("running A#b()");
        }

        @Category({FastTests.class, SmokeTests.class})
        @Test
        public void c() {
            System.out.println("running A#c()");
        }
    }

    @Category({SlowTests.class, FastTests.class})
    public static class B {
        @Test
        public void d() {
            System.out.println("running B#d()");
        }
    }

//	@RunWith(Categories.class)
//	@IncludeCategory(SlowTests.class)
//	@SuiteClasses({ A.class, B.class })
//	// Note that Categories is a kind of Suite
//	public static class SlowTestSuite {
//		// Will run A.b and B.d, but not A.a and A.c
//	}

    @RunWith(Categories.class)
    @IncludeCategory({FastTests.class, SmokeTests.class})
    @SuiteClasses({A.class, B.class})
    public static class FastOrSmokeTestSuite {
        // Will run A.c and B.d, but not A.b because it is not any of FastTests or SmokeTests
    }
}
