package player;

import java.util.concurrent.TimeUnit;

import lang;
import bot.use_mob;

//計算狀態
public class count {
    // 匯入計算
    use_mob mob = new use_mob();

    public void EXP() throws Exception {
        player.player.EXP = mob.EXP + player.player.EXP;
        player.player.Gold = mob.Gold + player.player.Gold;
        System.out.println("\n" + "成功擊殺 " + mob.name + " + EXP " + mob.EXP + " + GOLD " + mob.Gold);
        TimeUnit.SECONDS.sleep(1);
        if (player.player.EXP >= player.player.EXP_max) {
            player.player.EXP = 0;
            player.player.LV++;
            System.out.println("等級提升" + (player.player.LV - 1) + " 至 " + player.player.LV);
        }
        System.out.println(
                "『" + player.player.LV + "』" + player.player.name + ": " + " " + lang.EXP + " " + player.player.EXP
                        + " / "
                        + player.player.EXP_max
                        + " " + lang.GOLD + " " + player.player.Gold + "\n");
    }
}
