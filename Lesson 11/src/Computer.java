    public class Computer {
        private final String vendor = "IBM";
        private final String name = "Pentium";
        private CPU cpu;
        private RAM ram;
        private HDD hdd;
        private Screen screen;
        private Keyboard keyboard;
        public double weightScreen = 2;
        public double weightHDD = 0.2;
        public double weightRAM = 0.2;
        public double weightNumberOfCores = 0.0460;
        public double totalMass = 0;

        public Computer() {

        }
        public Computer(CPU cpu, RAM ram, HDD hdd, Screen screen, Keyboard keyboard) {
            this.cpu = cpu;
            this.ram = ram;
            this.hdd = hdd;
            this.screen = screen;
            this.keyboard = keyboard;
            totalMass = screen.getWeight() + ram.getWeightRAM() + hdd.getWeight() + keyboard.getWeightKeyboard() + cpu.getWeightNumberOfCores();
        }

        public String getVendor() {

            return vendor;
        }

        public String getName() {

            return name;
        }

        public CPU getCpu() {

            return cpu;
        }

        public void setCpu(CPU cpu) {
            this.cpu = cpu;
        }

        public RAM getRam() {

            return ram;
        }

        public void setRam(RAM ram) {

            this.ram = ram;
        }

        public HDD getHdd() {

            return hdd;
        }

        public void setHdd(HDD hdd) {

            this.hdd = hdd;
        }

        public Screen getScreen() {

            return screen;
        }

        public void setScreen(Screen screen) {

            this.screen = screen;
        }

        public Keyboard getKeyboard() {

            return keyboard;
        }

        public void setKeyboard(Keyboard keyboard) {

            this.keyboard = keyboard;
        }

        public double getWeightScreen() {

            return weightScreen;
        }

        public void setWeightScreen(double weightScreen) {

            this.weightScreen = weightScreen;
        }

        public double getWeightHDD() {

            return weightHDD;
        }

        public void setWeightHDD(double weightHDD) {

            this.weightHDD = weightHDD;
        }

        public double getWeightRAM() {

            return weightRAM;
        }

        public void setWeightRAM(double weightRAM) {

            this.weightRAM = weightRAM;
        }

        public double getWeightNumberOfCores() {

            return weightNumberOfCores;
        }

        public void setWeightNumberOfCores(double weightNumberOfCores) {
            this.weightNumberOfCores = weightNumberOfCores;
        }

        public double getTotalMass(CPU cpu, RAM ram, HDD hdd, Screen screen, Keyboard keyboard) {
            totalMass = screen.getWeight() + ram.getWeightRAM() + hdd.getWeight() + keyboard.getWeightKeyboard() + cpu.getWeightNumberOfCores();
            return totalMass;
        }

        public void setTotalMass(double totalMass) {

            this.totalMass = totalMass;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "vendor='" + vendor + '\'' +
                    ", name='" + name + '\'' +
                    ", cpu=" + cpu +
                    ", ram=" + ram +
                    ", hdd=" + hdd +
                    ", screen=" + screen +
                    ", Keyboard=" + keyboard +
                    ", weightScreen=" + weightScreen +
                    ", weightHDD=" + weightHDD +
                    ", weightRAM=" + weightRAM +
                    ", weightNumberOfCores=" + weightNumberOfCores +
                    ", TotalMass=" + totalMass +
                    '}';
        }
    }


