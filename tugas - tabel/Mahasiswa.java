public class Mahasiswa
{
    private String npm;
    private String nama;
    private String usia;

    public String getNpm()
    {
        return this.npm;
    }

    public void setNpm(String x)
    {
        this.npm = x;
    }

    public String getNama()
    {
        return this.nama;
    }

    public void setNama(String x)
    {
        this.nama = x;
    }

    public String getUsia()
    {
        return this.usia;
    }

    public void setUsia(String x)
    {
        this.usia = x;
    }

    public String toString()
    {
        return "[" + this.npm + "] - " +this.nama + "] - " +this.usia;
    }
}
