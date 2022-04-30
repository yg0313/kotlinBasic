package kotlinstudy.`class`

class Book (var title:String?=""){

    var author: String=""

    constructor(author:String, title:String): this(title){
        this.author = author
    }

}