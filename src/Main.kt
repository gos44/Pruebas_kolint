
fun main(){
    val numeros = listOf(-1,-2,-3,-4,1,2,3,4,5,6,7,8,9,10)
   // 1. Define una función llamada `suma_numeros_positivos` que reciba una lista de números y devuelva la suma de los números positivos.
    // Utiliza "continue" dentro de la función para ignorar los números negativos durante la suma.
    val  resultado = suma_numeros_positivos(numeros)
    println("la suma de los numeros es positivos es :$resultado")
    val  resultadonegativo = suma_numeros_negativos(numeros)
    println("la suma de los numeros es negativos es :$resultadonegativo")

    //  2. Crea una función llamada `buscar_elemento` que reciba una lista y un elemento a buscar.
    //  Esta función debería devolver True si el elemento está en la lista y False si no lo está.
    //  Utiliza "break" para detener la búsqueda una vez que se encuentre el elemento.

    val lista = listOf(1, 2, 3, 4, 5)
    val elemento = 7
    val resultadoElemento = buscar_elemento(lista, elemento)
    println("¿El elemento $elemento está en la lista? $resultadoElemento")

    //3. Escribe una función llamada `eliminar_vocales` que tome una cadena de texto como argumento y devuelva la misma cadena pero sin ninguna vocal.
    // Utiliza "continue" dentro de la función para evitar agregar las vocales a la cadena resultante.

    val texto = "Hola, ¿como estás?"
    val resultadotext = eliminar_vocales(texto)
    println("Texto sin vocales: $resultadotext")


    val myString = "abc"
    try {
        val myInt = myString.toInt()
    } catch (e: NumberFormatException) {
        println("La cadena no contiene solo números")
    }
}

fun suma_numeros_positivos(lista: List<Int>): Int {
    var suma = 0
    for (numero in lista) {
        if (numero < 0) {
            continue
        }
        suma += numero
    }
    return suma
}
fun suma_numeros_negativos(lista: List<Int>): Int {
    var SumaNegativa = 0
    for (numero in lista) {
        if (numero > 0) {
            continue
        }
        SumaNegativa += numero
    }
    return SumaNegativa
}

fun buscar_elemento(lista: List<Int>, elemento: Int): Boolean {
    for (item in lista) {
        if (item == elemento) {
            return true
        }
    }
    return false
}

fun eliminar_vocales(cadena: String): String {
    val vocales = "aeiouAEIOU"
    var resultado = StringBuilder()

    for (caracter in cadena) {
        if (caracter in vocales) {
            continue
        }
        resultado.append(caracter)
    }

    return resultado.toString()

}

