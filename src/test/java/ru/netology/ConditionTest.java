package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {
    // Увеличить текущую температуру на 1гр
    @Test
    public void increaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(29);
        condition.increaseCurrentTemperature();
        assertEquals(30, condition.getCurrentTemperature());
    }

    // Уменьшить текущую температуру на 1гр
    @Test
    public void decreaseCurrentTemperature() {
            Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(11);
        condition.decreaseCurrentTemperature();
        assertEquals(10, condition.getCurrentTemperature());
    }

    // Попытка увеличить максимальную температуру
    @Test
    public void increaseFromMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(30);
        condition.increaseCurrentTemperature();
        assertEquals(30, condition.getCurrentTemperature());
    }

    // Попытка уменьшить минимальную температуру
    @Test
    public void decreaseFromMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(10);
        condition.decreaseCurrentTemperature();
        assertEquals(10, condition.getCurrentTemperature());
    }

    // Уменьшение максимальной температуры
    @Test
    public void decreaseFromMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(30);
        condition.decreaseCurrentTemperature();
        assertEquals(29, condition.getCurrentTemperature());
    }

    // Увеличение минимальной температуры
    @Test
    public void increaseFromMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(10);
        condition.increaseCurrentTemperature();
        assertEquals(11, condition.getCurrentTemperature());
    }

    // Увеличение температуры ниже, чем минимальная
    @Test
    public void increaseFromLowerThanMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(2);
        condition.increaseCurrentTemperature();
        assertEquals(11, condition.getCurrentTemperature());
    }

    // Уменьшение температуры ниже, чем минимальная
    @Test
    public void decreaseFromLowerThanMin() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(2);
        condition.decreaseCurrentTemperature();
        assertEquals(10, condition.getCurrentTemperature());
    }

    // Увеличение температуры выше, чем максимальная
    @Test
    public void increaseFromOverMax() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(10);
        condition.setCurrentTemperature(50);
        condition.increaseCurrentTemperature();
        assertEquals(30, condition.getCurrentTemperature());
    }
}