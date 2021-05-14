import kotlin.random.Random

class Ej1 constructor(size: Int, init: (Int) -> Int) {
    val array1 = Array<Int>(size,init)
}

class Ej3 {
    fun imprimirPares(arreglo: Array<Int>){
        val elementosFiltrados = arreglo.filter { it % 2 == 0 }
        println(elementosFiltrados)
    }
}

fun main(){
    val e1 = Ej1(10, {Random.nextInt(50,250)})
    val e3 = Ej3()
    e3.imprimirPares(e1.array1)
}