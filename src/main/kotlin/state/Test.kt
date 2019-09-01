package state

fun main(args: Array<String>) {
    val employees = ArrayList<Syain>()
    employees.add(Suzuki(DesignProcces()))
    CompanyA(employees).instruct()
}

open class Company
class CompanyA(employees: List<Syain>) : Company() {
    private val employees = employees
    fun instruct() {
        this.employees.forEach {
            it.routin()
        }
    }
}