package player;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import lang;
import bot.bot;
import bot.system_value;
import bot.use_mob;

public class att_def {

    // 攻擊
    public void ATT() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        Random Dam_rand = new Random();
        bot bot = new bot();
        int Dam;
        int Hit;
        int Def;

        switch (system_value.round) {
            case 0:
                Dam = Dam_rand.nextInt(player.player.Damage);
                Hit = player.player.Hit;
                Def = use_mob.Defense;
                // 攔截防禦
                if (round.player_text_use.equals("2")) {
                    break;
                }
                if (60 >= bot.bot_use && 89 <= bot.bot_use) {
                    System.out.println(use_mob.name + "專注著" + lang.Defense);
                    Def = (int) ((float) Def * 1.5);
                }
                if (Hit + Dam <= Def) {
                    System.out.println(use_mob.name + " " + lang.Defense + "成功");
                } else if (Hit + Dam >= Def) {
                    if ((Hit + Dam) >= player.player.Damage) {
                        Dam = player.player.Damage;
                        use_mob.HP = use_mob.HP - (Dam - Def);
                        Hit = 0;
                    } else {
                        use_mob.HP = use_mob.HP - (Dam + Hit - Def);
                    }
                    System.out
                            .println(use_mob.name + " " + lang.HP + " " + use_mob.HP + " / " + use_mob.HP_max + " -"
                                    + (Dam + Hit - Def));
                }
                break;
            case 1:
                Dam = Dam_rand.nextInt(use_mob.Damage);
                Hit = use_mob.Hit;
                Def = player.player.Defense;
                // 如果 玩家 Hit + Dam數值 > Dam 時 則 傷害輸出 = monster.Damage
                if (round.player_text_use.equals("2")) {
                    System.out.println(player.player.name + "專注著" + lang.Defense);
                    Def = (int) ((float) Def * 1.5);
                }
                if (Hit + Dam <= Def) {
                    System.out.println(player.player.name + " " + lang.Defense + "成功");
                } else if (Hit + Dam >= Def) {
                    if ((Hit + Dam) >= use_mob.Damage) {
                        Dam = use_mob.Damage;
                        player.player.HP = player.player.HP - (Dam - Def);
                        Hit = 0;
                    } else {
                        player.player.HP = player.player.HP - (Dam + Hit - Def);
                    }
                    System.out.println(
                            player.player.name + " " + lang.HP + " " + player.player.HP + " / " + player.player.HP_max
                                    + " -"
                                    + (Dam + Hit - Def));
                }
                break;
        }
    }

}
