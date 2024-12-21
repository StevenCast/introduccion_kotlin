import java.util.Scanner
import kotlin.math.pow

fun main() {
    val menu = "A continuación eliga la opción a realizar\n 1. Area Cuadrado\n 2. Area Circulo\n 3. Area Triángulo\n 4. Salir\n"
    print(menu)

    val scan = Scanner(System.`in`)
    var opcion = scan.nextLine().trim()


    while (true || opcion == "4"){
        when(opcion){
            "1"->{
                print("Ingrese el lado de su cuadrado: ")
                var valor = scan.nextLine().trim().toDouble()
                var resultado = areaCuadrado(valor)
                println("El area del cuadrado con el valor $valor es: $resultado")
            }
            "2"->{
                print("Ingrese el radio del circulo: ")
                var radio = scan.nextLine().trim().toDouble()
                var resultado = areaCirculo(radio)
                println("El area del circulo con el valor $radio es: $resultado")
            }
            "3"->{
                print("Ingrese la base : ")
                var base = scan.nextLine().trim().toDouble()
                print("Ingrese la altura : ")
                var altura = scan.nextLine().trim().toDouble()
                var resultado = areaTriangulo(base, altura)
                println("El area del triangulo con base $base y altura $altura es: $resultado")
            }
            "4"->{
                println("Usted salio del programa")
                break
            }
            else->{
                println("Ingrese una opción correcta")
            }
        }
        print(menu)
        opcion = scan.nextLine().trim()

    }
}

fun areaCuadrado(lado: Double):Double{
    return lado*lado
}

fun areaCirculo(radio: Double):Double{
    val pi = 3.141516
    return pi*(radio.pow(2))
}
fun areaTriangulo(base: Double, altura: Double):Double{
    return (base*altura)/2
}