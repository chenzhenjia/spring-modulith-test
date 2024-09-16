package com.github.springmodulithtest.httpbin.http

import com.github.springmodulithtest.httpbin.HttpBinHttpService
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient
import org.springframework.web.client.support.RestClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory

@Configuration(proxyBeanMethods = false)
class HttpBinHttpConfiguration(
    private val restClientBuilder: RestClient.Builder,
) {

    @Bean
    @ConditionalOnMissingBean
    fun httpBinHttpClient(): HttpBinHttpClient {
        val restClient = restClientBuilder
            .baseUrl("https://httpbin.org")
            .build()
        val httpServiceProxyFactory =
            HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient))
                .build()
        return httpServiceProxyFactory.createClient(HttpBinHttpClient::class.java)
    }

    @Bean
    fun hisHttpService(httpbinHttpClient: HttpBinHttpClient): HttpBinHttpService {
        return HttpBinHttpService(httpbinHttpClient, code = "1234")
    }
}
