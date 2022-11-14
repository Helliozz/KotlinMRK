fun main() {
    val tom = worker("Tom")
    val kate=worker ("kate", 12)
    val steeve=worker("Steeve", "dps", 20)
    val poul=worker("Paul", "idk", 20020)

    tom.status()
    kate.status()
    steeve.status()

    tom.placeofwork("howhere")
    kate.placeofwork("home")
    steeve.placeofwork("office")

    println("\n")

    val jobs=designer("Jobs", 12)
    val alex=designer("Alex",2000)
    jobs.status()
    alex.status()

    alex.placeofwork("home")
    jobs.placeofwork("google")
}