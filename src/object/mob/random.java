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
                object.mob.demon.data.restart();
                object.mob.demon.data.use();
                break;
            case "fairy":
                object.mob.fairy.data.restart();
                object.mob.fairy.data.use();
                break;
            case "ghost":
                object.mob.ghost.data.restart();
                object.mob.ghost.data.use();
                break;
            case "kitsune":
                object.mob.kitsune.data.restart();
                object.mob.kitsune.data.use();
                break;
            case "lich":
                object.mob.lich.data.restart();
                object.mob.lich.data.use();
                break;
            case "orc":
                object.mob.orc.data.restart();
                object.mob.orc.data.use();
                break;
            case "skeleton":
                object.mob.skeleton.data.restart();
                object.mob.skeleton.data.use();
                break;
            case "statue_ghost":
                object.mob.statue_ghost.data.restart();
                object.mob.statue_ghost.data.use();
                break;
            case "vampire":
                object.mob.vampire.data.restart();
                object.mob.vampire.data.use();
                break;
            case "zombie":
                object.mob.zombie.data.restart();
                object.mob.zombie.data.use();
                break;
        }
    }
}
