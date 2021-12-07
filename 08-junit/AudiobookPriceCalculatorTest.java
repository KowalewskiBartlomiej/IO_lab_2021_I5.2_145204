package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {

    private AudiobookPriceCalculator audiobookcalculator;

    @BeforeEach
    void setUp() {
        audiobookcalculator = new AudiobookPriceCalculator();
        Audiobook audiobook = new Audiobook("TEST", 1000);
        Customer Standard = new Customer("Standard", Customer.LoyaltyLevel.STANDARD, false);
        Customer Silver = new Customer("Silver", Customer.LoyaltyLevel.SILVER, false);
        Customer Gold = new Customer("Gold", Customer.LoyaltyLevel.GOLD, false);
        Customer Subscriber = new Customer("Subscriber", Customer.LoyaltyLevel.STANDARD, true);
    }

    @Test
    void calculateStandard() {

    }

    @Test
    void calculateSilver() {

    }

    @Test
    void calculateGold() {

    }

    @Test
    void calculateSubscriber() {

    }
}