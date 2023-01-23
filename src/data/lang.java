package data;

import java.io.FileReader;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class lang {
    public static String HP;
    public static String MP;
    public static String Damage;
    public static String Defense;
    public static String LV;
    public static String EXP;
    public static String GOLD;

    public static String lang_use;

    public static String move;
    public static String item;
    public static String attack;
    public static String skill;
    public static String Attributes;
    public static String defense;

    public static void lang_use() throws Exception {
        lang_use = "zh_tw";
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + lang_use + ".json");

        // 讀取 翻譯數據
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        HP = jsonObject.get("HP").getAsString();
        MP = jsonObject.get("MP").getAsString();
        Damage = jsonObject.get("Dam").getAsString();
        Defense = jsonObject.get("Def").getAsString();
        EXP = jsonObject.get("EXP").getAsString();
        GOLD = jsonObject.get("GOLD").getAsString();

        // 系統
        JsonObject player = jsonObject.getAsJsonObject("system");
        move = player.get("Move").getAsString();
        item = player.get("Item").getAsString();
        attack = player.get("Attack").getAsString();
        skill = player.get("Skill").getAsString();
        Attributes = player.get("Attributes").getAsString();
        defense = player.get("Defense").getAsString();

    }
}
