package adapter.委譲の場合

class Hanako : Chairperson {
    private val taro: Taro

    init {
        taro = Taro()
    }

    override fun organizeClass() {
        taro.enjoyWithAllClassmate()
    }
}