package com.github.springmodulithtest

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules

class SpringModulithTestApplicationTest{
    private val modules= ApplicationModules.of(SpringModulithTestApplication::class.java)

    @Test
    fun verifiesModularStructure(){
        modules.verify()
    }
}