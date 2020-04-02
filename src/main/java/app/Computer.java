package app;

public class Computer {

    private Long id;
    private String ddrType;
    private long mhz;
    private int memorySize;

    public Computer() {
    }

    public Computer(Long id, String ddrType, long mhz, int memorySize) {
        this.id = id;
        this.ddrType = ddrType;
        this.mhz = mhz;
        this.memorySize = memorySize;
    }

    public String getDdrType() {
        return ddrType;
    }

    public void setDdrType(String ddrType) {
        this.ddrType = ddrType;
    }

    public long getMhz() {
        return mhz;
    }

    public void setMhz(long mhz) {
        this.mhz = mhz;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", ddrType='" + ddrType + '\'' +
                ", mhz=" + mhz +
                ", memorySize=" + memorySize +
                '}';
    }
}
