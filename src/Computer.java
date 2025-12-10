public class Computer {
    private final String motherBoard;
    private final String cpu;
    private final int memory;
    private final int power;

    private final String gpu;
    private final String os;
    private final boolean hasSSD;

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getPower() {
        return power;
    }

    public String getGpu() {
        return gpu;
    }

    public String getOs() {
        return os;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.gpu = "gpu";
        this.os = "os";
        this.hasSSD = false;
        this.power = builder.power;
        this.motherBoard = builder.motherBoard;
    }

    public static class Builder {
        private final String motherBoard;
        private String cpu;
        private int memory;
        private int power;

        public Builder(String motherBoard) {
            this.motherBoard = motherBoard;
        }

        public Builder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder withMemory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder withPower(int power) {
            this.power = power;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
