package evgenyt.vikingsraids.model;

import java.util.Objects;

public class Province {
    private final String name;
    private int manPower;
    private int gold;

    public Province(String name, int manPower, int gold) {
        this.name = name;
        this.manPower = manPower;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getManPower() {
        return manPower;
    }

    public void setManPower(int manPower) {
        this.manPower = manPower;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Province province = (Province) o;
        return name.equals(province.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
