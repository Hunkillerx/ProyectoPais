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
        val d = pais.obtenerDepartamento("Arauca")

        // Poblacion de Antioquia
        val dd = pais.poblacionDep("Antioquia")
        assertEquals(6600681,dd)

        // TODO: Compruebe que la poblacion total de Antioquia es de 6600681

        // Departamentos creados en la decada de los sesentas
        // TODO: Compruebe que hay 6 departamentos creados en la decada de los 10.
        val ddd = pais.numDepartamentos10()
        assertEquals(6,ddd)

        // TODO: Después de obtener el departamento más grande, compruebe que el nombre es "Amazonas"
        // y que la superficie de ese departamento es 109665
        val d4 = pais.darDptoMasGrande()
        assertEquals("Amazonas",d4.darNombre())
        // Densidad del departamento del Quindío
        var densidad = 0.0
        // TODO: Obtener aquí la densidad del departamento de Quindío
        // Y comprueba que su densidad es 309.1506 de la siguiente manera
        // assertEquals(309.1506, densidad, 0.0001)
        val dddd = pais.densidadPobl("Quindio")
        assertEquals(309.1506,dddd)

    }
}