package week1.weblab;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.charset.*;

import org.junit.*;
import org.junit.rules.*;

public class GettingOutOfTheMazeTest {

    private static void runTestWithStrings(String in, String out) {
        assertEquals(out.trim(), GettingOutOfTheMaze.run(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8))).trim());
    }

    private static void runTestWithFile(String fileName) {
        assertEquals(WebLab.getData(fileName + ".out").trim(), GettingOutOfTheMaze.run(new ByteArrayInputStream(WebLab.getData(fileName + ".in").getBytes(StandardCharsets.UTF_8))).trim());
    }

    @Test(timeout = 500)
    public void example() {
        runTestWithFile("example");
    }

    @Test(timeout = 10000)
    public void set7() {
        runTestWithFile("dataset7");
    }
}