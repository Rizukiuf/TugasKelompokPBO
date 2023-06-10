import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorController {
    private KalkulatorModel model;
    private KalkulatorView view;
    private double hasil;

    public KalkulatorController() {
        model = new KalkulatorModel();
        view = new KalkulatorView();

        view.buttonTambahOnClick(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    hasil = model.tambah(view.getAngka1(), view.getAngka2());
                    view.setFieldHasil(hasil);
                }
                catch(NumberFormatException ex){
                    view.setFieldHasilError(ex.getMessage());
                }
            }
        });

        view.buttonKurangOnClick(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    hasil = model.kurang(view.getAngka1(), view.getAngka2());
                    view.setFieldHasil(hasil);
                }
                catch(NumberFormatException ex){
                    view.setFieldHasilError(ex.getMessage());
                }
            }
        });

        view.buttonKaliOnClick(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    hasil = model.kali(view.getAngka1(), view.getAngka2());
                    view.setFieldHasil(hasil);
                }
                catch(NumberFormatException ex){
                    view.setFieldHasilError(ex.getMessage());
                }
            }
        });

        view.buttonBagiOnClick(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    hasil = model.bagi(view.getAngka1(), view.getAngka2());
                    view.setFieldHasil(hasil);
                }
                catch(NumberFormatException ex){
                    view.setFieldHasilError(ex.getMessage());
                }
            }
        });
    }
}
