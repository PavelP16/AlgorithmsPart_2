package com.example.AlgorithmsPart_2.list.test;

import com.example.AlgorithmsPart_2.list.IntegerList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerListTest {
    @Test
    void testContains() {
        IntegerList list = new IntegerList();
        list.add(10);
        list.add(20);
        assertTrue(list.contains(10));
        assertFalse(list.contains(30));
    }


}