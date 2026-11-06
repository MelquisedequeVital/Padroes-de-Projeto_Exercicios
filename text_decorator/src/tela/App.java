package tela;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import tela.decorador.Borda;
import tela.decorador.ScrollBar;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        // Executa a interface gráfica na thread correta do Swing
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Antes da Refatoração (Sem Decorator)");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

            // 1. Instância apenas com o texto cru
            ElementoVisual textoSimples = new VisualizadorTexto("1. Apenas texto. Sem borda e sem scroll.");

            // 2. Instância com texto e borda
            ElementoVisual textoComBorda = new Borda(new VisualizadorTexto("2. Texto com uma borda vermelha aplicada. Sem scrollbar."));

            // 3. Instância completa com scroll e borda
            String textoLongo = "3. Texto com borda e scrollbar. ".repeat(15)
                    + "Tente rolar para baixo para ver funcionando!";
            ElementoVisual textoCompleto = new Borda(new ScrollBar(new VisualizadorTexto(textoLongo)));

            // Adiciona os componentes gerados na tela
            frame.add(textoSimples.renderizar());
            frame.add(textoComBorda.renderizar());
            frame.add(textoCompleto.renderizar());

            frame.setSize(450, 600);
            frame.setLocationRelativeTo(null); // Centraliza a janela no monitor
            frame.setVisible(true);
        });
    }
}
