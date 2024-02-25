package taller3.televisores;

public class Control {
    TV tv;

    public void turnOn() {
        TV.turnOn();
    }

    public void turnOff() {
        TV.turnOff();
    }
    
    public void canalUp() {
        TV.canalUp();
    }

    public void canalDown() {
        TV.canalDown();
    }

    public void volumenUp() {
        TV.volumenUp();
    }

    public void volumenDown() {
        TV.volumenDown();
    }

    public void setCanal(int canal) {
        TV.setCanal(canal);
    }

    public void setVolumen() {
        TV.setVolumen();
    }

    public void enlazar(TV tv) {
        this.tv = tv;
        TV.Control = tv;
    }

    public TV getTv() {
        return this.tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;

    }
}
