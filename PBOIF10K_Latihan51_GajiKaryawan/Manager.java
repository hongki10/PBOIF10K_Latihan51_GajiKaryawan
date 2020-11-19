/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Gaji Karyawan 
 */
 
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
    public int getKehadiran() {
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran (int hadir) {
        float tunjKehadiran = hadir * 10000;
        
        this.tunjanganKehadiran = tunjKehadiran;
        
        return tunjKehadiran;
    }
    
    public float tunjanganJabatan (String jabatan) {
        float tunjJabatan = 0;
        
        jabatan = jabatan.toLowerCase();
        if(jabatan.equals("manager")) {
            tunjJabatan = 2000000;
        } else if (jabatan.equals("kabag")) {
            tunjJabatan = 1500000;
        } else {
            tunjJabatan = 0;
        }
        
        this.tunjanganJabatan = tunjJabatan;
        
        return tunjJabatan;
    }
    
    public float tunjanganGolongan (int golongan) {
        float tunjGolongan = 0;
        
        switch (golongan) {
            case 1:
                tunjGolongan = 500000;
                break;
            case 2:
                tunjGolongan = 1000000;
                break;
            case 3:
                tunjGolongan = 1500000;
                break;
            default:
                tunjGolongan = 0;
                break;
        }
        
        this.tunjanganGolongan = tunjGolongan;
        
        return tunjGolongan;
    }
    
    public float gajiTotal () {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}