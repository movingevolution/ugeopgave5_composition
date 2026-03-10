package PartOne;

public class Window {

    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm) {
        this.heightCm = heightCm;
        this.widthCm = widthCm;
    }

    public int getAreaCm2() {
        return heightCm * widthCm;
    }

    @Override
    public String toString() {
        return "PartOne.Window: " + widthCm + "cm x " + heightCm + "cm";
    }


}
