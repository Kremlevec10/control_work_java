package org.example;

import org.example.lottery.Lottery;
import org.example.toys.Constructor;
import org.example.toys.Doll;
import org.example.toys.Robot;
import org.example.toys.Toy;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ){
        Toy constructor = new Constructor("Лего",5);
        Toy robot = new Robot("Робокоп",2);
        Toy doll = new Doll("Барби",8);
        Lottery lottery = new Lottery(constructor,robot,doll);
        playing(lottery,10);
        write(lottery.getAllResultRounds());
    }

    public static void playing(Lottery lottery,int quantitiPlay) {
        for (int i = 0; i < quantitiPlay; i++) {
            lottery.play();
        }
    }

    public static void write(String result) {
        try(FileWriter write = new FileWriter("src/main/java/org/example/result.txt",false)){
            write.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
