package data

data class DetailsGeoRegions(
      var priceList: String? = null
    , var region: String? = null
)

fun getGeoRegionCodeFirstDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "��������",
        "����������� ����"
    )
}

fun getGeoRegionCodeSecondDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "12_68_�_�����",
        null
    )
}

fun getGeoRegionCodeThirdDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        null,
        "������ ����"
    )
}

fun getGeoRegionCodeFourDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "��_�����",
        "������������� ����"
    )
}

fun getGeoRegionCodeFiveDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        null,
        "��������� ����"
    )
}

fun getGeoRegionCodeSixDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "��������� ����",
        "��������� ����"
    )
}

fun getGeoRegionCodeSevenDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "16_���",
        "������ �"
    )
}
