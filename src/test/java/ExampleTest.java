import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleTest {
    @AfterEach
    void initl() {
        System.out.println("This message will be displayed after execution of each testing method");
    }

    @BeforeEach
    void init() {
        System.out.println("This message will be displayed before execution of each testing method");
    }

    @Test
    @DisplayName("First testing method")
    void firstTest() {
        System.out.println("Executing first test...");
    }

    @Test
    @Disabled
    @DisplayName("Second testing method")
    void secondTest() {
        System.out.println("Executing second test...");
    }

    @BeforeAll
    static void initu() {
        System.out.println("This message will be displayed  once before execution of all testing methods");
    }

    @AfterAll
    static void initn() {
        System.out.println("This message will be displayed  once after  execution of all testing methods");
    }

    @Test
    void shouldAddTwoNumbers() {
        int result = 1 + 3;

        assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(5)
                .isLessThan(6)
                .isGreaterThan(3)
                .isBetween(0, 10);
    }
}
