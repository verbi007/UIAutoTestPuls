package data

import readProperties.ConfigProvider

data class User(
      var name: String? = null
    , var login: String? = null
    , var password: String? = null
    , var username: String? = null
)

fun getUser() : User {
    return User(
        "Test Per",
        ConfigProvider.LOGIN,
        ConfigProvider.PASSWORD,
        ConfigProvider.USERNAME
    )
}
