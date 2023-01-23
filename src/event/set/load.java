package event.set;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class load {

    public static void detection() throws Exception {

    }

    public static void read() throws Exception {
        System.out.println("偵測檔案");
        System.out.println("====================");
        file.config.config_folder();
        file.lang.lang_folder();
        file.language.zh_tw.create_file();
        data.lang.lang_use();
        object.mob.read.load_mob_name();
        data.player.restart();
        System.out.println("====================");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("確認完畢" + "\n");
    }
}
