package mob.npc;

import java.io.FileReader;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class skills_merchant {

    // 寫入 npc ID
    public static String[] talktype = {
            "Steno_Mirivie",
            "Marwell",
            "Naina"
    };
    public static String Random;

    // 隨機NPC
    public static void random_npc() throws Exception {
        Random = talktype[new Random().nextInt(talktype.length)];
        getNPCTalk();
    }

    // NPC 隨機對話
    public static void getNPCTalk() throws Exception {
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + data.system_value.lang + ".json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject player = jsonObject.getAsJsonObject("skill_merchant").getAsJsonObject(Random);
        String name = player.get("name").getAsString();
        System.out.println("----------");
        int talkNumber = new Random().nextInt(4) + 1;
        String talk = player.get("talk" + talkNumber).getAsString();
        System.out.println(name + ": " + talk);
        System.out.println("----------");
    }

}
