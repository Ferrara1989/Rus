public class Computer {
    private CPU aMD;
    private Keyboard mechanic;
    private RAM sony;
    private Screen ss;

    public Computer() {

    }
    public Computer(CPU aMD, Keyboard mechanic, RAM sony, Screen ss) {
        this.aMD = aMD;
        this.mechanic = mechanic;
        this.sony = sony;
        this.ss = ss;
    }

    public void coping(Computer one) {
        aMD = one.getaMD();
        mechanic = one.getMechanic();
        sony = one.getSony();
        ss = one.getSs();
    }

    public CPU getaMD() {

        return aMD;
    }

    public void setaMD(CPU aMD) {

        this.aMD = aMD;
    }

    public Keyboard getMechanic() {

        return mechanic;
    }

    public void setMechanic(Keyboard mechanic) {

        this.mechanic = mechanic;
    }

    public RAM getSony() {

        return sony;
    }

    public void setSony(RAM sony) {

        this.sony = sony;
    }

    public Screen getSs() {

        return ss;
    }

    public void setSs(Screen ss) {

        this.ss = ss;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "aMD=" + aMD +
                ", mechanic=" + mechanic +
                ", sony=" + sony +
                ", ss=" + ss +
                '}';
    }
}
