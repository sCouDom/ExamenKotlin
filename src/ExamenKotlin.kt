class Ej1 constructor(size: Int) {
    val array1 = Array<Int>(size,{it*6})
}

fun main(){
    val e1 = Ej1(10)
    e1.array1.forEach { println(it) } //Vemos que el array tiene tamaño 10, como se le dice e imprime la tabla del 6
}