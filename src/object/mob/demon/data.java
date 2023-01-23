package object.mob.demon;

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
}
