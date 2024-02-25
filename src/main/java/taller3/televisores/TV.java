package taller3.televisores;

public class TV {
    Marca marca;
    public int canal = 1;
    private int precio = 500;
    public boolean estado;
    public int volumen = 1;
    Control control;
    public static long numTV = 0;

    public TV (Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }
//Get y set de marca
    public Marca getMarca() {
        return marca;
    }
    
    public void setMarca (Marca marca) {
        this.marca = marca;
    }
//Get y set de canal
    public int getCanal () {
        return canal;
    }

    public void setCanal (int canal) {
        this.canal = canal;
    }
//Get y set de precio
    public int getPrecio () {
        return precio;
    }

    public void setPrecio (int precio) {
        this.precio = precio;
    }
//Get y set de volumen
    public int getVolumen () {
        return volumen;
    }

    public void setVolumen (int volumen) {
        this.volumen = volumen;
    }

//Get y set de control
    public Control getControl () {
        return control;
    }

    public void setControl (Control control) {
        this.control = control;
    }
//Get y set de numTV
    public long getNumTV () {
        return numTV;
    }

    public void setNumTV (long numTV) {
        this.numTV = numTV;
    }

    public void turnOn () {
        estado = true;
    }
    
    public void turnOff () {
        estado = false;
    }

    public boolean getEstado () {
        return estado;
    }

//Control de canal
    public void canalUp () {
        if (getEstado() == false) {
            return;
        }
        else if (getCanal() == 120) {
            return;
        }
        else {
            this.canal++;
        }
    }

    public void canalDown () {
        if (getEstado() == false) {
            return;
        }
        else if (getCanal() <= 1) {
            return;
        }
        else {
            this.canal--;
        }
    }

//Control de volumen
    public void volumenUp () {
        if (getEstado() == false) {
            return;
        }
        else if (getCanal() >= 7) {
            return;
        }
        else {
            this.volumen++;
        }
    }
    public void volumenDown () {
        if (getEstado() == false) {
            return;
        }
        else if (getCanal() <= 0) {
            return;
        }
        else {
            this.volumen--;
        }
    }
}