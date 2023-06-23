## Environment requirements

Android Studio 2021+

```
android {
    compileSdk 33
    defaultConfig {
        minSdk 21
        targetSdk 33
   }
}
```

```
plugins {
    id 'com.android.application' version '7.2.2' 
    id 'com.android.library' version '7.2.2'
    id 'org.jetbrains.kotlin.android' version '1.8.0' 
}
```

Please be ready to share Emulator or connected device using [Sharing tool](https://github.com/Genymobile/scrcpy).


# dna-task-livecoding-android

## Available APIs

Below are listed APIs mocked in the solution.

They're meant to cooperate as follows.

### Payment API
In form of a `PaymentApiClient` class allows to execute and revert payments.

For ease of testing it has some hardcoded rules:
1. Executing payments with currency different from `EUR` will fail
2. Executing payments with amount < 20.00 will fail
3. Reverting payment with amount < 1.00 will fail

#### Methods:
- pay
- revert

### Purchase API
In form of `PurchaseApiCLient` api class allows to list products, initiate purchase transaction, confirm purchase after payment and cancel purchase in case of payment failure.

#### Methods
- getProducts
- initiatePurchase
- confirmPurchase
- cancelPurchase

Not to complicate things too much we've added condition that the purchase confirmation will fail when total sum of purchase exceeds 100.00.

### Card API
In form of `CardReaderService` which exposes one method for obtaining card data.

Card data contains token which should be passed to `Payment API` pay method.
To simulate errors, service throws `CardReaderException` when current time second is <= 5
