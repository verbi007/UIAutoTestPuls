package data

data class DetailsWarehouseLink(
      var filial: String? = null
    , var warehouse: String? = null
)

fun getWarehouseLinkFirstDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "Пульс Москва",
        "Склад комиссии"
    )
}

fun getWarehouseLinkSecondDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "Пульс Санкт-Петербург",
        "Склад маркированных товаров"
    )
}

fun getWarehouseLinkThirdDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "Пульс Санкт-Петербург",
        null
    )
}

fun getWarehouseLinkFourDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "Пульс Санкт-Петербург",
        "Основной склад"
    )
}

fun getWarehouseLinkFiveDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "Пульс Воронеж",
        "Склад комиссии"
    )
}