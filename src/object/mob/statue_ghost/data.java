package object.mob.statue_ghost;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import data.system_value;
import data.use_mob;

public class data {
    // 重新載入 怪物數值
    public static void read() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + system_value.lang + ".json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject mob = jsonObject.getAsJsonObject("mobslist");
        use_mob.name = mob.get("Statue_Ghost").getAsString();
        use_mob.HP = 25;
        use_mob.HP_max = use_mob.HP;
        use_mob.MP = 10;
        use_mob.MP_max = use_mob.MP;
        use_mob.Damage = 5;
        use_mob.Hit = 1;
        use_mob.Defense = 1;
        use_mob.LV = 1;
        use_mob.EXP = (int) ((float) 5 + ((float) use_mob.LV * 0.7));
        use_mob.Gold = (int) ((float) 3 + ((float) use_mob.LV * 0.5));
    }
}
