package app;

public class MobilePhone {
    private String system;
    private int resolution;
    private int prodYear;

    public MobilePhone() {
    }

    public MobilePhone(String system, int resolution, int prodYear) {
        this.system = system;
        this.resolution = resolution;
        this.prodYear = prodYear;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "system='" + system + '\'' +
                ", resolution=" + resolution +
                ", prodYear=" + prodYear +
                '}';
    }
}
