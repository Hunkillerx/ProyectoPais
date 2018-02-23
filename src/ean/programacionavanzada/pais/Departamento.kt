/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Departamento.java,v 1.0 2017/02/17 08:09 lacobo Exp $
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas - Facultad de Ingeniería
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Ejercicio: Pais
 * Autor: Luis Cobo - Ago 27, 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.pais

import com.sun.beans.editors.DoubleEditor
import com.sun.xml.internal.bind.v2.model.core.ID

/**
 * Representa la información que se guarda de un Departamento de Colombia
 */
class Departamento {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    private var nombre:String =""
    private var superficie:Double = 0.0
    private var IDH: Double = 0.0
    private var añoCreacion: Int = 0

    //-----------------------------------------------------------------
    // Constructores - Debe inicializar todos los atributos
    //-----------------------------------------------------------------
    constructor()

    constructor(nombre: String, superficie: Double, IDH: Double, añoCreacion: Int) {
        this.nombre = nombre
        this.superficie = superficie
        this.IDH = IDH
        this.añoCreacion = añoCreacion
    }
    //-----------------------------------------------------------------
    // Métodos - Solo analizadores
    //-----------------------------------------------------------------
    fun darNombre():String = nombre
    fun darSuperficie():Double = superficie
    fun darIDH():Double = IDH
    fun darAñoCreacion():Int = añoCreacion
}