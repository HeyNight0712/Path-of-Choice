package object.mob.ghost;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import data.system_value;
import data.use_mob;

public class data {
    public static String Name;
    public static int HP;
    public static int HP_max;

    public static int MP;
    public static int MP_max;

    public static int Damage;
    public static int Hit;

    public static int Defense;

    public static int LV;

    public static int EXP;
    public static int Gold;

    // 重新載入 怪物數值
    public static void read() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + system_value.lang + ".json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject mob = jsonObject.getAsJsonObject("mobslist");
        Name = mob.get("Ghost").getAsString();
    }

    public static void restart() {
        HP = 25;
        HP_max = HP;
        MP = 10;
        MP_max = MP;
        Damage = 5;
        Hit = 1;
        Defense = 1;
        LV = 1;
        EXP = (int) ((float) 5 + ((float) LV * 0.7));
        Gold = (int) ((float) 3 + ((float) LV * 0.5));
    }

    public static void use() {
        use_mob.name = Name;
        use_mob.HP = HP;
        use_mob.HP_max = HP_max;
        use_mob.MP = MP_max;
        use_mob.MP_max = MP_max;
        use_mob.Damage = Damage;
        use_mob.Hit = Hit;
        use_mob.Defense = Defense;
        use_mob.LV = LV;
        use_mob.EXP = EXP;
        use_mob.Gold = Gold;
    }
}
