import kotlin.math.PI
import kotlin.math.pow

fun main() {
    while (true) {
        println("========== MENÚ ==========")
        println("1. Calcular área de un cuadrado")
        println("2. Calcular área de un círculo")
        println("3. Calcular área de un triángulo")
        println("4. Salir")
        print("Elige una opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Ingresa la longitud del lado del cuadrado: ")
                val lado = readLine()?.toDoubleOrNull()
                if (lado != null) {
                    val area = lado.pow(2)
                    println("El área del cuadrado es: $area")
                } else {
                    println("Entrada no válida.")
                }
            }

            2 -> {
                print("Ingresa el radio del círculo: ")
                val radio = readLine()?.toDoubleOrNull()
                if (radio != null) {
                    val area = PI * radio.pow(2)
                    println("El área del círculo es: $area")
                } else {
                    println("Entrada no válida.")
                }
            }

            3 -> {
                print("Ingresa la base del triángulo: ")
                val base = readLine()?.toDoubleOrNull()
                print("Ingresa la altura del triángulo: ")
                val altura = readLine()?.toDoubleOrNull()
                if (base != null && altura != null) {
                    val area = (base * altura) / 2
                    println("El área del triángulo es: $area")
                } else {
                    println("Entrada no válida.")
                }
            }

            4 -> {
                println("¡Gracias por usar el programa! Adiós.")
                break
            }

            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
        println()
    }
}
