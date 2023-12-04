fun main() {
    val cadenaCalibrada = listOf(
        "1abc2",
        "pqr3stu8vwx",
        "a1b2c3d4e5f",
        "treb7uchet"
    )

    val sumaDeValores = calcularCalibracionDeValores(cadenaCalibrada)
    println("La suma de todos los valores es: $sumaDeValores")
}

fun calcularCalibracionDeValores(cadenaCalibrada: List<String>): Int {
    var suma = 0

    for (linea in cadenaCalibrada) {
        val primerDigito = linea.first().toString().toIntOrNull()
        val ultimoDigito = linea.last().toString().toIntOrNull()

        if (primerDigito != null && ultimoDigito != null) {
            val calibrationValue = primerDigito * 10 + ultimoDigito
            suma += calibrationValue
        }
    }

    return suma
}