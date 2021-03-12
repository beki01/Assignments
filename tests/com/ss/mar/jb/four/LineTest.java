package com.ss.mar.jb.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    private  Line line = new Line(0,0,4,4);
    private  Line line2 = new Line(0,0,4,4);

    @Test
    void getSlope() {
        assertEquals(1,line.getSlope(), "Failed getSlope method.");
    }

    @Test
    void getDistance() {
        assertEquals(5.656854249492381, line.getDistance(), "Failed getDistance Method");
    }

    @Test
    void parallelTo() {
        assertTrue(line.parallelTo(line2), "Failed is parallel test");
    }
}