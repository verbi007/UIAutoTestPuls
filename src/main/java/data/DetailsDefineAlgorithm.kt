package data

import enumType.AlgType

data class DetailsDefineAlgorithm(
      var priceList: String? = null
    , var algType : AlgType? = null
    , var filial : String? = null
    , var weight: String? = null
)

fun getDefineAlgorithmFirstDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "Тестовый",
        AlgType.AlgNum1,
        "Пульс Москва",
        "1"
    )
}

fun getDefineAlgorithmSecondDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "16_ОАП",
        AlgType.AlgNum3,
        "Пульс Москва",
        "3"
    )
}

fun getDefineAlgorithmThirdDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "!Не использ ОптПредоплата",
        AlgType.AlgNum1,
        "Пульс Москва",
        "1"
    )
}

fun getDefineAlgorithmFourDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "Татарстан Алоэ",
        AlgType.AlgNum1,
        "Пульс Казань",
        "1"
    )
}

fun getDefineAlgorithmFiveDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "МС_Татарстан",
        AlgType.AlgNum5,
        "Пульс Казань",
        "5"
    )
}

fun getDefineAlgorithmSixDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "Аптечный_109",
        AlgType.AlgNum3,
        "Пульс Москва",
        "3"
    )
}