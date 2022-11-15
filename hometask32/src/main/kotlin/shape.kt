import kotlin.math.sqrt


abstract class shape(var side: Float) {
    abstract var perimetr: Float
    abstract var squareDegree: Float

    abstract fun conclusionperimeter()

    abstract fun conclusionsquare()
}


open class circle(var r: Float): shape(r){
    override var perimetr: Float = 2*r*3.14F

    override var squareDegree: Float = 3.14f*r*r

    override fun conclusionperimeter() {
        println("Периметр круга равен $perimetr")
    }

    override fun conclusionsquare() {
        println("Площадь круга равна $squareDegree")
    }
}

open class square (open var a: Float): circle(a){

    override var perimetr: Float = a*4

    override var squareDegree: Float = a*a

    override fun conclusionperimeter() {
        println("Периметр квадрата равен $perimetr")
    }

    override fun conclusionsquare() {
        println("Площадь квадрата равна $squareDegree")
    }
}

open class triangle(override var a: Float, var b: Float, var c:Float): square(a){

    override var perimetr: Float = a+b+c

    val p: Float = (a+b+c)
    override var squareDegree: Float = sqrt(p*(p-a)*(p-b)*(p-c))

    override fun conclusionperimeter() {
        println("Периметр треугольника равен $perimetr")
    }

    override fun conclusionsquare() {
        println("Площадь треугольника равна $squareDegree")
    }
}

