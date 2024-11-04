fun menu(){
    println("1. Jugar")
    println("2. Ver traza del último intento")
    println("3. Salir")
    println("Opción:")
}

fun main(){
    menu()
    var opcion = readln().toInt()

    while(opcion!=3){
        if(opcion<1 || opcion>3){
            println("ERROR: INTRODUCE UNA OPCIÓN VÁLIDA")
            menu()
        }

        if(opcion==1){
            println("Teclea un número de 4 cifras sin números repetidos:")
            val numero = readln()
        }

        opcion = readln().toInt()
    }

    if(opcion==3){
        println("¡Gracias por jugar!")
    }
}