//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println (word("Megan"))
    println(upp("Rose"))
    println(low("Julius"))
    println(first("Gregor"))
    println(last("Creelo"))
}
fun word(name:String):Int{
    return name.length
}
fun upp(word:String):String{
    return word.uppercase()
}
fun low(you:String):String{
    return you.lowercase()
}
fun first(give:String):Char{
    var agi= give[0]
    return agi
}
fun last(rach:String):Char{
    var shal= rach[0]
    return shal
}