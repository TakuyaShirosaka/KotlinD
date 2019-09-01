package adapter.委譲の場合

object WTeacher {
    @JvmStatic
    fun main(args: Array<String>) {
        val chairperson = Hanako()
        chairperson.organizeClass()
    }
}