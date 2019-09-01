package state

class Suzuki(procces: Procces) : Syain() {
    private val procces = procces

    override fun setUp() {
        println("SetUpしました。")
    }

    override fun rideTrain() {
        println("電車に乗りました。")
    }

    override fun work() {
        println("工程ごとの仕事をします。")
        this.procces.work()
    }
}

