package bot;

import java.util.Random;

import lang;
import player.att_def;

public class bot {
    att_def combat = new att_def();
    public Object system_value;
    public static int bot_use;

    public void probability() throws Exception {
        Random rand = new Random();
        bot_use = rand.nextInt(100);
        if (0 <= bot_use && 59 >= bot_use) {
            System.out.println(use_mob.name + " 使出了" + lang.attack);
            combat.ATT();
        } else if (60 >= bot_use && 89 <= bot_use) {
            System.out.println(use_mob.name + " 使出了" + lang.Attributes);
            combat.ATT();
        } else {
            System.out.println(use_mob.name + " 使出了" + lang.skill);
        }
    }
}
