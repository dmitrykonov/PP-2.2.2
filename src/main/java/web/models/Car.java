package web.models;

public class Car {
    private String model;
    private int release;
    private int serialnumber;

    public Car() {
    }

    public Car(String model, int release, int serialnumber) {
        this.model = model;
        this.release = release;
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    @Override
    public String toString() {
        return "Car " +
                "model='" + model + '\'' +
                ", age=" + release +
                ", serialnumber=" + serialnumber;
    }
}
