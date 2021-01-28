fun main() {
    val clientes = listOf(
        Cliente(1, "Pedro", 'M'),
        Cliente(2, "Mateus", 'M'),
        Cliente(3, "Ana", 'F')
    )

    println("------")

    println(clientes.associateBy(keySelector = { it.id }, valueTransform = { it }))
    //{1=Cliente(id=1, nome=Pedro), 2=Cliente(id=2, nome=Mateus), 3=Cliente(id=3, nome=Ana)}

    println("------")

    println(clientes.filter { it.genero == 'M' })
    //[Cliente(id=1, nome=Pedro, genero=M), Cliente(id=2, nome=Mateus, genero=M)]

    println("------")

    println(clientes.partition { it.genero == 'M' })
    /*
    [Cliente(id=1, nome=Pedro, genero=M), Cliente(id=2, nome=Mateus, genero=M)]
    [Cliente(id=3, nome=Ana, genero=F)])
     */


    println("------")
    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list.any { it >= 6 }) //true
    println(list.none { it <= 0 }) //true
    println(list.all { it %2 == 0 }) //false1


    println("------")
    val list2 = listOf("um", "dois", "três")
    val list3 = listOf("A", "B", "C")
    val list4 = listOf("zero", "um", "dois")
    println(list2 + list3)  // [um, dois, três, A, B, C]
    println(list2 + "quatro") //[um, dois, três, quatro]
    println(list2 - list4) // [três]
    println(list4 - list2) // [zero]


    println("------")

    println(clientes.groupBy { it.genero })
    /*
    {M=[Cliente(id=1, nome=Pedro, genero=M), Cliente(id=2, nome=Mateus, genero=M)],
    F=[Cliente(id=3, nome=Ana, genero=F)]}

     */


    println("------")
    println(clientes.first()) //Cliente(id=1, nome=Pedro, genero=M)
    println(clientes.last())//Cliente(id=3, nome=Ana, genero=F)
    println(clientes.first{it.genero == 'F'}) //Cliente(id=3, nome=Ana, genero=F)
    println(clientes.last{it.genero == 'M'}) //Cliente(id=2, nome=Mateus, genero=M)

    println("------")
    val list5 = listOf(1, 2, 3)
    println(list5.elementAtOrNull(999)) //null
    println(list5.elementAtOrElse(999) { "numero fora da lista"}) //numero fora da lista


    println("------")
    val clientes2 = listOf(
        Cliente(1, "Pedro", 'M'),
        Cliente(3, "Ana", 'F'),
        Cliente(4, "Mateus", 'M'),
        Cliente(2, "Lucas", 'M'),
        Cliente(5, "Juliana", 'F')
    )
    println(clientes2.sortedBy { it.id })
    /*
    [Cliente(id=1, nome=Pedro, genero=M),
     Cliente(id=2, nome=Lucas, genero=M),
     Cliente(id=3, nome=Ana, genero=F),
     Cliente(id=4, nome=Mateus, genero=M),
     Cliente(id=5, nome=Juliana, genero=F)]
    */
    println(clientes2.sortedByDescending { it.id })
    /*
        [Cliente(id=5, nome=Juliana, genero=F),
        Cliente(id=4, nome=Mateus, genero=M),
        Cliente(id=3, nome=Ana, genero=F),
        Cliente(id=2, nome=Lucas, genero=M),
        Cliente(id=1, nome=Pedro, genero=M)]
     */


    println("------")
    val list6 = listOf(1, 2, 3, 4)
    println(list6.reduce{  x,y -> x+y }) //10

    println("------")
    val list7 = listOf("A", "B", "C", "D", "E")
    println(list7.binarySearch("D")) // 3
    println(list7.binarySearch("d", String.CASE_INSENSITIVE_ORDER)) // 3



    println("------")
    val list8 = listOf(1, 2, 3, 4)
    println(list8.map { it*2 }) // [2, 4, 6, 8]


    println("------EXEMPLO EXTRA ------")
    println(clientes.map { "Nome: ${it.nome}" }.reduce{x,y->"$x\n$y"})

}
