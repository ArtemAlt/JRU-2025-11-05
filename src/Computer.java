public class Computer {
    private String model;
    private String processor;
    private Integer cpu;
    private Integer memory;

    private Computer(String model, String processor, Integer cpu, Integer memory) {
        this.model = model;
        this.processor = processor;
        this.cpu = cpu;
        this.memory = memory;
    }

    public static class Builder {
        private String model;
        private String processor;
        private Integer cpu;
        private Integer memory;

        public Builder model(String model) {
            this.model = model;
            return this;
        }
        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        public Computer build() {
            return new Computer(model, processor, cpu, memory);
        }
    }
}
