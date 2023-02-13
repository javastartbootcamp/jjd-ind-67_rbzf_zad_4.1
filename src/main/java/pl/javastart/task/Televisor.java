package pl.javastart.task;

class Televisor {
    private boolean isOn;

    public Televisor(boolean isOn) {
        this.isOn = isOn;
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
