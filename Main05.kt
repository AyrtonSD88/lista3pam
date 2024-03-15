package collections

fun main(args: Array<String>) {
    val ListaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    for(item in ListaMix){
        if(item is String){
            println(item.toUpperCase())
        }else{
            println(item)
        }
    }
}