package com.github.springmodulithtest.httpbin

import com.github.springmodulithtest.httpbin.http.HttpBinHttpClient

open class HttpBinHttpService(
    private val httpBinHttpClient: HttpBinHttpClient,
    private val code: String,
) {

    fun get() {
        httpBinHttpClient.get(mapOf("code" to code))
    }
}