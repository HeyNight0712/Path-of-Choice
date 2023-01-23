package file.language;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import com.google.gson.JsonObject;

public class zh_tw {

    public static void create_file() throws Exception {
        File equipJson = new File("lang/zh_tw.json");
        if (!equipJson.exists()) {
            // 寫入 檔案數據
            JsonObject obj = new JsonObject();
            obj.addProperty("HP", "HP");
            obj.addProperty("MP", "MP");
            obj.addProperty("EXP", "EXP");
            obj.addProperty("GOLD", "GOLD");
            obj.addProperty("Dam", "Dam");
            obj.addProperty("Def", "Def");

            // =========================
            // 新增 系統 資訊
            // =========================
            JsonObject system = new JsonObject();
            system.addProperty("Move", "移動");
            system.addProperty("Item", "道具");
            system.addProperty("Attack", "攻擊");
            system.addProperty("Skill", "技能");
            system.addProperty("Attributes", "屬性");
            system.addProperty("Defense", "防禦");
            system.addProperty("Info", "資訊");
            obj.add("system", system);

            // =========================
            // 新增 mob list name
            // =========================
            JsonObject mobslist = new JsonObject();
            mobslist.addProperty("Demon", "惡魔");
            mobslist.addProperty("Fairy", "仙女");
            mobslist.addProperty("Ghost", "幽靈");
            mobslist.addProperty("Kitsune", "妖狐");
            mobslist.addProperty("Lich", "巫妖");
            mobslist.addProperty("Orc", "獸人");
            mobslist.addProperty("Skeleton", "骷髏");
            mobslist.addProperty("Statue_Ghost", "石像鬼");
            mobslist.addProperty("Vampire", "吸血鬼");
            mobslist.addProperty("Zombie", "殭屍");
            obj.add("mobslist", mobslist);

            // =========================
            // 新增 Item name
            // =========================
            JsonObject item = new JsonObject();
            obj.add("item", item);

            // =========================
            // 新增 裝備商人 npc
            // =========================
            JsonObject equipment_trader = new JsonObject();

            // Remy 蕾米
            JsonObject Remy = new JsonObject();
            Remy.addProperty("name", "蕾米");
            Remy.addProperty("talk1", "冒...冒險者、能請你買一點東西嗎？我需要錢幫生病的媽媽買藥");
            Remy.addProperty("talk2", "裝備怎麼來的？是過世的爸爸留下來的遺物......");
            Remy.addProperty("talk3", "城內有我的懸賞海報？(小聲嘀咕)嘖，是時候該換地方了嗎");
            Remy.addProperty("talk4", "冒險者、能請你......是你啊，老樣子、你隨便看看。");
            equipment_trader.add("Remy", Remy);

            // Tolt 托爾特
            JsonObject Tolt = new JsonObject();
            Tolt.addProperty("name", "托爾特");
            Tolt.addProperty("talk1", "你那瘦弱的身板很需要一件護甲，不然哪天可能隨便挨個一刀人就沒了。");
            Tolt.addProperty("talk2", "唉、羅克達，多希望再次見到你在戰場上奮勇殺敵的樣子啊。");
            Tolt.addProperty("talk3", "這件胸甲、看著你穿了20年了，你卻從來不捨得換下。");
            Tolt.addProperty("talk4", "謝謝你，我是時候該走了。");
            equipment_trader.add("Tolt", Tolt);

            // Tane 塔內
            JsonObject Tane = new JsonObject();
            Tane.addProperty("name", "塔內");
            Tane.addProperty("talk1", "有沒有人提醒過你該買件護甲了？");
            Tane.addProperty("talk2", "放下那把武器，你不適合它的。");
            Tane.addProperty("talk3", "試試這件、你的身型剛好合適。");
            Tane.addProperty("talk4", "你該去適應一下新裝備了，注意別死。");
            equipment_trader.add("Tane", Tane);
            obj.add("equipment_trader", equipment_trader);

            // =========================
            // 新增 技能商人 npc
            // =========================
            JsonObject skill_merchant = new JsonObject();
            // Naina 娜伊納
            JsonObject Naina = new JsonObject();
            Naina.addProperty("name", "娜伊納");
            Naina.addProperty("talk1", "那個...你是來學習的嗎？");
            Naina.addProperty("talk2", "如果不嫌棄的話，下次也請來找我。");
            Naina.addProperty("talk3", "神會祝福每一個人，但大多數的事情還是只能靠自己。");
            Naina.addProperty("talk4", "神會傾聽但不會回應，而我會、需要傾訴時請來找我。");
            skill_merchant.add("Naina", Naina);

            // Marwell 麥威爾
            JsonObject Marwell = new JsonObject();
            Marwell.addProperty("name", "麥威爾");
            Marwell.addProperty("talk1", "你想學習什麼？");
            Marwell.addProperty("talk2", "你學習的速度很快，但要學的還有很多。");
            Marwell.addProperty("talk3", "走路抬頭挺胸，不要等到老了退休了、還得被身體的病痛糾纏一生。");
            Marwell.addProperty("talk4", "小心一點，我不希望哪天在城外見到你的屍骨。");
            skill_merchant.add("Marwell", Marwell);

            // Steno_Mirivie 斯蒂諾 • 蜜莉薇
            JsonObject Steno_Mirivie = new JsonObject();
            Steno_Mirivie.addProperty("name", "斯蒂諾 • 蜜莉薇");
            Steno_Mirivie.addProperty("talk1", "Σ(ﾟДﾟ；≡；ﾟдﾟ)");
            Steno_Mirivie.addProperty("talk2", "(つд⊂)");
            Steno_Mirivie.addProperty("talk3", "Σヽ(ﾟД ﾟ; )ﾉ");
            Steno_Mirivie.addProperty("talk4", "......謝...謝謝");
            skill_merchant.add("Steno_Mirivie", Steno_Mirivie);
            obj.add("skill_merchant", skill_merchant);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonData = gson.toJson(obj);
            // 寫入 文件
            FileWriter writer = new FileWriter(equipJson);
            writer.write(jsonData);
            writer.close();
            System.out.println(data.text.info_system + "- 新增 zh_tw");
        } else {
            System.out.println(data.text.info_system + "- 讀取 zh_tw");
        }
    }
}
