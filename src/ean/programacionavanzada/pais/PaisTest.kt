/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PaísTest.java,v 1.0 2017/02/17 08:09 lacobo Exp $
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas - Facultad de Ingeniería
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Ejercicio: Pais
 * Autor: Luis Cobo - Ago 27, 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.pais

import ean.programacionavanzada.pais.Utils.obtenerDepartamentos
import ean.programacionavanzada.pais.Utils.obtenerMunicipios
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class PaisTest {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    private val pais: Pais = Pais()

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
    @Test
    fun test1() {
        obtenerDepartamentos(pais)
        obtenerMunicipios(pais)
        val n = pais.numDepartamentos()

        assertEquals(33, n, "El numero de deptos esta mal!")
    }

    @Test
    fun test3() {
        obtenerDepartamentos(pais)
        obtenerMunicipios(pais)
        val n = pais.municipioDepto("Amazonas")

        assertEquals(11, n)
    }

    @Test
    fun test2() {
        val n = pais.numMunicipios()

        assertEquals(1122, n, "El numero de municipios esta mal!")
    }

    @Test
    fun test4() {
        obtenerDepartamentos(pais)
        obtenerMunicipios(pais)
        val capital = pais.obtenerCapitalDepartamento("Vichada")
        assertEquals("Puerto Carreño", capital)

        // TODO: Imprima aquí el nombre, IDH, superficie y año de creación del departamento Arauca
        // Compruebe que la superficie del departamento es 23818 y el año de creación fue 1911
        val prueba1 = pais.obtenerDepartamento("Arauca")
        assertEquals(1911,prueba1?.darAñoCreacion())
        assertEquals(23818.0,prueba1?.darSuperficie())

        // Poblacion de Antioquia
        val prueba2 = pais.poblacionDep("Antioquia")
        assertEquals(6600681, prueba2)
        // TODO: Compruebe que la poblacion total de Antioquia es de 6600681

        // Departamentos creados en la decada de los sesentas
        // TODO: Compruebe que hay 6 departamentos creados en la decada de los 10.
        val prueba3 = pais.numDepartamentos10()
        assertEquals(6, prueba3)

        // TODO: Después de obtener el departamento más grande, compruebe que el nombre es "Amazonas"
        // y que la superficie de ese departamento es 109665
        val prueba4 = pais.darDptoMasGrande()
        assertEquals("Amazonas", prueba4.darNombre())


        // Densidad del departamento del Quindío
        // Y comprueba que su densidad es 309.1506 de la siguiente manera
        // assertEquals(309.1506, densidad, 0.0001)
        val prueba5 = pais.densidadPobl("Quindío")
        assertEquals(309.1506, prueba5, 0.0001)

        //Comprobar cuantos municpios no tienen poblacion urbana
        val prueba6 = pais.munNoPoblUrbana()
        assertEquals(0, prueba6)
    }
}