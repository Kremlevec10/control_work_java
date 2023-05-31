package org.example.lottery;

import org.example.toys.Toy;

import java.util.*;

public class Lottery {
    private List<Toy> toys;
    private Map<Integer,String> resultLottery;
    private int round = 1;

    public Lottery(Toy constructor, Toy robot, Toy doll) {
        toys = new ArrayList();
        toys.add(constructor);
        toys.add(robot);
        toys.add(doll);
        resultLottery = new HashMap<>();
    }

    private Toy getToy(int id) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                return toy;
            }
        }
        return null;
    }

    public void play() {
        int idToy = getIdByNumber(getRandom());
        Toy toy = getToy(idToy);
        String str = "В тираже №" + round + " выйграла " + toy.info();
        resultLottery.put(round,str);
        round ++;
    }

    public String getResultRound(int numberRound) {
        return resultLottery.get(numberRound);
    }

    public String getAllResultRounds() {
        String resutAllRound = "";
        for (int i = 1; i <= resultLottery.size(); i++) {
            resutAllRound += resultLottery.get(i) + "\n";
        }
        return resutAllRound;
    }

    private int getRandom() {
        Random rand = new Random();
        int randomInt = rand.nextInt(10) + 1;
        return randomInt;
    }

    private int getIdByNumber(int randomInt) {
        int id = 0;
        switch (randomInt) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                id = 3;
                break;
            case 7:
            case 8:
                id = 2;
                break;
            case 9:
            case 10:
                id = 1;
                break;
        }
        return id;
    }
}
