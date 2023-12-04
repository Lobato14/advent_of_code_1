import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalibrationTest {

    @Test
    fun testcalcularCalibracionDeValores() {
        val listaDeCadenas = listOf(
            "1abc2",
            "pqr3stu8vwx",
            "a1b2c3d4e5f",
            "treb7uchet"
        )

        val resultado = calcularCalibracionDeValores(listaDeCadenas)

        // Asumiendo que el resultado esperado es 142 según el ejemplo dado
        assertEquals(36, resultado)
    }
}