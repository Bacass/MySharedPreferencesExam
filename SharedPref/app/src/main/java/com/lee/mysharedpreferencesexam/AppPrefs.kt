package com.lee.mysharedpreferencesexam

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.gsonpref.gsonPref
import java.util.HashMap

object AppPrefs : KotprefModel() {
    var pushToken: String by stringPref()

    var userName: String by stringPref()
    var userNickname: String by stringPref()
    var userAge: Int by intPref(0)
    var money: Long by longPref(1L)
    var isMarried: Boolean by booleanPref(false)

    var userList: List<UserData> by gsonPref(listOf())
    var ageMap: HashMap<String, Int> by gsonPref(hashMapOf())
}