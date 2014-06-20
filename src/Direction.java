public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private String representation;

    Direction(String str) {
        this.representation = str;
    }

    @Override
    public String toString() {
        return representation;
    }
}
