import kotlin.random.Random

class Ej1 constructor(size: Int, init: (Int) -> Int) {
    val array1 = Array<Int>(size,init)
}

fun main(){
    val e1 = Ej1(10, {Random.nextInt(50,250)})
    e1.array1.forEach { println(it) } //Vemos que el array tiene tamaño 10, como se le dice e imprime la tabla del 6
}