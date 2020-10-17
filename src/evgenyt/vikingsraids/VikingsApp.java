package evgenyt.vikingsraids;

import evgenyt.vikingsraids.model.AppData;
import evgenyt.vikingsraids.model.Earl;
import evgenyt.vikingsraids.model.Province;
import evgenyt.vikingsraids.model.RaidResult;

import java.util.List;
import java.util.Scanner;

public class VikingsApp {
    public static void main(String[] args) {
        System.out.println("Started");
        AppData appData = AppData.getInstance();
        Earl player = appData.getPlayer();
        int year = 891;
        while (true) {
            // Display info
            System.out.println("\n*** YEAR " + year + "***\n");
            System.out.println("Earl     : " + player.getName());
            System.out.println("Prestige : " + player.getPrestige());
            System.out.println("Gold     : " + player.getGold());
            System.out.println("Ships    : " + player.getShipsNumber());
            int manPower = appData.getManPower(player);
            int maxRaidPower = appData.getMaxRaid(player);
            System.out.println("Man power: " + maxRaidPower + "/" + manPower + "\n");
            System.out.println("Provinces avail to raid:");
            List<Province> provinces = appData.getProvinces();
            for (Province province : provinces) {
                System.out.println(province.getName() + ", " + province.getManPower() +
                        " men, " + province.getGold() + " gold");
            }
            System.out.println("\nProvince to raid:");
            Scanner scanner = new Scanner(System.in);
            String raidProvince = scanner.next();
            int provinceIdx = provinces.indexOf(new Province(raidProvince, 0, 0));
            if (provinceIdx > -1) {
                Province province = provinces.get(provinceIdx);
                RaidResult raidResult = appData.raidProvince(province, player);
                System.out.println(province + " raided!");
                System.out.println("Gold plundered: " + raidResult.getGoldPlundered());
                System.out.println("Men lost      : " + raidResult.getMenLost());
                System.out.println("Men killed    : " + raidResult.getMenKilled());
            }
            year++;
        }
    }
}
