package state

class DesignProcces : Procces {
    override fun work() {
        println("設計の仕事をする")
    }
}

class ProgramProcces : Procces {
    override fun work() {
        println("プログラムの仕事をする")
    }
}

class TestProcces : Procces {
    override fun work() {
        println("テストの仕事をする")
    }
}