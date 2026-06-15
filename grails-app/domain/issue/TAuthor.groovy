package issue

class TAuthor {

    String name

    Set<TBook> books
    static hasMany = [
            books: TBook
    ]
}