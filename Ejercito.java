import java.util.ArrayList;
/**
 * Write a description of class ejercito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercito
{
    private ArrayList<Tanques> listaDeTanques;
    private int numSerie;
    /**
     * Constructor for objects of class ejercito
     */
    public Ejercito()
    {
        listaDeTanques = new ArrayList<Tanques>();
        numSerie = 0;
    }
    
    /**
     * Añade un tanque
     */
    public void addTanque(String modelo,String pais ,int peso)
    {
        numSerie++;
        Tanques  tanque = new Tanques(modelo,pais,peso,numSerie);
        listaDeTanques.add(tanque);
        
    }
    
    /**
     * Mostrar tanques numerados
     */
    public void mostrarTanquesNumerados()
    {
        int posicionTanquesActual = 0;
        while (posicionTanquesActual < listaDeTanques.size()) {
            System.out.println((posicionTanquesActual+1) + ". " + listaDeTanques.get(posicionTanquesActual).getDatosTanque());
            posicionTanquesActual++;
        }
    }
}