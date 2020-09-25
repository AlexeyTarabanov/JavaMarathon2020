package Tests.day3;

import Tests.AbstractTest;
import day3.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day3Task1Test extends AbstractTest {
    @Test
    public void Moscow() {
        setInput("Москва");
        Task1.main(new String[0]);
        assertEquals("Россия", getOutput(), "Москва");
    }

    @Test
    public void Milan() {
        setInput("Милан");
        Task1.main(new String[0]);
        assertEquals("Италия", getOutput(), "Милан");
    }

    @Test
    public void London() {
        setInput("Лондон");
        Task1.main(new String[0]);
        assertEquals("Англия", getOutput(), "Лондон");
    }

    @Test
    public void Munich() {
        setInput("Мюнхен");
        Task1.main(new String[0]);
        assertEquals("Германия", getOutput(), "Мюнхен");
    }

    @Test
    public void Other() {
        setInput("Лиссабон");
        Task1.main(new String[0]);
        assertEquals("Неизвестная страна", getOutput(), "Лиссабон");
    }
}