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
     *ordena de menor a mayor peso
     */
    public void imprimirTanqueMenorPeso(){
        tanques2 = (ArrayList<Tanques>) listaDeTanques.clone();
        while(tanques2.size() != 0){
            if(tanques2.size()>0) {
                Tanques tanquesMayorPeso = tanques2.get(0);
                for(Tanques tanquesActual : tanques2) {
                    if (tanquesActual.getPeso() <= tanquesMayorPeso.getPeso()){
                        tanquesMayorPeso = tanquesActual;
                    }
                }
                System.out.println(tanquesMayorPeso.getDatosTanque());
                tanques2.remove(tanquesMayorPeso);
            }
        }

    }
    
    
    /**
     *ordena de menor a mayor peso
     */
    public void imprimirTanquePorPais(){
        tanques2 = (ArrayList<Tanques>) listaDeTanques.clone();
        while(tanques2.size() != 0){
            
                Tanques tanquesPorPais = tanques2.get(0);
                for(Tanques tanquesActual : tanques2) {
                    if (tanquesActual.getPais().length() <= tanquesPorPais.getPais().length()){
                        tanquesPorPais = tanquesActual;
                    }
                }
                System.out.println(tanquesPorPais.getDatosTanque());
                tanques2.remove(tanquesPorPais);
            
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
            for(Tanques tanquesActual : listaDeTanques) {
                if (tanquesActual.getNumSerie() == numSerie){
                    serie = tanquesActual;
                    serie.setPeso(nuevoPeso);
                }
            }
        }

    } 

    /**
     * eliminatodos los tanques que su peso sea menor al numero indicado
     */
    public void eiminar( int peso)
    {
        int cont = 0;
        while (cont <  listaDeTanques.size()){
            Tanques pesoMenor = listaDeTanques.get(cont);
            if(pesoMenor.getPeso()<peso){
                listaDeTanques.remove(cont);
                cont--;
            }
            cont++;
        }
        
    }

} 
