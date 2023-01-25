package event.player;

import java.util.concurrent.TimeUnit;

import data.lang;
import data.use_mob;
import data.player;

//計算狀態
public class count {
    // 匯入計算
    use_mob mob = new use_mob();
    player player = new player();

    public void EXP() throws Exception {
        data.player.EXP = mob.EXP + data.player.EXP;
        data.player.Gold = mob.Gold + data.player.Gold;
        System.out.println("\n" + "成功擊殺 " + mob.name + " + EXP " + mob.EXP + " + GOLD " + mob.Gold);
        TimeUnit.SECONDS.sleep(1);
        if (data.player.EXP >= data.player.EXP_max) {
            data.player.EXP = 0;
            data.player.LV++;
            System.out.println("等級提升" + (data.player.LV - 1) + " 至 " + data.player.LV);
        }
        System.out.println(
                "『" + data.player.LV + "』" + data.player.name + ": " + " " + lang.EXP + " " + data.player.EXP + " / "
                        + data.player.EXP_max
                        + " " + lang.GOLD + " " + data.player.Gold + "\n");
    }
}
