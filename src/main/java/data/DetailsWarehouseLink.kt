package data

data class DetailsWarehouseLink(
      var filial: String? = null
    , var warehouse: String? = null
)

fun getWarehouseLinkFirstDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "����� ������",
        "����� ��������"
    )
}

fun getWarehouseLinkSecondDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "����� �����-���������",
        "����� ������������� �������"
    )
}

fun getWarehouseLinkThirdDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "����� �����-���������",
        null
    )
}

fun getWarehouseLinkFourDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "����� �����-���������",
        "�������� �����"
    )
}

fun getWarehouseLinkFiveDetails() : DetailsWarehouseLink {
    return DetailsWarehouseLink(
        "����� �������",
        "����� ��������"
    )
}