public class Body {
    private String bodyType = "";

    public Body() {

    }
    public Body(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public void print() {
        System.out.println("Тип кузова: " + bodyType);
    }
}
