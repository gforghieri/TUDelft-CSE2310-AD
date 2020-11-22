package week1.weblab;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;
import org.junit.*;
import org.junit.rules.*;

public class BetterAverageTest {


    @Test(timeout = 100)
    public void example() {
        int n = 4;
        double[] list = { 4, 2, 1, 3 };
        assertEquals(2.5, BetterAverage.solve(n, list), 1e-3);
    }

    @Test(timeout = 100)
    public void example2() {
        int n = 6;
        double[] list = { 4, 2, 1, 5, 1, 3};
        assertEquals(2.5, BetterAverage.solve(n, list), 1e-3);
    }

}

