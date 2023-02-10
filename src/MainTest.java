import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

    }

    @org.junit.jupiter.api.Test
    void sum() {
        int sumy = 30/10;
        assertEquals(sumy,3);
    }

    @org.junit.jupiter.api.Test
    void returnTrueIfThereIsMoreThanFiveLetters(){
        String name1 = "NANAPASSYTHEWORLD";
        if (name1.length() < 5){
           assertTrue(Boolean.parseBoolean(name1));
        }
    }

    @org.junit.jupiter.api.Test
    void ReturnTheSum(){
        assertEquals(15,Main.add(10,5));
    }

    @org.junit.jupiter.api.Test
    void returnTheDest(){
        assertEquals("Greece",Main.vacay("Greece"));
    }
    @org.junit.jupiter.api.Test
    void returnTheSumOfTwoNumbers(){
        assertEquals(5,3+2);
    }
    @org.junit.jupiter.api.Test
    void returnTheSum(){
        assertEquals(3, Main.num2(1,2));
    }

    @org.junit.jupiter.api.Test
    void returnTheWordIfTheFirstLetterContainsA(){
        assertTrue(Main.contains("ashley"));
    }

    @org.junit.jupiter.api.Test
    void ReturnTheNumberTen(){
        assertEquals(10,Main.total());
    }

    @org.junit.jupiter.api.Test
    void ReturnTrueIfTheTotalIsTen(){
        assertTrue(Main.total() == 10);
    }

    @org.junit.jupiter.api.Test
    void ReturnTheNameMalibu(){
        assertEquals("Malibu",Main.itsHappening());
    }

    @org.junit.jupiter.api.Test
    void ReturnTrueIfMalibuIsTheName(){
        assertTrue(Main.itsHappening().contains("Malibu"));
    }

    @org.junit.jupiter.api.Test
    void ReturnFalseIfItIsNotNana(){
        assertFalse(Main.whoCalling().contains("katie"));
    }

    @org.junit.jupiter.api.Test
    void ReturnNana(){
        assertEquals("nana",Main.whoCalling());
    }

    @org.junit.jupiter.api.Test
    void ReturnTrueIfNanaIsCalling(){
        assertTrue(Main.whoCalling().equals("nana"));
    }

    @org.junit.jupiter.api.Test
    void shouldGiveSum(){
        assertEquals(5, Main.addy(3,2));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnName(){
        assertTrue(Main.namep("Hello World"));
    }
}