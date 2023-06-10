import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class KalkulatorView extends JFrame{
    private JLabel labelAngka1, labelAngka2, labelHasil;
    private JTextField fieldAngka1, fieldAngka2, fieldHasil;
    private JButton buttonTambah, buttonKurang, buttonKali, buttonBagi;

    public KalkulatorView() {
        setTitle("Kalkulator Sederhana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLayout(new GridLayout(5, 2));

        labelAngka1 = new JLabel("Angka Pertama: ");
        fieldAngka1 = new JTextField(10);

        labelAngka2 = new JLabel("Angka Kedua: ");
        fieldAngka2 = new JTextField(10);

        labelHasil = new JLabel("Hasil: ");
        fieldHasil = new JTextField(10);
        fieldHasil.setEditable(false);

        buttonTambah = new JButton("Tambah");
        buttonKurang = new JButton("Kurang");
        buttonKali = new JButton("Kali");
        buttonBagi = new JButton("Bagi");

        add(labelAngka1);
        add(fieldAngka1);
        add(labelAngka2);
        add(fieldAngka2);
        add(labelHasil);
        add(fieldHasil);
        add(buttonTambah);
        add(buttonKurang);
        add(buttonKali);
        add(buttonBagi);
        setVisible(true);
    }

    public double getAngka1() {
        if (fieldAngka1.getText().isEmpty()){
            throw new NumberFormatException("Masukkan tidak boleh kosong.");
        }
        return Double.parseDouble(fieldAngka1.getText());
    }

    public double getAngka2() {
        if (fieldAngka2.getText().isEmpty()){
            throw new NumberFormatException("Masukkan tidak boleh kosong.");
        }
        return Double.parseDouble(fieldAngka2.getText());
    }

    public void setFieldHasil(double hasil) {
        fieldHasil.setText(Double.toString(hasil));
    }

    public void setFieldHasilError(String errorMessage) {
        fieldHasil.setText("Error: " + errorMessage);
    }

    public void buttonTambahOnClick(ActionListener listener) {
        buttonTambah.addActionListener(listener);
    }

    public void buttonKurangOnClick(ActionListener listener) {
        buttonKurang.addActionListener(listener);
    }

    public void buttonKaliOnClick(ActionListener listener) {
        buttonKali.addActionListener(listener);
    }

    public void buttonBagiOnClick(ActionListener listener) {
        buttonBagi.addActionListener(listener);
    }
    
}