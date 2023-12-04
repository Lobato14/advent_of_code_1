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
    var suma = 0

    for (linea in listaDeCadenas) {
        val primerDigito = linea.first().toString().toIntOrNull()
        val ultimoDigito = linea.last().toString().toIntOrNull()

        if (primerDigito != null && ultimoDigito != null) {
            suma += primerDigito + ultimoDigito
        }
    }

    return suma
}