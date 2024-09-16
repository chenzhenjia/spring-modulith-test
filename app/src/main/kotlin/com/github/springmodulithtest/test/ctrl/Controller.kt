package com.github.springmodulithtest.test.ctrl

import com.github.springmodulithtest.httpbin.HttpBinHttpService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val httpBinHttpService: HttpBinHttpService
){

    @GetMapping("/")
    fun index(){
        httpBinHttpService.get()
    }


}