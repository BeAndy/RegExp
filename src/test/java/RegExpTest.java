/**
 * Created by Andrew on 10/21/2016.
 */

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;
import java.util.List;

public class RegExpTest {

    @Test
    public void testFirstTask() throws IOException {
        List<String> list = Reader.readFile("test1.txt");
        System.out.println("FirstTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateFirst(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateFirst(list.get(i)));
        }
    }

    @Test
    public void testSecondTask() throws IOException {
        List<String> list = Reader.readFile("test2.txt");
        System.out.println("SecondTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateSecond(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateSecond(list.get(i)));
        }
    }

    @Test
    public void testThirdTask() throws IOException {
        List<String> list = Reader.readFile("test3.txt");
        System.out.println("ThirdTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateThird(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateThird(list.get(i)));
        }
    }

    @Test
    public void testFourthTask() throws IOException {
        List<String> list = Reader.readFile("test4.txt");
        System.out.println("FourthTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateFourth(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateFourth(list.get(i)));
        }
    }
    @Test
    public void testFifthTask() throws IOException {
        List<String> list = Reader.readFile("test5.txt");
        System.out.println("FifthTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateFifth(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateFifth(list.get(i)));
        }
    }
    @Test
    public void testSixthTask() throws IOException {
        List<String> list = Reader.readFile("test6.txt");
        System.out.println("SixthTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateSixth(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateSixth(list.get(i)));
        }
    }
    @Test
    public void testSeventhTask() throws IOException {
        List<String> list = Reader.readFile("test7.txt");
        System.out.println("SeventhTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateSeventh(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateSeventh(list.get(i)));
        }
    }
    @Test
    public void testNinthTask() throws IOException {
        List<String> list = Reader.readFile("test9.txt");
        System.out.println("NinthTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateNinth(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateNinth(list.get(i)));
        }
    }
    @Test
    public void testEighthTask() throws IOException {
        List<String> list = Reader.readFile("test8.txt");
        System.out.println("EighthTask");
        for (int i = 0; i < list.size() - 1; i += 2) {
            System.out.println(list.get(i) + " " + "=>" + "" + RegExp.calculateEighth(list.get(i)));
            assertEquals(list.get(i + 1), RegExp.calculateEighth(list.get(i)));
        }
    }


}