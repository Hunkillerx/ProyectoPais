/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Municipio.java,v 1.0 2017/02/17 08:09 lacobo Exp $
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas - Facultad de Ingeniería
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Ejercicio: Pais
 * Autor: Luis Cobo - Ago 27, 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.pais

/**
 * Representa la información que tenemos de un Municipio del país
 */
class Municipio {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    private var codigo: Int = 0
    private var nombre: String = ""
    private var poblacionUrbana: Int = 0
    private var poblacionRural:Int = 0
    private var departamento: String = ""
    private var esCapital:Boolean = false

    //-----------------------------------------------------------------
    // Constructor - Debe inicializar todos los atributos
    //-----------------------------------------------------------------

    constructor()

    constructor(codigo: Int, nombre: String, poblacionUrbana: Int, poblacionRural: Int, departamento: String, esCapital: Boolean) {
        this.codigo = codigo
        this.nombre = nombre
        this.poblacionUrbana = poblacionUrbana
        this.poblacionRural = poblacionRural
        this.departamento = departamento
        this.esCapital = esCapital
    }
    //-----------------------------------------------------------------
    // Métodos (solo analizadores)
    //-----------------------------------------------------------------
    val elCodigo
        get() = codigo
    fun darNombre() = nombre
    fun darPoblacionUrbana() = poblacionUrbana
    fun darPoblacionRural() = poblacionRural
    val poblacionTotal
        get() = poblacionUrbana + poblacionRural
    val noTienePoblacionRural
        get() = poblacionRural == 0
    fun darDepartamento() = departamento
    fun darEsCapital() = esCapital

}