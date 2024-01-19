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
        "��������",
        AlgType.AlgNum1,
        "����� ������",
        "1"
    )
}

fun getDefineAlgorithmSecondDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "16_���",
        AlgType.AlgNum3,
        "����� ������",
        "3"
    )
}

fun getDefineAlgorithmThirdDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "!�� ������� �������������",
        AlgType.AlgNum1,
        "����� ������",
        "1"
    )
}

fun getDefineAlgorithmFourDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "��������� ����",
        AlgType.AlgNum1,
        "����� ������",
        "1"
    )
}

fun getDefineAlgorithmFiveDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "��_���������",
        AlgType.AlgNum5,
        "����� ������",
        "5"
    )
}

fun getDefineAlgorithmSixDetails() : DetailsDefineAlgorithm {
    return DetailsDefineAlgorithm(
        "��������_109",
        AlgType.AlgNum3,
        "����� ������",
        "3"
    )
}