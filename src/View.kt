class View {
    var CornField: CornField = CornField()
    var Culture: Culture = Culture()

    fun show(){
        println("У вас есть поле размером ${CornField.area} с культурой ${CornField.currentCulture.name}")
    }
    fun selectCulture(Culture: Culture){
            println("Вы выбрали ${CornField.currentCulture.name}")
    }

    fun sell(x: Int): Float{
        return x * CornField.area

    }
    
}
