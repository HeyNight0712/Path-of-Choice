package object.mob;

import java.io.FileNotFoundException;

public class read {
    public static void load_mob_name() throws FileNotFoundException {
        object.mob.demon.data.read();
        object.mob.fairy.data.read();
        object.mob.ghost.data.read();
        object.mob.kitsune.data.read();
        object.mob.kraken.data.read();
        object.mob.lich.data.read();
        object.mob.orc.data.read();
        object.mob.skeleton.data.read();
        object.mob.statue_ghost.data.read();
        object.mob.vampire.data.read();
        object.mob.zombie.data.read(); // 殭屍
        System.out.println("載入 生物 名稱");
    }
}
