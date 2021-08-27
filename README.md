# 4Square


It is an Android app which user foursquare api for showing newaby restaurants on the map to user.


It is written in Kotlin.
It's architecture is MVVM.
It uses kotlin coroutines and flow.
It uses dagger + hilt.
It uses retrofit.




Before running the app make sure you have added your keys to the app:

In the keys.kt file your need to add two keys that relates to the foursquare api.

```
package com.salmanseifian.foursquare.utils

const val CLIENT_ID = ""
const val CLIENT_SECRET = ""
```

In the local.properties you need to add map api key.
