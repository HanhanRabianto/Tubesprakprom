import java.awt.*;
import javax.swing.*;

public class HelloFlowLayout extends JFrame {
    public HelloFlowLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat beberapa tombol
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        // Menggunakan layout bawaan FlowLayout
        this.setLayout(new FlowLayout());

        // Menambahkan tombol ke jendela
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);

        // Mengatur ukuran jendela
        this.setSize(400, 400);
    }

    public static void main(String[] args) {
        // Menjalankan aplikasi GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloFlowLayout h = new HelloFlowLayout();
                h.setVisible(true);
            }
        });
    }
}
