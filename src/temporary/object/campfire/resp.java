package object.campfire;

import java.util.Random;
import java.util.concurrent.TimeUnit;

//營火
public class resp {
    // 匯入 玩家 data
    data.player player = new data.player();

    public static void trigger() throws InterruptedException {
        System.out.println(data.player.name + "決定 要在此休息一晚");
        Random random = new Random();
        int add_HP = random.nextInt(data.player.HP_max);
        if (add_HP + data.player.HP >= data.player.HP_max) {
            data.player.HP = data.player.HP_max;
        } else {
            data.player.HP = data.player.HP + add_HP;
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("休息中.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("休息中..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("休息中...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("休息一晚 感覺到身體有稍微恢復");
        System.out.println("恢復 + " + add_HP);
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
