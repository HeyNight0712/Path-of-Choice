package mob;

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
                mob.enemy.demon.read();
                break;
            case "fairy":
                mob.enemy.fairy.read();
                break;
            case "ghost":
                mob.enemy.ghost.read();
                break;
            case "kitsune":
                mob.enemy.kitsune.read();
                break;
            case "lich":
                mob.enemy.lich.read();
                break;
            case "orc":
                mob.enemy.orc.read();
                break;
            case "skeleton":
                mob.enemy.skeleton.read();
                break;
            case "statue_ghost":
                mob.enemy.statue_ghost.read();
                break;
            case "vampire":
                mob.enemy.vampire.read();
                break;
            case "zombie":
                mob.enemy.zombie.read();
                break;
        }
    }
}
