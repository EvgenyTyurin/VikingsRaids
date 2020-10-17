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

    public RaidResult raidProvince(Province province, Earl earl) {
        return new RaidResult(10, 250, 25);
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
