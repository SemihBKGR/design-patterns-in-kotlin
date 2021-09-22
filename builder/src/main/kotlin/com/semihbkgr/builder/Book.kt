package com.semihbkgr.builder

class Book private constructor(
    val isbn: String,
    val title: String?,
    val author: String?,
    val page: Int
) {

    override fun toString(): String = "Book(isbn=$isbn, title=$title, author=$author, page=$page)"

    data class Builder(
        val isbn: String,
        var title: String? = null,
        var author: String? = null,
        var page: Int = 0
    ) {
        fun title(title: String) = apply { this.title = title }
        fun author(author: String) = apply { this.author = author }
        fun page(page: Int) = apply { this.page = page }
        fun build() = Book(isbn, title, author, page)
    }

}