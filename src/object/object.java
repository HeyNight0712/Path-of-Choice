package object;

import java.io.File;

//創建檔案 設置
public class object {

    public static void main(String[] args) {
        File configDir = new File("config");
        if (!configDir.exists()) {
            configDir.mkdir();
            System.out.println(data.text.info_system + "- 寫入 config");
        } else {
            System.out.println(data.text.info_system + "- 讀取 config");
        }
    }
}
