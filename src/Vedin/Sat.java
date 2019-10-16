package Vedin;

public class Sat {
    private int sati, minute, sekunde;
    public Sat(int s, int m, int sek) { postavi(s, m, sek);}
    private void postavi(int s, int m, int sek) {
        sati=s;
        minute=m;
        sekunde=sek;
    }
    public void sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    public void prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    public void pomjeriZa(int pomak) {
        if (pomak>0)
            for (int i=0; i<pomak; i++) sljedeci();
        else
            for (int i=0; i<-pomak; i++) prethodni();
    }
    final public int DajSate() { return sati; }
    final public int DajMinute() { return minute; }
    final public int DajSekunde() { return sekunde; }
    final public void ispisi() { System.out.println(sati + ":" + minute + ":" + sekunde); }
}