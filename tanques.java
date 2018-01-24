
/**
 * Write a description of class tanques here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tanques
{
    //modelo tanque 
    private String modelo;
    //pais de fabricacion
    private String pais;
    //peso del tanque 
    private int peso;
    //numero identificativo del tanque
    private int numSerie;
    /**
     * Constructor for objects of class tanques
     */
    public Tanques(String modelo,String pais,int peso ,int numSerie)
    {
        this.modelo = modelo;
        this.pais = pais;
        this.peso = peso;
        this.numSerie = numSerie;
    }   

    /**
     * Devuelve el modelo del tanque.
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * cambia el modelo del tanque
     */
    public void setModelo(String nuevoModelo){
        modelo =nuevoModelo;
    }

    /**
     * Devuelve el pais del tanque.
     */
    public String getPais()
    {
        return modelo;
    }

    /**
     * cambia el pais del tanque
     */
    public void setPais(String nuevoPais){
        pais =nuevoPais;
    }

    /**
     * Devuelve el peso del tanque en toneladas.
     */
    public int getPeso()
    {
        return peso;
    }

    /**
     * cambia el peso del tanque
     */
    public void setPeso(int nuevoPeso){
        peso =nuevoPeso;
    }

    /**
     * Devuelve el num identificativode el chasis del tanque.
     */
    public int getNumSerie()
    {
        return numSerie;
    }

    /**
     * cambia el num identificativo  de el chasis del tanque.
     */
    public void setNumSerie(int nuevoNumSerie){
        numSerie =nuevoNumSerie;
    }

    /**
     * Devuelve toda la informacion del tanque en formato string.
     */
    public String getDatosTanque()
    {
        String aDevolver = " modelo acorazado tipo: " + modelo + " pais de fabricacion: " + pais + " peso: "+ peso +"kg";

        return aDevolver; 
    }

}
