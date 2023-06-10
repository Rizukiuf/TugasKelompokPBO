public class KalkulatorModel {
    public double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public double bagi(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            return Double.NaN;
        }
    }
}