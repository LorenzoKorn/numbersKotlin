package lorenzokorn.numbers_kotlin.database

import lorenzokorn.numbers_kotlin.api.NumbersApi
import lorenzokorn.numbers_kotlin.api.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}