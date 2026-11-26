package tela.decorador;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import tela.ElementoVisual;

public class ScrollBar extends DecoradorBase {

    public ScrollBar(ElementoVisual elemento) {
        super(elemento);
    }

    public JComponent renderizar() {
        JComponent componente = super.renderizar();
        JScrollPane scrollPane = new JScrollPane(componente);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        return scrollPane;
    }
}
