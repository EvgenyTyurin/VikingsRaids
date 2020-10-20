package evgenyt.vikingsraids.model;

import java.util.ArrayList;
import java.util.List;

public class AppData {
    private static AppData appData;
    private Earl player;
    private List<Province> provinces;

    public static AppData getInstance() {
        if (appData == null) {
            appData = new AppData();
            appData.init();
        }
        return appData;
    }

    private void init() {
        // player init
        player = new Earl("Ottar");
        player.setGold(1000);
        player.setPrestige(100);
        player.setShipsNumber(1);
        // provinces init
        provinces = new ArrayList<>();
        provinces.add(new Province("Wales", 50, 500));
    }

    public RaidResult raidProvince(Province province, Raid raid) {
        Earl earl = raid.getEarl();
        System.out.println(raid.getMenAtStart() + " vikings attacking " + province.getManPower() + " defenders");
        int menLost = province.getManPower() / 2;
        int menKilled = menLost;
        province.setManPower(province.getManPower() - menKilled / 2);
        int goldPlundered = province.getGold() / 2;
        province.setGold(province.getGold() - goldPlundered);
        earl.setGold(earl.getGold() + goldPlundered);
        return new RaidResult(menLost, goldPlundered, menKilled);
    }

    public int getManPower(Earl earl) {
        return earl.getPrestige() * 1;
    }

    public int getMaxRaid(Earl earl) {
        return Math.min(getManPower(earl), earl.getShipsNumber() * 100);
    }

    public Earl getPlayer() {
        return player;
    }

    public void setPlayer(Earl player) {
        this.player = player;
    }

    public List<Province> getProvinces() {
        return provinces;
    }
}
