package event.set;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class lang_read {
    public static String lang_use = "zh_tw";

    public static void read() throws Exception {
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + lang_use + ".json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject lang = jsonObject.getAsJsonObject(lang_use);
    }
}
