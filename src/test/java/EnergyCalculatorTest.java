import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class EnergyCalculatorTest {

    EnergyCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new EnergyCalculator();
    }

    // This reads the CSV file and runs my tests
    @ParameterizedTest
    @CsvFileSource(resources = "/midterm_tests.CSV")
    public void testEnergy_ValidInputs(double kWh, boolean hasSmartDevice, boolean peakOptOut, double expected) throws Exception {

        double actual = calculator.calculateRebate(kWh, hasSmartDevice, peakOptOut);

        // Assert that Expected equals Actual
        assertEquals(expected, actual, 0.01,
                "Failed on : " + kWh + ", Has Smart Device: " + hasSmartDevice + ", Peark Opt Out: " + peakOptOut);
    }

    // Exception Tests (Testing the kwh <= 0 rule)
    @Test
    void testInvalidKwh_Zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateRebate(0.0, false, false);
        });
    }

    @Test
    void testInvalidKwh_Negative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateRebate(-5.0, true, true);
        });
    }
}
