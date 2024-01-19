package data

data class DetailsGeoRegions(
      var priceList: String? = null
    , var region: String? = null
)

fun getGeoRegionCodeFirstDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "Тестовый",
        "Хабаровский край"
    )
}

fun getGeoRegionCodeSecondDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "12_68_И_Веста",
        null
    )
}

fun getGeoRegionCodeThirdDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        null,
        "Адыгея респ"
    )
}

fun getGeoRegionCodeFourDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "Як_Вилюй",
        "Краснодарский край"
    )
}

fun getGeoRegionCodeFiveDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        null,
        "Еврейская Аобл"
    )
}

fun getGeoRegionCodeSixDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "Татарстан Алоэ",
        "Татарстан респ"
    )
}

fun getGeoRegionCodeSevenDetails() : DetailsGeoRegions {
    return DetailsGeoRegions(
        "16_ОАП",
        "Москва г"
    )
}
