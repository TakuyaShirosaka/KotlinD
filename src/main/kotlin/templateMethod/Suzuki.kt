package templateMethod

class Suzuki : Syain() {
    /*
        サブクラスではメソッドのふるまいだけを記述する
     */
    override fun setUp() {
        println("SetUpしました。")
    }

    override fun rideTrain() {
        println("電車に乗りました。")
    }

    override fun work() {
        println("SetUpしました。")
    }
}

