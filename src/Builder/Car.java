package Builder;

public class Car {
    public String wheel = null;
    public String oilbox = null;
    public String body = null;

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getOilbox() {
        return oilbox;
    }

    public void setOilbox(String oilbox) {
        this.oilbox = oilbox;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void Introduce() {
        System.out.println("车轮: " + getWheel());
        System.out.println("邮箱: " + getOilbox());
        System.out.println("车身: " + getBody());
    }
}
