fun main() {
    /**
     * Función principal donde se ejecuta el programa.
     */
    val listaDeCadenas = listOf(
        "1abc2",
        "pqr3stu8vwx",
        "a1b2c3d4e5f",
        "treb7uchet"
    )

    val sumaDeValores = calcularCalibracionDeValores(listaDeCadenas)
    println("La suma de todos los valores es: $sumaDeValores")
}

fun calcularCalibracionDeValores(listaDeCadenas: List<String>): Int {
    /**
     * Calcula la calibración de valores a partir de una lista de cadenas.
     *
     * @param listaDeCadenas Lista de cadenas que contienen valores de calibración.
     * @return La suma de todos los valores de calibración.
     */
    // var sumaTotal = 0

    val listaDigitos = mutableListOf<Int>()
    for (linea in listaDeCadenas) {
        var numerosLinea = ""
        for (caracter in linea) {
            if (caracter.isDigit()) {
                numerosLinea += caracter
            }
        }
        var primerDigito = numerosLinea.first()
        var segundoDigito = numerosLinea.last()
        val digitoCreado = "$primerDigito$segundoDigito".toInt()
        listaDigitos.add(digitoCreado)
    }

    return listaDigitos.sum()
}