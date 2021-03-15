package com.ss.mar.jb.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    private Words wordOne = new Words("ABC");
    private Words wordTwo = new Words("WXYZ");

    @Test
    void getStr() {
        assertEquals("ABC", wordOne.getStr(), "Failed getStr()");
        assertEquals("WXYZ", wordTwo.getStr(), "Failed getStr()");
    }

    @Test
    void setStr() {
        wordOne.setStr("EDF");
        assertEquals("EDF", wordOne.getStr(), "Failed setStr()");
        wordTwo.setStr("MNOP");
        assertEquals("MNOP", wordTwo.getStr(), "Failed setStr()");
    }

    @Test
    void getLength() {
        assertEquals(3, wordOne.getLength(), "Failed getLength()");
        assertEquals(4, wordTwo.getLength(), "Failed getLength()");
    }

}