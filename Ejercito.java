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
    private ArrayList<Tanques> tanques2;
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

    /**
     *
     */
    public void imprimirTanqueMayorPeso(){
        tanques2 = listaDeTanques;
        while(tanques2.size() != 0){
            if(listaDeTanques.size()>0) {
                Tanques tanquesMayorPeso = tanques2.get(0);
                for(Tanques TanquesActual : tanques2) {
                    if (TanquesActual.getPeso() <= tanquesMayorPeso.getPeso()){
                        tanquesMayorPeso = TanquesActual;
                    }
                }
                System.out.println(tanquesMayorPeso.getDatosTanque());
                tanques2.remove(tanquesMayorPeso);
            }
        }

    }

    /**
     * Cambia el peso del tanque con numero de chais dado.
     * Si el usuario indica una posicion no válida, el metodo no
     * hace nada.
     */
    public void cambiarpeso( int numSerie,int nuevoPeso)
    {
        if(numSerie>=0 && listaDeTanques.size()>0) {
            Tanques serie = listaDeTanques.get(0);
            for(Tanques TanquesActual : listaDeTanques) {
                    if (TanquesActual.getNumSerie() == numSerie){
                        serie = TanquesActual;
                        serie.setPeso(nuevoPeso);
                    }
            
            
        }
    }
    
    } 
}