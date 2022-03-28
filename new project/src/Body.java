public class Body {
    private static String bodyType = "";

    public Body() {

    }
    public Body(String bodyType) {

        this.bodyType = bodyType;
    }

    public String getBodyType() {

        return bodyType;
    }

    public void setBodyType(String BodyType) {
        this.bodyType = bodyType;
    }

    public void bodyType(machineBodyType type) {
        if (type == machineBodyType.SEDAN) {
            System.out.println("SEDAN");
        } else if(type == machineBodyType.HAGEBACK) {
            System.out.println("HAGEBACK");
        } else if(type == machineBodyType.ARGOCAR) {
            System.out.println("ARGOCAR");
        }
    }
    public void print() {
        System.out.println("Тип кузова: " + bodyType);
    }
}
