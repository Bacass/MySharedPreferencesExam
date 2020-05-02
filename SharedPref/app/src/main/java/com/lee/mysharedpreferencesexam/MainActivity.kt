package com.lee.mysharedpreferencesexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefTest()
        prefPrint()
    }

    private fun prefTest() {
        AppPrefs.pushToken = "ask1291kd892md9_ai8sm"
        AppPrefs.userName = "이지은"
        AppPrefs.userNickname = "아이유"
        AppPrefs.userAge = 30
        AppPrefs.money = 65200000
        AppPrefs.isMarried = false

        AppPrefs.userList = listOf(
            UserData(20, "홍길동", "남", "01012345678"),
            UserData(14, "사나", "여", "010여23456789"),
            UserData(20, "유인나", "", "010여98765432"),
            UserData(34, "최성민", "남", "01098562438")
        )

        AppPrefs.ageMap = hashMapOf(
            "이시윤" to 3, "홍길동" to 20, "김수인" to 28
        )
    }

    private fun prefPrint() {
        println("AppPrefs.pushToken: ${AppPrefs.pushToken}")
        println("AppPrefs.userName: ${AppPrefs.userName}")
        println("AppPrefs.userNickname: ${AppPrefs.userNickname}")
        println("AppPrefs.userAge: ${AppPrefs.userAge}")
        println("AppPrefs.money: ${AppPrefs.money}")
        println("AppPrefs.isMarried: ${AppPrefs.isMarried}")

        println("AppPrefs.userList: ${AppPrefs.userList}")
        println("AppPrefs.ageMap: ${AppPrefs.ageMap}")
    }
}
