import java.util.Scanner;

/**
 * Clase Personaje
 */
public class Personaje {
    private final String nombre;
    private int vida;
    private final int ataque, defensa, destreza;
    private final Item[] items;

    private final double maxPesoPorPersonaje;

    /**
     * Constructor de la clase para inicializar todos los atributos
     * @param nombre
     * @param vida
     * @param ataque
     * @param defensa
     * @param destreza
     * @param maxItemsPorPersonaje
     * @param maxPesoPorPersonaje
     */
    public Personaje(String nombre, int vida, int ataque, int defensa, int destreza, int maxItemsPorPersonaje, double maxPesoPorPersonaje) {

    }

    /**
     * Metodo crearPersonaje que administra toda la generación de personajes
     * TODO El metodo tiene que ser capaz de recoger todas las características del personaje mediante preguntas y
     *  respuestas por pantalla y se debe controlar que los valores introducidos sean validos. Una vez recabados
     *  todos los datos del personaje generar un objeto con dichas características.
     * @param teclado
     * @return
     */
    public static Personaje crearPersonaje(Scanner teclado) {

    }

    /**
     * Método getNombre
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método getVida
     * @return int vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Método getAtaque
     * @return int ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Método getDefensa
     * @return int defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Método getDestreza
     * @return int destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * Método getItems
     * @return Item[] items
     */
    public Item[] getItems() {
        return items;
    }

    /**
     * Método getItem para devolver un Item según un índice dado
     * TODO devolver null si el índice no es válido, y el item si el índice es correcto
     * @param indice
     * @return
     */
    public Item getItem(int indice) {

            return
    }

    /**
     * Método recibirDanyo para actualizar la vida de un personaje
     * TODO Si el daño no es positivo, no hacer nada. En caso contrario reducir la vida según el daño pasado
     * @param danyo
     */
    public void recibirDanyo(int danyo) {

    }

    /**
     * Método anyadirItem para incluir un item en la mochila del personaje
     * TODO Comprobar si el item es valido y si el peso max del personaje no se supera para poder incluir el item,
     *  en caso negativo ddevolver false, en caso de que se pueda incluir, añadir el item a la lista de items del
     *  personaje y devolver true
     * @param item
     * @return
     */
    public boolean anyadirItem(Item item) {

            return
    }

    /**
     * Método sobreescrito para devolver la información de un personaje
     * TODO Método para devolver un String con la información del personaje en el formato
     *  descrito en la memoria de la práctica P.e: "{ Edgar (V: 20, A: 5, D: 2, X: 5) }"
     * @return
     */
    @Override
    public String toString() {
        return
    }

    /**
     * Método getPesoMochila para obtener el peso total que carga en la mochila el personaje
     * TODO recorrer la lista de items para obtener el peso total de todos y devolverlo
     * @return
     */
    public double getPesoMochila() {

        return
    }

    /**
     * Método getValorMochila para obtener el valor total que lleva entre todos los items el personaje
     * TODO recorrer la lista de items para obtener el valor total de todos y devolverlo
     * @return
     */
    public double getValorMochila() {

        return
    }

    /**
     * Método infoMochila para obtener en formato String la información de la mochila
     * TODO recorrer toda la lista de items del personaje para ir añadiendo la información de los items según el
     *  formato mostrado en la memoria. P.e. "Mochila de Edgar:
     *                                        Espada Mágica Peso: 1.5, Valor: 100
     *                                        Armadura de Gromril Peso: 4, Valor: 300
     *                                        Peso total: 5.5 Kg
     *                                        Tu mochila vale 400 monedas"
     * @return
     */
    public String infoMochila() {

        return
    }
}
