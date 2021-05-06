import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) throws Exception
	{
	    read();
	}
	
	public static void read() throws Exception
	{
	    char cinsiyet;
	    String ad, soyad, durum;
	    ArrayList <Kisi> kisiler = new ArrayList<Kisi> ();
	    Scanner input = new Scanner(new File("ogrenciListesi.txt"));
        while(input.hasNext())
        {
            cinsiyet = input.next().charAt(0);
            ad = input.next().trim();
            soyad = input.next().trim();
            durum = input.next().trim();
            Kisi kisi = new Kisi(cinsiyet, ad, soyad, durum);
            kisiler.add(kisi);
        }
        write(kisiler);
	}
	
	public static void write(ArrayList <Kisi> kisiler) throws Exception
	{
	    int kalem = 0;
	    int bisiklet = 0;
	    int tabletBilgisayar = 0;
	    
	    FileWriter fw = new FileWriter("OgrenciHediyeler.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0 ; i < kisiler.size() ; i++)
        {
            if (kisiler.get(i).getDurum().equals("Kötü"))
            {
    	        bw.write(kisiler.get(i).getSoyad() + ", " + kisiler.get(i).getAd() + " kalem");
    	        kalem++;
    	    }else if(kisiler.get(i).getCinsiyet() == 'F' && kisiler.get(i).getDurum().equals("İyi"))
    	    {
    	        bw.write(kisiler.get(i).getSoyad() + ", " + kisiler.get(i).getAd() + " bisiklet");
    	        bisiklet++;
    	    }else if(kisiler.get(i).getCinsiyet() == 'M' && kisiler.get(i).getDurum().equals("İyi"))
    	    {
    	        bw.write(kisiler.get(i).getSoyad() + ", " + kisiler.get(i).getAd() + " tablet bilgisayar");
    	        tabletBilgisayar++;
    	    }
    	     bw.newLine();
        }

        bw.newLine();
	    bw.write("Kalem: " + kalem);
	    System.out.println("Kalem: " + kalem);
	    bw.newLine();
	    bw.write("Bisiklet: " + bisiklet);
	    System.out.println("Bisiklet: " + bisiklet);
	    bw.newLine();
	    bw.write("Tablet Bilgisayar: " + tabletBilgisayar);
	    System.out.println("Tablet Bilgisayar: " + tabletBilgisayar);
        
	    bw.newLine();
	    bw.close();
	}
}
