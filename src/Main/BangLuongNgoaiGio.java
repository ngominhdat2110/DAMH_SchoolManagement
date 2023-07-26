package Main;
abstract public class BangLuongNgoaiGio {
    protected int MaBLNG;
    protected int Ky;
    protected int Nam;
    protected int LuongToiThieu;
    
    
    public BangLuongNgoaiGio(){}
    
    public BangLuongNgoaiGio(int MaBLNG, int Ky, int Nam, int LuongToiThieu){
        this.MaBLNG = MaBLNG;
        this.Ky = Ky;
        this.Nam = Nam;
        this.LuongToiThieu = LuongToiThieu;
    }

    public int getMaBLNG() {
        return MaBLNG;
    }

    public int getKy() {
        return Ky;
    }

    public int getNam() {
        return Nam;
    }

    public int getLuongToiThieu() {
        return LuongToiThieu;
    }

    public void setMaBLNG(int MaBLNG) {
        this.MaBLNG = MaBLNG;
    }

    public void setKy(int Ky) {
        this.Ky = Ky;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }

    public void setLuongToiThieu(int LuongToiThieu) {
        this.LuongToiThieu = LuongToiThieu;
    }
    
    
    
}
