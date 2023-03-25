# QA Test mobile challenge
## PROJECT (Android Mobile App)
Create an automation project using the following APKs [api](apps/product_registration.apk)

This project must contain at least 3 different scenarios.

Required: Use Page Objects pattern.
Desirable: Generate a report of the tests performed.

## Environment
- Java 17
- Maven 3.9.0
- Appium 1.22.3-4
- AndroidStudio Pixel 6 API 33

## Execution
This code can be executed by [runner][runners], by [feature][features] and with maven by [pom.xml][pom]. Reports are generated after execution and are saved in the directory referring to the execution time.

[runners]: src/test/java/runners
[features]: src/test/resources/features
[pom]: pom.xml