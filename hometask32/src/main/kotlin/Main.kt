fun main(args: Array<String>) {
    val cir=circle(10F)
    val tri=triangle(1F, 10F, 0.5F)
    val sq=square(2F)

    println("\n${cir.perimetr} ${cir.squareDegree}")
    cir.conclusionperimeter()
    cir.conclusionsquare()

    println("\n${tri.perimetr} ${tri.squareDegree}")
    tri.conclusionperimeter()
    tri.conclusionsquare()

    println("\n${sq.perimetr} ${sq.squareDegree}")
    sq.conclusionperimeter()
    sq.conclusionsquare()
}