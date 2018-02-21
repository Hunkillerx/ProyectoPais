/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Pais.java,v 1.0 2017/02/17 08:09 lacobo Exp $
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas - Facultad de Ingeniería
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Ejercicio: Pais
 * Autor: Luis Cobo - Ago 27, 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.pais
import ean.collections.*
class Pais {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    private var departamentos = emptyList<Departamento>()
    private var municipios = emptyList<Municipio>()

    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    constructor()

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Crea un nuevo departamento a partir de los datos de entrada y lo agrega a la lista de departamentos del pais
     * @param nombre
     * @param superficie
     * @param IDH
     * @param añoCreación
     */
    fun agregarDepartamento(nombre: String, superficie: Double, IDH: Double, añoCreación: Int) {
        val d = Departamento(nombre,superficie,IDH,añoCreación)
        departamentos.add(d)
    }

    /**
     * Permite saber el número de departamentos que posee el país.
     * @return el tamaño de la lista de departamentos
     */
    fun numDepartamentos(): Int {
        return departamentos.size
    }

    /**
     * Crea un objeto municipio con los datos de entrada especificados y lo agrega al final de la lista de departamentos
     * @param código
     * @param nombre
     * @param departamento
     * @param poblaciónUrbana
     * @param poblaciónRural
     * @param esCapital
     */
    fun agregarMunicipio(código: Int, nombre: String, departamento: String, poblaciónUrbana: Int, poblaciónRural: Int, esCapital: Boolean) {
        val m = Municipio(código,nombre,poblaciónRural,poblaciónUrbana,departamento,esCapital)
        municipios.add(m)
    }

    /**
     * Obtiene el número de municipios que hay en la lista
     * @return el tamaño de la lista de municipios
     */
    fun numMunicipios(): Int {
        TODO("Completar!")
    }

    /** Peremite obtener el número de municipios que hacen parte del departamento que
     * tiene el nombre dado.
     * @param nomDepto el departamento a buscar
     * @return el número de municipios de ese departamento
     */
    fun municipioDepto(nomDepto: String): Int {
        var c = 0
        for(mun in municipios){
            if(mun.darDepartamento() == nomDepto)
                ++c
        }
        return c
    }

    /**
     * Dado un departamento, retorna el nombre del municipio de ese departamento que es la capital
     * @param nomDepto el departamento a buscar
     * @return el nombre del municipio, o la cadena vacía "" si no hay capital para ese departamento
     */
    fun obtenerCapitalDepartamento(nomDepto: String): String {
        for (mun in municipios){
            if(mun.darDepartamento() == nomDepto && mun.darEsCapital()){
                return mun.darNombre()
            }
        }//No poner else ya que detengo la busqueda en el primer espacio
        return ""
    }

    /**
     * Obtener el municipio que tiene un nombre dado
     * @return el objeto departamento que tiene el  nombre dado, o null si no existe un depto
     */
    fun obtenerDepartamento(nombreDepto: String): Departamento? {//Se pone signo de interrogacion indicando que puede retorna null
        for (dep in departamentos){
            if(dep.darNombre() == nombreDepto){
                return dep
            }
        }
        return null
    }

    /**
     * Obtener el departamento más grande del país, el de mayor superficie. Debe obtener todo el
     * departamento.
     * @return un objeto de la clase departamento
     */
    fun darDptoMasGrande():Departamento{
        var mayor = departamentos.first
        var supMayor = mayor.darSuperficie()
        for (depto in departamentos){
            if(depto.darSuperficie() > supMayor){
                mayor = depto
                supMayor = mayor.darSuperficie()
            }
        }
        return mayor
    }
    /**
     * Obtener la población total de un departamento dado. Suma las poblaciones rurales y urbanas
     * de todos los municipios que tiene ese departamento
     * @return la suma de las poblaciones
     */
    fun poblacionDep(nombreDepto: String):Int{
        var valPoblacion = 0
        for (mun in municipios){
            if (mun.darDepartamento() == nombreDepto){
                    valPoblacion= (mun.darPoblacionRural() + mun.darPoblacionUrbana()) + valPoblacion
                }
            }
        return valPoblacion
        }
    /**
     * Obtener el número de departamentos creados en la decada de los 10 del siglo pasado
     * @return la cantidad de departamentos
     */
    fun numDepartamentos10():Int{
        var numDeps = 0
        for(d in departamentos){
            if ( d.darAñoCreacion() >=1910 && d.darAñoCreacion() <= 1919){
                numDeps++
            }
        }
        return numDeps
    }
    // TODO

    /**
     * Obtiene la densidad poblacional de un departamento. La densidad es la división entre la
     * población total de ese departamento y la superficie de ese departamento.
     * @param nombreDepto el nombre del departamento
     * @return la densidad = total_pobl / superficie
     */
    fun densidadPobl(nombreDepto: String):Double{
        var denPobl = 0.0
        for (dep in departamentos){
            if (dep.darNombre() == nombreDepto){
                var x = poblacionDep(nombreDepto)
                var y = dep.darSuperficie()
                denPobl = x/y
            }
        }
        return denPobl
    }
    // TODO
    /**
     * Sol los elementos protegidos pueden ser usado por los hijos
     */
    /**
     * Cuántos municipios tienen no tienen población urbana
     */

    // TODO
}

