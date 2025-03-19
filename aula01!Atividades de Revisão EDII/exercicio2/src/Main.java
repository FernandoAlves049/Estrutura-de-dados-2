import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        modificadordetexto editor = new modificadordetexto();

        JFrame frame = new JFrame("Editor de Texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton inserirButton = new JButton("Inserir Texto");
        inserirButton.setBackground(new Color(100, 200, 100));
        inserirButton.setForeground(Color.WHITE);
        inserirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = JOptionPane.showInputDialog(frame, "Digite o texto a ser inserido:");
                if (texto != null && !texto.isEmpty()) {
                    editor.inserir(texto);
                    textArea.setText(editor.getTexto());
                }
            }
        });

        JButton removerButton = new JButton("Remover Texto");
        removerButton.setBackground(new Color(200, 100, 100));
        removerButton.setForeground(Color.WHITE);
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Digite o número de caracteres a remover:");
                if (input != null) {
                    try {
                        int n = Integer.parseInt(input);
                        editor.remover(n);
                        textArea.setText(editor.getTexto());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Entrada inválida. Digite um número válido.");
                    }
                }
            }
        });

        JButton desfazerButton = new JButton("Desfazer");
        desfazerButton.setBackground(new Color(100, 100, 200));
        desfazerButton.setForeground(Color.WHITE);
        desfazerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editor.desfazer();
                textArea.setText(editor.getTexto());
            }
        });

        JButton refazerButton = new JButton("Refazer");
        refazerButton.setBackground(new Color(200, 200, 100));
        refazerButton.setForeground(Color.BLACK);
        refazerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editor.refazer();
                textArea.setText(editor.getTexto());
            }
        });

        JButton sairButton = new JButton("Sair");
        sairButton.setBackground(new Color(150, 150, 150));
        sairButton.setForeground(Color.WHITE);
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        buttonPanel.add(inserirButton);
        buttonPanel.add(removerButton);
        buttonPanel.add(desfazerButton);
        buttonPanel.add(refazerButton);
        buttonPanel.add(sairButton);

        frame.add(buttonPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }
}