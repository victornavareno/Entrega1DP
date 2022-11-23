
/**
 * La clase Bicicleta representa a las distintas bicicletas 
 * que los Ciclistas pueden usar en las Etapas. 
 * 
 * @author Víctor
 * @version 1
 */
public class Bicicleta
{
    // definicion de campos de la clase Bicicleta
    private String nombre;
    private Peso peso;

    /**
     *  Constructor parametrizado de Bicicleta
     */
    public Bicicleta(String nombre, Peso peso)
    {
        this. nombre = nombre;
        this.peso = peso;
    }

    //MÉTODOS MODIFICADORES (set)
    /**
     * Asigna el nombre de la bicicleta
     * @param String nombreBici 
     */
    void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Asigna el peso de la bicicleta
     * @param double pesoBici
     */
    void setPeso(Peso peso){
        this.peso = peso;
    }

    //MÉTODOS DE ACCESO(get)
    /**
     * Devuelve el nombre de la Bicicleta
     * @return String con el nombre de la bicicleta
     */
    String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el peso de la Bicicleta
     * @return double peso
     */
    double getPeso(){
        return this.peso.getValor();
    }


    //OTROS METODOS DE LA CLASE Bicicleta:
    /**
     * Muestra las características de una Bicicleta
     * @return devuelve las características de una Bicicleta
     */    
    public String toString (){
        return "<bicicleta: " + nombre + "> <peso: " + peso + ")>";
    }

    /**
     * Comprueba que la bicicleta pasada es igual que el nativo comparando sus campos, return false si algún valor distinto
     * @return boolean 
     */
    public boolean equals(Object obj){        
        if(this == obj) {
            return true; //Ambos referencian al mismo objeto
        }
        if(!(obj instanceof Bicicleta)) {
            return false; //Tienen diferentes tipos
        }
        Bicicleta other = (Bicicleta) obj;
        // ... compara cada campo significativo de
        // this y other:
        // return true si todos los valores iguales
        // return false si algún valor distinto
        if (getNombre() != other.getNombre()){
            return false;
        }
        if (getPeso() != other.getPeso()){
            return false;
        }
        return true;
    }

    /**
     *  calcular y proporcionar su velocidad cuando es usada por un Ciclista 
     *  en particular en una Etapa en concreto
     *  
     * @param  double habilidadCiclista, double dificultadEtapa
     * @return    double velocidad
     */
    public double calcularVelocidad(double habilidadCiclista, double dificultadEtapa)
    {
            double velocidad = (habilidadCiclista * 100) / (peso.getValor() * dificultadEtapa);
        return velocidad;
    }

    /**
     *  calcular y proporcionar el tiempo necesario (medido en minutos) para terminar
     *  la Etapa cuando es usada por un Ciclista en particular en una Etapa concreta

     * @param  int distanciaEtapa double velocidad
     * @return    double tiempo
     */
    public double calcularTiempo(int distanciaEtapa, double velocidad)
    {
        double tiempo = (distanciaEtapa / velocidad) * 60;
        return tiempo;
    }


}