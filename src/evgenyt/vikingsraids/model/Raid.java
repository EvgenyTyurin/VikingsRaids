package evgenyt.vikingsraids.model;

public class Raid {
    private final Earl earl;
    private final int menAtStart;

    public Raid(Earl earl, int men) {
        this.earl = earl;
        this.menAtStart = men;
    }

    public Earl getEarl() {
        return earl;
    }

    public int getMenAtStart() {
        return menAtStart;
    }

}
