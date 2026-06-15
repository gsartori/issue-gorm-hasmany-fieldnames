package issue

class TBook {

    String title

    Set<TAuthor> authors
    static hasMany = [
            authors: TAuthor
    ]

}