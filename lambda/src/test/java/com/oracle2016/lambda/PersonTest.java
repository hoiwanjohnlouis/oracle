package com.oracle2016.lambda;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @BeforeAll
    static void beforeAll() {
    }
    @AfterAll
    static void afterAll() {
    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    /*
     *  test data
     */
    Person exData;

    @Test
    void Test001() {
        // process array of tags
        assertEquals(0,0);
        assertNotEquals(0,1);
    }

    /**
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
    }
}