fun main(){
    var culture1 = Culture()
    culture1.name = "Oleg"
    var culture2 = Culture()
    culture1.name = "Seva"

    var view  = View()
    view.show()
    println("Выберете культуру")
    println("1: ${culture1.name}")
    println("2: ${culture2.name}")

    var userchoice = readLine()

    when(userchoice){
        "1" -> {view.selectCulture(culture1)}
        "2" -> {view.selectCulture(culture2)}
    }
    println("Зa сколько продадим культуру")
    println("Прибыль составила ${view.sell(readLine()!!.toInt())}")
}