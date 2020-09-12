package Clases;

import javax.swing.ImageIcon;


public class ImagenNumero {

    private ImageIcon icon;
    private int  valor;

    public ImagenNumero(ImageIcon i, int v) {
        this.icon = i;
        this.valor = v;
    }

    public int getValor() {
        return valor;
    }

    public ImageIcon getImagen() {
        return icon;
    }

}
