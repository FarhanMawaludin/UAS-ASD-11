public class transaksiRental11<BarangRental> {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    barangRental11 BarangRental;

    transaksiRental11(int kodeTransaksi, String namaPeminjam,int lamaPinjam,double totalBiaya,barangRental11 BarangRental){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.BarangRental = BarangRental;
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental getBarangRental11() {
        return (BarangRental) BarangRental;
    }

    
}
