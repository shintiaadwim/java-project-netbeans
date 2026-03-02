package uas.display;

public interface Display {
    /**
     * @return String representasi data untuk ditampilkan
     */
    String getInfo();
    
    /**
     * Menampilkan informasi ke konsol atau sistem output lainnya.
     */
    void printDetail();
}