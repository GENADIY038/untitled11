class View {
    var CornField: CornField = CornField()

    fun show(){
        println("У вас есть поле размером ${CornField.area} с культурой ${CornField.currentCulture.name}")
    }

    fun selectCulture(){

    }
}