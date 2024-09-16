package com.github.springmodulithtest.httpbin.http

import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.service.annotation.GetExchange

interface HttpBinHttpClient {
    @GetExchange("/get")
    fun get(@RequestParam params: Map<String, Any>): Any
}