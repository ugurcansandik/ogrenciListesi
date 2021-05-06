import java.io.Serializable;
 
public class Kisi implements Serializable
{  
    
    private char cinsiyet;
    private String ad;
    private String soyad;
    private String durum;
    
    public Kisi(char cinsiyet, String ad, String soyad, String durum)
    {
        this.cinsiyet = cinsiyet;
        this.ad = ad;
        this.soyad = soyad;
        this.durum = durum;
    }
    
    public char getCinsiyet() 
    {
        return cinsiyet;
    }
    
    public void setCinsiyet(char cinsiyet)
    {
        this.cinsiyet = cinsiyet;
    }
    
    public String getAd() 
    {
        return ad;
    }
    
    public void setAd(String ad)
    {
        this.ad = ad;
    }
    
    public String getSoyad()
    {
        return soyad;
    }
    
    public void setSoyad(String soyad)
    {
        this.soyad = soyad;
    }
    
    public String getDurum()
    {
        return durum;
    }
    
    public void setDurum(String durum)
    {
        this.durum = durum;
    }
    
    public String toString()
    {
        return "Ad : " + this.ad + "\nSoyad : " + this.soyad;
    }
}
