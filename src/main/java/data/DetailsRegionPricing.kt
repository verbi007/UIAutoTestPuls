package data

data class DetailsRegionPricing (
      var filial: String? = null
    , var priceList: String? = null
    , var region: String? = null
    , var subdivision: String? = null
    , var isMarkUpControl: Boolean? = null
    , var isFederalLaw223: Boolean? = null
    , var isLastHandRule: Boolean? = null
    , var priceGroup: String? = null
    , var userName: String? = null
)

fun getPricingRegionFirstDetails() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Москва",
        "Опт5",
        "Тульская область",
        "ОБП",
        true,
        true,
        true,
        "autotest_ui",
        "Test User"
    )
}

fun getPricingRegionSecondDetails() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Москва",
        "Опт_Мск",
        "Тульская область",
        "ОБП",
        null,
        null,
        null,
        "autotest_ui",
        "Test User"
    )
}

fun  getPricingRegionDuplicate() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Хабаровск",
        "Тестовый",
        "Приморский край 1 зона",
        "СМП",
        true,
        true,
        true,
        "autotest_ui",
        "Test User"
    )
}

fun getPricingRegionFirstChange() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Москва",
        "!Не использ РП Тула",
        "Тульская область",
        "Логистика",
        true,
        true,
        true,
        "autotest_ui",
        "Per Test"
    )
}

fun getPricingRegionSecondChange() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Москва",
        "!Не использ РП Рязань",
        "Рязанская область",
        "Администрация",
        true,
        true,
        true,
        "autotest_2",
        "Test User"
    )
}

fun getPricingRegionFilterPriceList() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Волгоград",
        "09_77_И_Сова",
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )
}

fun getPricingRegionFilterRegion() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Волгоград",
        "09_77_И_Сова",
        "Саратовская область",
        null,
        null,
        null,
        null,
        null,
        null
    )
}

fun getPricingRegionFilterPriceGroup() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Волгоград",
        "09_77_И_Сова",
        null,
        null,
        null,
        null,
        null,
        "autotest_ui",
        null
    )
}

fun getPricingRegionFilterUserName() : DetailsRegionPricing {
    return DetailsRegionPricing(
        "Пульс Волгоград",
        "09_77_И_Сова",
        null,
        null,
        null,
        null,
        null,
        null,
        "Клюева Мария"
    )
}