package pl.javastart.task;

class Televisor {
    private boolean isOn;

    public Televisor(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void showStatus() {
        System.out.println("Telewizor jest wlaczony: " + isOn);
    }
}
