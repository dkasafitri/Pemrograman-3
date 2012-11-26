public class Mahasiswa
{
	private String nim;
	private String nama;
	private String hobi;

	public String getNim()
	{
		return this.nim;
	}

	public void setNim(String x)
	{
	    this.nim = x;
	}

	public String getNama()
	{
	    return this.nama;
	}

	public void setNama(String x)
	{
	    this.nama = x;
	}

	public String getHobi()
	{
	    return this.hobi;
	}

	public void setHobi(String x)
	{
	    this.hobi = x;
	}

	public String toString()
	{
	    return this.nim + " - " + this.nama + " - " + this.hobi;
	}
}
