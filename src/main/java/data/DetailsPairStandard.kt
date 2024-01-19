package data

import java.text.SimpleDateFormat
import java.util.*

data class DetailsPairStandard(
      var filial: String? = null
    , var client: String? = null
    , var distrib: String? = null
    , var region: String? = null
    , var source: String? = null
    , var begDate: String? = null
    , var endDate: String? = null
)

fun currentDate(): String {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    return dateFormat.format(Date(System.currentTimeMillis()))
}

fun getPairStandardFirstDetails(): DetailsPairStandard {
    return DetailsPairStandard(
        "Пульс Москва",
        "Семейный доктор ООО Люберцы",
        "Фармкомплект",
        "Москва",
        "ЦК_КроссМаркет",
        currentDate(),
        "2100-01-01"
    )
}


fun getPairStandardNewDetails(): DetailsPairStandard {
    return DetailsPairStandard(
        "Пульс Волгоград",
        "Хохлова А.И. ИП Волгодонск (ЭДО)",
        "Арал",
        "Ростовская обл",
        "Прайс_Протек",
        currentDate(),
        "2100-01-01"

    )
}

fun getPairStandardChangeDetails(): DetailsPairStandard {
    return DetailsPairStandard(
        "Пульс Волгоград",
        "РИГЛА (ЭДО)",
        "АльянсХелскеа",
        "Волгоградская обл",
        "Прайс_Катрен",
        currentDate(),
        "2099-01-01"
    )
}