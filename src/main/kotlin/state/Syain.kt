package state

abstract class Syain {
    fun routin() {
        setUp()
        rideTrain()
        work()
    }

    protected abstract fun setUp()
    protected abstract fun rideTrain()
    protected abstract fun work()
}

