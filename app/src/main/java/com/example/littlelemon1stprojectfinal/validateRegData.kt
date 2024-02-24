package com.example.littlelemon1stprojectfinal

import android.util.Patterns
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json

fun valdiateRegData(firstName: String , lastName: String, email: String):Boolean{
    var validated = false
    if (firstName.isNotBlank() && lastName.isNotBlank() && email.isNotBlank()){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches())
            validated= true
    }
    return validated
}
suspend fun fetchMenu(url : String): List<MenuItemNetwork>{
    val httpClient = HttpClient(Android){
        install(ContentNegotiation){
            json(contentType = ContentType("Text","plain"))
        }
    }
    val httpResponse : MenuNetwork = httpClient.get(url).body()
    return httpResponse.items
}

fun saveMenuToDatabase(database : AppDatabase, menuItemsNetwork: List<MenuItemNetwork> ){
    val menuItemsRoom = menuItemsNetwork.map { it.toMenuItemRoom()}
    database.menuItemDao().insertAll(*menuItemsRoom.toTypedArray())
}