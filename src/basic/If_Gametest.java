package basic;

import java.sql.DatabaseMetaData;
import java.util.Scanner;

public class If_Gametest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Default_HP = 200;
        System.out.println("Damage Token:");
        int Damage_Token =sc.nextInt();
        System.out.println("HP Recovery:");
        int HP_Recover =  sc.nextInt();
        int HP=Default_HP - Damage_Token;

        if (HP<=0){
            HP=1;
        }
        HP=HP + HP_Recover;
        if (HP<=0){
            HP=1;
        }
        System.out.println("Current HP:" + HP);
    }
}
