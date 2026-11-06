package tela.decorador;

import javax.swing.JComponent;
import javax.swing.border.LineBorder;

import tela.ElementoVisual;

import java.awt.*;

public class Borda extends DecoradorBase {

    public Borda(ElementoVisual elemento) {
        super(elemento);
    }

    @Override
    public JComponent renderizar() {
        JComponent componente = super.renderizar();
        componente.setBorder(new LineBorder(Color.RED, 2));
        return componente;
    }
}
