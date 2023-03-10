package event.fighting;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import data.lang;
import data.use_mob;
import data.player;
import data.system_value;
import event.round;
import object.AI.bot;

public class att_def {

    // 攻擊
    public void ATT() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        Random Dam_rand = new Random();
        bot bot = new bot();
        int Dam;
        int Hit;
        int Def;

        round round = new round();
        switch (system_value.round) {
            case 0:
                Dam = Dam_rand.nextInt(player.Damage);
                Hit = player.Hit;
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
                    if ((Hit + Dam) >= player.Damage) {
                        Dam = player.Damage;
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
                Def = player.Defense;
                // 如果 玩家 Hit + Dam數值 > Dam 時 則 傷害輸出 = monster.Damage
                if (round.player_text_use.equals("2")) {
                    System.out.println(player.name + "專注著" + lang.Defense);
                    Def = (int) ((float) Def * 1.5);
                }
                if (Hit + Dam <= Def) {
                    System.out.println(player.name + " " + lang.Defense + "成功");
                } else if (Hit + Dam >= Def) {
                    if ((Hit + Dam) >= use_mob.Damage) {
                        Dam = use_mob.Damage;
                        player.HP = player.HP - (Dam - Def);
                        Hit = 0;
                    } else {
                        player.HP = player.HP - (Dam + Hit - Def);
                    }
                    System.out.println(
                            player.name + " " + lang.HP + " " + player.HP + " / " + player.HP_max + " -"
                                    + (Dam + Hit - Def));
                }
                break;
        }
    }

}
