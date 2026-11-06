package tela.decorador;

import javax.swing.JComponent;

import tela.ElementoVisual;

public abstract class DecoradorBase implements ElementoVisual{

    public ElementoVisual elementoVisual;

    public DecoradorBase(ElementoVisual elementoVisual){
        this.elementoVisual = elementoVisual;
    }

    public JComponent renderizar(){
        return this.elementoVisual.renderizar();
    };
}
