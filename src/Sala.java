import java.util.Scanner;

/**
 * Clase Sala
 */
public class Sala {
    private final String descripcion;
    private final Item[] items;
    private final Monstruo[] monstruos;
    private final Trampa[] trampas;

    private final int fila;
    private final int columna;

    /**
     * Constructor de clase para inicializar los atributos de clase
     * @param descripcion
     * @param max_items
     * @param max_monstruos
     * @param maxTrampasPorSala
     * @param fila
     * @param columna
     */
    public Sala(String descripcion, int max_items, int max_monstruos, int maxTrampasPorSala, int fila, int columna) {

    }

    /**
     * Método agregarItem para incluir items en la sala
     * TODO comprobar si existe el objeto en la sala o si la lista de items no está ya llena en caso afirmativo
     *  devolver false. En caso de no existir incluirlo en la lista y devolver true
     * @param item
     * @return
     */
    public boolean agregarItem(Item item) {

            return
    }

    /**
     * Método agregarMonstruo para incluir un monstruo en la sala
     * TODO comprobar si existe el monstruo en la sala o si la lista de monstruos no está ya llena en caso afirmativo
     *  devolver false. En caso de no existir incluirlo en la lista y devolver true
     * @param monstruo
     * @return
     */
    public boolean agregarMonstruo(Monstruo monstruo) {

            return
    }

    /**
     * Método agregarTrampa para incluir una trampa en la sala
     * TODO comprobar si existe la trampa en la sala o si la lista de trampas no está ya llena en caso afirmativo
     *  devolver false. En caso de no existir incluirlo en la lista y devolver true
     * @param trampa
     * @return
     */
    public boolean agregarTrampa(Trampa trampa) {

            return
    }

    /**
     * Método getDescripcion
     * @return String descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método hayMonstruos para comprobar si hay algún monstruo en la sala
     * TODO comprobar si hay algún monstruo en la lista
     * @return
     */
    public boolean hayMonstruos() {

        return
    }

    /**
     * Método seleccionarMonstruo para introducir desde pantalla el nombre de un monstruo
     * TODO Mostrar por pantalla todos los monstruos y luego solicitar que se introduzca el nombre del monstruo que se
     *  quiere seleccionar.
     * @param teclado
     * @return
     */
    public Monstruo seleccionarMonstruo(Scanner teclado) {

        return
    }

    /**
     * Método buscarMonstruo para buscar un monstruo dado el nombre del mismo
     * TODO devolver el monstruo según el nombre pasado como parámetro o devolver null si no se encuentra
     * @param nombreMonstruo
     * @return
     */
    public Monstruo buscarMonstruo(String nombreMonstruo) {

        return
    }

    /**
     * Método listarMonstruos para mostrar por pantalla la información de los monstruos
     * TODO mostrar por pantalla la info de los monstruos utilizando los métodos implementados en la clase "monstruo"
     */
    private void listarMonstruos() {

    }

    /**
     * Método eliminarMonstruo para eliminar un monstruo de la lista segun un nombre dado
     * TODO buscar en la lista el monstruo segun el nombre pasado como parámetro y eliminarlo.
     * @param nombreMonstruo
     */
    public void eliminarMonstruo(String nombreMonstruo) {

    }

    /**
     * Método hayTrampas para saber si la sala dispone de alguna trampa
     * TODO mostrar si existe alguna trampa en la sala, false en caso contrario
     * @return
     */
    public boolean hayTrampas() {

        return
    }

    /**
     * Método getFila
     * @return int fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * Método getColumna
     * @return int columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * Método hayItems para mostrar si existe algún item en la sala
     * TODO buscar si hay algún item en la lista de items, false en caso contrario
     * @return
     */
    public boolean hayItems() {

        return
    }

    /**
     * Método buscarItem para obtener un item según una descripcion dada
     * TODO buscar en la lista de items un item con la descripción pasada como parámetro, devolver null si no lo
     *  encuentra
     * @param descripcion
     * @return
     */
    public Item buscarItem(String descripcion) {

        return
    }

    /**
     * Método buscarTrampa para obtener una trampa según una descripcion dada
     * TODO buscar en la lista de trampas una trampa con la descripción pasada como parámetro, devolver null si no lo
     *  encuentra
     * @param descripcion
     * @return
     */
    public Trampa buscarTrampa(String descripcion) {

        return
    }

    /**
     * Método getTrampas
     * @return Trampa[] trampas
     */
    public Trampa[] getTrampas() {
        return trampas;
    }

    /**
     * Método seleccionarItem para obtener un item concreto con parámetro pasados por pantalla
     * TODO Mostrar por pantalla todos los items de la sala para despues pedir que se introduzca una descripcion del
     *  item que se quiere seleccionar
     * @param teclado
     * @return
     */
    public Item seleccionarItem(Scanner teclado) {

        return
    }

    /**
     * Método listarItems para mostrar por pantalla todos los items
     * TODO utilizar las funciones de la clase Item para poder mostrar por pantalla toda la información de todos los
     *  items que hay en la sala
     */
    private void listarItems() {

    }

    /**
     * Método eliminarItem para eliminar un item con la descripcion pasada como parámetro
     * TODO buscar el item que coincida con la descripción pasada por parámetro y eliminarlo de la lista de items
     * @param descripcion
     */
    public void eliminarItem(String descripcion) {

    }
}
