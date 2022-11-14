open class worker (open var name: String="undefined", age: Int = 0) {

    open var age: Int=0
        set(value){
            if((value>0) and (value <110))
                field = value
        }
        get()=field
    init{
        this.age=age
    }

   open var post: String = "unemployed"
    constructor( name: String, post: String, age:Int): this(name, age){
        this.post=post
    }

    open fun status(){
        println("employee: $name\nposition:$post\nage: $age")
    }
    open fun placeofwork(place: String){
        println("Employee $name works at $place")
    }
}

class designer(name:String="undefined", age:Int =0) : worker(name,age){
    override fun status() {
        println("employee: $name\nposition: designer\nage: $age")

    }

    override fun placeofwork(place: String) {
        println("Designer works at $place")

    }
}