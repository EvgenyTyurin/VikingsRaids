package evgenyt.vikingsraids.model;

public class RaidResult {
    private final int menLost;
    private final int goldPlundered;
    private final int menKilled;

    public RaidResult(int menLost, int goldPlundered, int menKilled) {
        this.menLost = menLost;
        this.goldPlundered = goldPlundered;
        this.menKilled = menKilled;
    }

    public int getMenLost() {
        return menLost;
    }

    public int getGoldPlundered() {
        return goldPlundered;
    }

    public int getMenKilled() {
        return menKilled;
    }

}
