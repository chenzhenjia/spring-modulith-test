# spring-modulith-test

this project is a test project for the spring-modulith project.

spring-modulith-observability causes Kotlin bean properties to be initialized as null

visit http://localhost:8080 will report an error

```
java.lang.NullPointerException: Cannot invoke "com.github.springmodulithtest.httpbin.http.HttpBinHttpClient.get(java.util.Map)" because "this.httpBinHttpClient" is null
	at com.github.springmodulithtest.httpbin.HttpBinHttpService.get(HttpBinHttpService.kt:11) ~[main/:na]
```