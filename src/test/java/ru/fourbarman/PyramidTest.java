package ru.fourbarman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    @Test
    void pyramidWhen0() {
        assertArrayEquals(Pyramid.pyramid(0), new int[][]{});
    }

    @Test
    void pyramidWhen2() {
        assertArrayEquals(Pyramid.pyramid(2), new int[][]{{1}, {1, 1}});
    }

    @Test
    void pyramidWhen4() {
        assertArrayEquals(Pyramid.pyramid(3), new int[][]{{1}, {1, 1}, {1, 1, 1}});
    }
}