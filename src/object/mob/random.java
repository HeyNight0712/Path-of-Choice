package object.mob;

import java.io.FileNotFoundException;
import java.util.Random;

public class random {
    // 填入 生物名稱
    public static String[] rand_mob = {
            "demon",
            "fairy",
            "ghost",
            "kitsune",
            "kraken",
            "lich",
            "orc",
            "skeleton",
            "statue_ghost",
            "vampire",
            "zombie"
    };

    public static void random() throws FileNotFoundException {
        String Random = rand_mob[new Random().nextInt(rand_mob.length)];
        switch (Random) {
            case "demon":
                object.mob.demon.data.read();
                break;
            case "fairy":
                object.mob.fairy.data.read();
                break;
            case "ghost":
                object.mob.ghost.data.read();
                break;
            case "kitsune":
                object.mob.kitsune.data.read();
                break;
            case "lich":
                object.mob.lich.data.read();
                break;
            case "orc":
                object.mob.orc.data.read();
                break;
            case "skeleton":
                object.mob.skeleton.data.read();
                break;
            case "statue_ghost":
                object.mob.statue_ghost.data.read();
                break;
            case "vampire":
                object.mob.vampire.data.read();
                break;
            case "zombie":
                object.mob.zombie.data.read();
                break;
        }
    }
}
