package evgenyt.vikingsraids.model;

public class Earl {
    private final String name;
    private int prestige;
    private int gold;
    private int shipsNumber;

    public Earl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrestige() {
        return prestige;
    }

    public void setPrestige(int prestige) {
        this.prestige = prestige;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getShipsNumber() {
        return shipsNumber;
    }

    public void setShipsNumber(int shipsNumber) {
        this.shipsNumber = shipsNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
