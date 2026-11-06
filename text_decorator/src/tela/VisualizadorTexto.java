package tela;

import javax.swing.JComponent;
import javax.swing.JTextArea;

public class VisualizadorTexto implements ElementoVisual {

    private String texto;

    public VisualizadorTexto(String texto) {
        this.texto = texto;
    }

    public JComponent renderizar() {
        JTextArea textArea = new JTextArea(6, 30);
        textArea.setText(texto);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JComponent componenteFinal = textArea;
        return componenteFinal;
    }
}
