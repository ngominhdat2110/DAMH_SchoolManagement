package Main;

abstract public class BangLuongNgoaiGioChiTiet {
    protected int MaBLNG;
    protected int MaCB;
    protected int SoTietNgoaiGio;
    protected double LuongNgoaiGioTheoTiet;
    protected double TongLuongNgoaiGio;
    
    public BangLuongNgoaiGioChiTiet(){}
    
    
    public BangLuongNgoaiGioChiTiet(int MaBLNG, int MaCB, int SoTietNgoaiGio, int LuongNgoaiGioTheoTiet, int TongLuongNgoaiGio){
        this.MaBLNG = MaBLNG;
        this.MaCB = MaCB;
        this.SoTietNgoaiGio = SoTietNgoaiGio;
        this.LuongNgoaiGioTheoTiet = LuongNgoaiGioTheoTiet;
        this.TongLuongNgoaiGio = TongLuongNgoaiGio;
    }

    public int getMaBLNG() {
        return MaBLNG;
    }

    public int getMaCB() {
        return MaCB;
    }

    public int getSoTietNgoaiGio() {
        return SoTietNgoaiGio;
    }

    public double getLuongNgoaiGioTheoTiet() {
        return LuongNgoaiGioTheoTiet;
    }

    public double getTongLuongNgoaiGio() {
        return TongLuongNgoaiGio;
    }

    public void setMaBLNG(int MaBLNG) {
        this.MaBLNG = MaBLNG;
    }

    public void setMaCB(int MaCB) {
        this.MaCB = MaCB;
    }

    public void setSoTietNgoaiGio(int SoTietNgoaiGio) {
        this.SoTietNgoaiGio = SoTietNgoaiGio;
    }

    public void setLuongNgoaiGioTheoTiet(double LuongNgoaiGioTheoTiet) {
        this.LuongNgoaiGioTheoTiet = LuongNgoaiGioTheoTiet;
    }

    public void setTongLuongNgoaiGio(double TongLuongNgoaiGio) {
        this.TongLuongNgoaiGio = TongLuongNgoaiGio;
    }
    
    
}
