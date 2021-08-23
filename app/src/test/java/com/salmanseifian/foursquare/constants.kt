package com.salmanseifian.foursquare

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.salmanseifian.foursquare.model.*

val sampleLatLng = "35.77488878596024,51.40009805560112"

val sampleLatLngBounds = LatLngBounds(
    LatLng(35.76587076681244, 51.39237329363824),
    LatLng(
        35.783906805108046, 51.407822817564
    )
)

val sampleNearLatLng = "35.77606198344144,51.39690387994051"

val sampleNearLatLngBounds = LatLngBounds(
    LatLng(35.76704409734948, 51.38917911797762),
    LatLng(
        35.78507986953339, 51.4046286419034
    )
)


val sampleJsonResponse = """
    {
    "meta": {
    "code": 200,
    "requestId": "6122262dc4a65b3f54a69cc9"
    },
    "notifications": [
    {
    "type": "notificationTray",
    "item": {
    "unreadCount": 0
    }
    }
    ],
    "response": {
    "venues": [
    {
    "id": "51dc5ae5498e3264aca2f722",
    "name": "Raees Coffee",
    "canonicalName": "کافه رئیس",
    "contact": {
    "phone": "02188602571",
    "formattedPhone": "021 8860 2571",
    "twitter": "raeescoffee",
    "instagram": "raeescoffee",
    "facebook": "148549228535383",
    "facebookUsername": "Raeesgroup",
    "facebookName": "Raees"
    },
    "location": {
    "address": "#60, Seoul St.",
    "crossStreet": "Sheykh Bahaei St.",
    "lat": 35.770320347518066,
    "lng": 51.39690313705317,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.770320347518066,
    "lng": 51.39690313705317
    }
    ],
    "distance": 589,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">#60, Seoul St.</span> (Sheykh Bahaei St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/raees-coffee--%DA%A9%D8%A7%D9%81%D9%87-%D8%B1%D8%A6%DB%8C%D8%B3/51dc5ae5498e3264aca2f722",
    "canonicalPath": "/v/raees-coffee--%DA%A9%D8%A7%D9%81%D9%87-%D8%B1%D8%A6%DB%8C%D8%B3/51dc5ae5498e3264aca2f722",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 266,
    "usersCount": 1758,
    "checkinsCount": 6690
    },
    "url": "https://raeescoffee.com",
    "urlSig": "XasGb5HFfFlOMzgkr781bnE9fjE=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "588f07e54f1069046a2c914c",
    "name": "Putt café",
    "canonicalName": "پات کافه",
    "contact": {},
    "location": {
    "address": "Enghelab sport complex",
    "crossStreet": "Seul",
    "lat": 35.78581696870962,
    "lng": 51.4007943008664,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.78581696870962,
    "lng": 51.4007943008664
    }
    ],
    "distance": 1213,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Enghelab sport complex</span> (Seul)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/putt-cafe/588f07e54f1069046a2c914c",
    "canonicalPath": "/v/putt-cafe/588f07e54f1069046a2c914c",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 20,
    "usersCount": 242,
    "checkinsCount": 458
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "6061c92a51319650fbfea844",
    "name": "Raees Coffee",
    "canonicalName": "کافه رئیس",
    "contact": {
    "instagram": "raeescoffee"
    },
    "location": {
    "lat": 35.760594,
    "lng": 51.357996,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.760594,
    "lng": 51.357996
    }
    ],
    "distance": 4125,
    "cc": "IR",
    "neighborhood": "District 2",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 2",
    "contextGeoId": 10004092,
    "formattedAddress": [
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/raees-coffee/6061c92a51319650fbfea844",
    "canonicalPath": "/v/raees-coffee/6061c92a51319650fbfea844",
    "categories": [
    {
    "id": "4bf58dd8d48988d1e0931735",
    "name": "Coffee Shop",
    "pluralName": "Coffee Shops",
    "shortName": "Coffee Shop",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/coffeeshop",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 7,
    "usersCount": 73,
    "checkinsCount": 207
    },
    "url": "https://raeescoffee.com",
    "urlSig": "XasGb5HFfFlOMzgkr781bnE9fjE=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "4f23cb95e4b0b653a2e0da2e",
    "name": "Éclair",
    "canonicalName": "اکلر",
    "contact": {
    "phone": "02122394251",
    "formattedPhone": "021 2239 4251"
    },
    "location": {
    "address": "No.4, Aghabozorgi St.",
    "lat": 35.789011,
    "lng": 51.423348,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.789011,
    "lng": 51.423348
    }
    ],
    "distance": 2619,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">No.4, Aghabozorgi St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/%C3%A9clair--%D8%A7%DA%A9%D9%84%D8%B1/4f23cb95e4b0b653a2e0da2e",
    "canonicalPath": "/v/%C3%A9clair--%D8%A7%DA%A9%D9%84%D8%B1/4f23cb95e4b0b653a2e0da2e",
    "categories": [
    {
    "id": "5744ccdfe4b0c0459246b4e2",
    "name": "Pastry Shop",
    "pluralName": "Pastry Shops",
    "shortName": "Pastry",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/dessert_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/dessert",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 167,
    "usersCount": 504,
    "checkinsCount": 1193
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5f4fccf3a878b571b2db1e98",
    "name": "Mansion No.85 | عمارت پلاک ۸۵",
    "contact": {
    "phone": "02186053695",
    "formattedPhone": "021 8605 3695",
    "twitter": "emarat_85",
    "instagram": "emarat.85",
    "facebook": "106510034505006",
    "facebookName": "عمارت پلاک ۸۵"
    },
    "location": {
    "address": "Yoosef abad",
    "crossStreet": "Akbari",
    "lat": 35.73575816000878,
    "lng": 51.408900395035744,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.73575816000878,
    "lng": 51.408900395035744
    }
    ],
    "distance": 4432,
    "cc": "IR",
    "neighborhood": "District 6",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 6",
    "contextGeoId": 10004094,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Yoosef abad</span> (Akbari)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/mansion-no85--%D8%B9%D9%85%D8%A7%D8%B1%D8%AA-%D9%BE%D9%84%D8%A7%DA%A9-%DB%B8%DB%B5/5f4fccf3a878b571b2db1e98",
    "canonicalPath": "/v/mansion-no85--%D8%B9%D9%85%D8%A7%D8%B1%D8%AA-%D9%BE%D9%84%D8%A7%DA%A9-%DB%B8%DB%B5/5f4fccf3a878b571b2db1e98",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 20,
    "usersCount": 97,
    "checkinsCount": 130
    },
    "url": "http://www.emarat85.com",
    "urlSig": "I2jeieyJW6T1Rnua2U0VF1Rnwpg=",
    "menu": {
    "type": "Menu",
    "label": "Menu",
    "anchor": "View Menu",
    "url": "http://www.emarat85.com/menus",
    "mobileUrl": "http://www.emarat85.com/menus",
    "canonicalPath": "/v/mansion-no85--%D8%B9%D9%85%D8%A7%D8%B1%D8%AA-%D9%BE%D9%84%D8%A7%DA%A9-%DB%B8%DB%B5/5f4fccf3a878b571b2db1e98/menu",
    "externalUrl": "http://www.emarat85.com/menus"
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5808f365d67ce0334503ff21",
    "name": "Sahar Bakery",
    "canonicalName": "نان سحر",
    "contact": {
    "phone": "02188096397",
    "formattedPhone": "021 8809 6397",
    "instagram": "saharbreadco"
    },
    "location": {
    "address": "Darya Blvd.",
    "lat": 35.77146698004907,
    "lng": 51.3680975127052,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.77146698004907,
    "lng": 51.3680975127052
    }
    ],
    "distance": 2916,
    "cc": "IR",
    "neighborhood": "District 2",
    "country": "Iran",
    "contextLine": "District 2",
    "contextGeoId": 10004092,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Darya Blvd.</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/sahar-bakery--%D9%86%D8%A7%D9%86-%D8%B3%D8%AD%D8%B1/5808f365d67ce0334503ff21",
    "canonicalPath": "/v/sahar-bakery--%D9%86%D8%A7%D9%86-%D8%B3%D8%AD%D8%B1/5808f365d67ce0334503ff21",
    "categories": [
    {
    "id": "4bf58dd8d48988d16a941735",
    "name": "Bakery",
    "pluralName": "Bakeries",
    "shortName": "Bakery",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/bakery_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/bakery",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 77,
    "usersCount": 623,
    "checkinsCount": 1682
    },
    "url": "http://saharbread.sahargroup.ir",
    "urlSig": "IScIcXDPNX+gLGheCkP0iREqhqw=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5fb3b04330bc6825e16521fd",
    "name": "Lamiz Coffee",
    "canonicalName": "لمیز کافی",
    "contact": {
    "instagram": "lamizcoffee"
    },
    "location": {
    "address": "E Sarv St",
    "crossStreet": "Saadat Abad",
    "lat": 35.782451,
    "lng": 51.378173,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.782451,
    "lng": 51.378173
    }
    ],
    "distance": 2150,
    "cc": "IR",
    "neighborhood": "District 2",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 2",
    "contextGeoId": 10004092,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">E Sarv St</span> (Saadat Abad)",
    "<span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/lamiz-coffee/5fb3b04330bc6825e16521fd",
    "canonicalPath": "/v/lamiz-coffee/5fb3b04330bc6825e16521fd",
    "categories": [
    {
    "id": "4bf58dd8d48988d1e0931735",
    "name": "Coffee Shop",
    "pluralName": "Coffee Shops",
    "shortName": "Coffee Shop",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/coffeeshop",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 0,
    "usersCount": 99,
    "checkinsCount": 241
    },
    "url": "https://lamizcoffee.com",
    "urlSig": "HVqAoYyu/U7uARkNtBjkiYV0dQU=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "531a0adb498ed721c103117e",
    "name": "Tochal Juice Bar",
    "canonicalName": "آبمیوه توچال - صیفی",
    "contact": {
    "phone": "22207392",
    "formattedPhone": "22207392"
    },
    "location": {
    "address": "Shariati St.",
    "lat": 35.79549096306699,
    "lng": 51.4344050212187,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.79549096306699,
    "lng": 51.4344050212187
    }
    ],
    "distance": 3850,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Shariati St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/tochal-juice-bar--%D8%A2%D8%A8%D9%85%DB%8C%D9%88%D9%87-%D8%AA%D9%88%DA%86%D8%A7%D9%84--%D8%B5%DB%8C%D9%81%DB%8C/531a0adb498ed721c103117e",
    "canonicalPath": "/v/tochal-juice-bar--%D8%A2%D8%A8%D9%85%DB%8C%D9%88%D9%87-%D8%AA%D9%88%DA%86%D8%A7%D9%84--%D8%B5%DB%8C%D9%81%DB%8C/531a0adb498ed721c103117e",
    "categories": [
    {
    "id": "4bf58dd8d48988d112941735",
    "name": "Juice Bar",
    "pluralName": "Juice Bars",
    "shortName": "Juice Bar",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/juicebar_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/default",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 209,
    "usersCount": 3361,
    "checkinsCount": 10611
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "565dbf79498e49fa08ff65f5",
    "name": "Sam Café",
    "canonicalName": "سام کافه",
    "contact": {
    "phone": "02186092106",
    "formattedPhone": "021 8609 2106",
    "instagram": "sam.cafe",
    "facebook": "424720800923115",
    "facebookUsername": "samcafe2012",
    "facebookName": "Sam Cafe"
    },
    "location": {
    "address": "Madiran Bldg., Aftab St.",
    "crossStreet": "Khodami St.",
    "lat": 35.765819137610194,
    "lng": 51.39863428112629,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.765819137610194,
    "lng": 51.39863428112629
    }
    ],
    "distance": 1023,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Madiran Bldg., Aftab St.</span> (Khodami St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/sam-caf%C3%A9--%D8%B3%D8%A7%D9%85-%DA%A9%D8%A7%D9%81%D9%87/565dbf79498e49fa08ff65f5",
    "canonicalPath": "/v/sam-caf%C3%A9--%D8%B3%D8%A7%D9%85-%DA%A9%D8%A7%D9%81%D9%87/565dbf79498e49fa08ff65f5",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 457,
    "usersCount": 2966,
    "checkinsCount": 10270
    },
    "url": "http://www.samcafe.ir",
    "urlSig": "aEybUq9lVA0qsOp85i4h1JNs5RA=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5bfcfd0fb9ac38002cc14e89",
    "name": "Downtown Burger Planet",
    "canonicalName": "دان تان برگر",
    "contact": {
    "phone": "02122012949",
    "formattedPhone": "021 2201 2949",
    "instagram": "downtownplanet"
    },
    "location": {
    "address": "No. 117, Jordan St.",
    "crossStreet": "Iraj St.",
    "lat": 35.771121070617355,
    "lng": 51.4206338196049,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.771121070617355,
    "lng": 51.4206338196049
    }
    ],
    "distance": 1901,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">No. 117, Jordan St.</span> (Iraj St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/downtown-burger-planet--%D8%AF%D8%A7%D9%86-%D8%AA%D8%A7%D9%86-%D8%A8%D8%B1%DA%AF%D8%B1/5bfcfd0fb9ac38002cc14e89",
    "canonicalPath": "/v/downtown-burger-planet--%D8%AF%D8%A7%D9%86-%D8%AA%D8%A7%D9%86-%D8%A8%D8%B1%DA%AF%D8%B1/5bfcfd0fb9ac38002cc14e89",
    "categories": [
    {
    "id": "4bf58dd8d48988d16c941735",
    "name": "Burger Joint",
    "pluralName": "Burger Joints",
    "shortName": "Burgers",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/burger_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/burger",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 268,
    "usersCount": 984,
    "checkinsCount": 2172
    },
    "url": "http://downtownplanet.ir",
    "urlSig": "GgCHSDlxHzeERWCmXOyDfAzjrZE=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "57bf0f53498e03879b57d86f",
    "name": "Elahieh 33 Pastry Shop",
    "canonicalName": "شيرينى الهيه ٣٣",
    "contact": {},
    "location": {
    "address": "No. 1, Akhgar St., Fereshteh St.",
    "lat": 35.79137694900764,
    "lng": 51.418559695132664,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.79137694900764,
    "lng": 51.418559695132664
    }
    ],
    "distance": 2475,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">No. 1, Akhgar St., Fereshteh St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/elahieh-33-pastry-shop--%D8%B4%D9%8A%D8%B1%D9%8A%D9%86%D9%89-%D8%A7%D9%84%D9%87%D9%8A%D9%87-%D9%A3%D9%A3/57bf0f53498e03879b57d86f",
    "canonicalPath": "/v/elahieh-33-pastry-shop--%D8%B4%D9%8A%D8%B1%D9%8A%D9%86%D9%89-%D8%A7%D9%84%D9%87%D9%8A%D9%87-%D9%A3%D9%A3/57bf0f53498e03879b57d86f",
    "categories": [
    {
    "id": "5744ccdfe4b0c0459246b4e2",
    "name": "Pastry Shop",
    "pluralName": "Pastry Shops",
    "shortName": "Pastry",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/dessert_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/dessert",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 41,
    "usersCount": 366,
    "checkinsCount": 677
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "547b5458498e5ae4c4b11025",
    "name": "Brothers Kitchen",
    "canonicalName": "آشپزخانه برادران",
    "contact": {
    "phone": "02188044202",
    "formattedPhone": "021 8804 4202",
    "facebook": "875243335849590",
    "facebookUsername": "brotherskitchenofficial",
    "facebookName": "Brothers Kitchen برادران"
    },
    "location": {
    "address": "#9, Nastaran Aly., South Seoul St., Sheykh Bahaei Sq.",
    "lat": 35.76667783383971,
    "lng": 51.39646942596056,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.76667783383971,
    "lng": 51.39646942596056
    }
    ],
    "distance": 976,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">#9, Nastaran Aly., South Seoul St., Sheykh Bahaei Sq.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/brothers-kitchen--%D8%A2%D8%B4%D9%BE%D8%B2%D8%AE%D8%A7%D9%86%D9%87-%D8%A8%D8%B1%D8%A7%D8%AF%D8%B1%D8%A7%D9%86/547b5458498e5ae4c4b11025",
    "canonicalPath": "/v/brothers-kitchen--%D8%A2%D8%B4%D9%BE%D8%B2%D8%AE%D8%A7%D9%86%D9%87-%D8%A8%D8%B1%D8%A7%D8%AF%D8%B1%D8%A7%D9%86/547b5458498e5ae4c4b11025",
    "categories": [
    {
    "id": "4bf58dd8d48988d16e941735",
    "name": "Fast Food Restaurant",
    "pluralName": "Fast Food Restaurants",
    "shortName": "Fast Food",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/fastfood_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/fastfood",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 761,
    "usersCount": 3020,
    "checkinsCount": 8726
    },
    "url": "http://www.brotherskitchen.ir",
    "urlSig": "mCbmcasjZPGMU+Ig45FcCkhglqA=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "50057289e4b063622951af01",
    "name": "San Marco Ice Cream",
    "canonicalName": "بستنی ایتالیایی سان مارکو",
    "contact": {
    "phone": "02122238108",
    "formattedPhone": "021 2223 8108",
    "instagram": "san_marco_tehran",
    "facebook": "86261689830",
    "facebookUsername": "san.marco.tehran",
    "facebookName": "San Marco (Italian Ice Cream)"
    },
    "location": {
    "address": "Qeytarieh St.",
    "lat": 35.79418950700025,
    "lng": 51.450347460511885,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.79418950700025,
    "lng": 51.450347460511885
    }
    ],
    "distance": 5017,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Qeytarieh St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/san-marco-ice-cream--%D8%A8%D8%B3%D8%AA%D9%86%DB%8C-%D8%A7%DB%8C%D8%AA%D8%A7%D9%84%DB%8C%D8%A7%DB%8C%DB%8C-%D8%B3%D8%A7%D9%86-%D9%85%D8%A7%D8%B1%DA%A9%D9%88/50057289e4b063622951af01",
    "canonicalPath": "/v/san-marco-ice-cream--%D8%A8%D8%B3%D8%AA%D9%86%DB%8C-%D8%A7%DB%8C%D8%AA%D8%A7%D9%84%DB%8C%D8%A7%DB%8C%DB%8C-%D8%B3%D8%A7%D9%86-%D9%85%D8%A7%D8%B1%DA%A9%D9%88/50057289e4b063622951af01",
    "categories": [
    {
    "id": "4bf58dd8d48988d1c9941735",
    "name": "Ice Cream Shop",
    "pluralName": "Ice Cream Shops",
    "shortName": "Ice Cream",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/icecream_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/icecream",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 873,
    "usersCount": 4583,
    "checkinsCount": 14445
    },
    "url": "http://www.sanmarco-icecream.com",
    "urlSig": "AMFnZ2Q104QqLrevL3kf60MtVWw=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "locked": true,
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5bc0cb46ccad6b002ca5db2e",
    "name": "Rebelan Cafe & Restaurant",
    "canonicalName": "کافه و رستوران ربلان",
    "contact": {
    "phone": "02124512",
    "formattedPhone": "021 24512",
    "instagram": "rebelangroup"
    },
    "location": {
    "address": "Tajrish Sq, Gholam Jafari St.",
    "crossStreet": "7th Floor",
    "lat": 35.80859986099495,
    "lng": 51.42931103349665,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.80859986099495,
    "lng": 51.42931103349665
    }
    ],
    "distance": 4582,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Tajrish Sq, Gholam Jafari St.</span> (7th Floor)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/rebelan-cafe--restaurant--%DA%A9%D8%A7%D9%81%D9%87-%D9%88-%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D8%A8%D9%84%D8%A7%D9%86/5bc0cb46ccad6b002ca5db2e",
    "canonicalPath": "/v/rebelan-cafe--restaurant--%DA%A9%D8%A7%D9%81%D9%87-%D9%88-%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D8%A8%D9%84%D8%A7%D9%86/5bc0cb46ccad6b002ca5db2e",
    "categories": [
    {
    "id": "4bf58dd8d48988d1c4941735",
    "name": "Restaurant",
    "pluralName": "Restaurants",
    "shortName": "Restaurant",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/default_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/default",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 80,
    "usersCount": 650,
    "checkinsCount": 1002
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5c5f127be0c0c9002c6e0439",
    "name": "Mito Gelato",
    "canonicalName": "میتو جلاتو",
    "contact": {
    "phone": "02122749801",
    "formattedPhone": "021 2274 9801",
    "instagram": "mitogelato"
    },
    "location": {
    "address": "No.318",
    "crossStreet": "Niyavaran",
    "lat": 35.809501,
    "lng": 51.444121,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.809501,
    "lng": 51.444121
    }
    ],
    "distance": 5531,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">No.318</span> (Niyavaran)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/mito-gelato--%D9%85%DB%8C%D8%AA%D9%88-%D8%AC%D9%84%D8%A7%D8%AA%D9%88/5c5f127be0c0c9002c6e0439",
    "canonicalPath": "/v/mito-gelato--%D9%85%DB%8C%D8%AA%D9%88-%D8%AC%D9%84%D8%A7%D8%AA%D9%88/5c5f127be0c0c9002c6e0439",
    "categories": [
    {
    "id": "4bf58dd8d48988d1c9941735",
    "name": "Ice Cream Shop",
    "pluralName": "Ice Cream Shops",
    "shortName": "Ice Cream",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/icecream_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/icecream",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 37,
    "usersCount": 220,
    "checkinsCount": 452
    },
    "url": "http://www.mitogelato.com",
    "urlSig": "0L9wNBFsjP3NChHARMTDp4hg7wg=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "4e07737562e100e5816fec67",
    "name": "Lamiz Coffee",
    "canonicalName": "لمیز کافی",
    "contact": {
    "phone": "02122708061",
    "formattedPhone": "021 2270 8061",
    "instagram": "lamizcoffee"
    },
    "location": {
    "address": "Tajrish Sq.",
    "crossStreet": "Sadabad St.",
    "lat": 35.807081,
    "lng": 51.428087,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.807081,
    "lng": 51.428087
    }
    ],
    "distance": 4380,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Tajrish Sq.</span> (Sadabad St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/lamiz-coffee--%D9%84%D9%85%DB%8C%D8%B2-%DA%A9%D8%A7%D9%81%DB%8C/4e07737562e100e5816fec67",
    "canonicalPath": "/v/lamiz-coffee--%D9%84%D9%85%DB%8C%D8%B2-%DA%A9%D8%A7%D9%81%DB%8C/4e07737562e100e5816fec67",
    "categories": [
    {
    "id": "4bf58dd8d48988d1e0931735",
    "name": "Coffee Shop",
    "pluralName": "Coffee Shops",
    "shortName": "Coffee Shop",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/coffeeshop",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 601,
    "usersCount": 5469,
    "checkinsCount": 27304
    },
    "url": "http://www.lamizcoffee.com",
    "urlSig": "2/eeu5kLVwTVeFGXtZ3DsUtpuDA=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "locked": true,
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5c8e56da67e5f2002c735eb5",
    "name": "Roble Restaurant & Lounge",
    "canonicalName": "رستوران روبِل",
    "contact": {
    "phone": "02122430130",
    "formattedPhone": "021 2243 0130",
    "instagram": "roble_restaurant"
    },
    "location": {
    "address": "Velenjak, 13th St.",
    "lat": 35.807573,
    "lng": 51.405697,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.807573,
    "lng": 51.405697
    }
    ],
    "distance": 3668,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Velenjak, 13th St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/roble-restaurant--lounge--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D9%88%D8%A8%D9%84/5c8e56da67e5f2002c735eb5",
    "canonicalPath": "/v/roble-restaurant--lounge--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D9%88%D8%A8%D9%84/5c8e56da67e5f2002c735eb5",
    "categories": [
    {
    "id": "4bf58dd8d48988d1df931735",
    "name": "BBQ Joint",
    "pluralName": "BBQ Joints",
    "shortName": "BBQ",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/bbqalt_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/bbq",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": true,
    "stats": {
    "tipCount": 121,
    "usersCount": 390,
    "checkinsCount": 540
    },
    "url": "http://www.theroble.com",
    "urlSig": "6XRsEdb4RUqXYbSSh/uZNnN+w4g=",
    "menu": {
    "type": "Menu",
    "label": "Menu",
    "anchor": "View Menu",
    "url": "http://menu.theroble.com",
    "mobileUrl": "http://menu.theroble.com",
    "canonicalPath": "/v/roble-restaurant--lounge--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D9%88%D8%A8%D9%84/5c8e56da67e5f2002c735eb5/menu",
    "externalUrl": "http://menu.theroble.com"
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 1,
    "items": [
    {
    "id": "6073f179c8a526185f0edf63",
    "type": "frequency",
    "message": "Online Menu :   menu.theroble.com",
    "photo": {
    "id": "6073f179969f6843a340d0e5",
    "createdAt": 1618211193,
    "prefix": "https://fastly.4sqi.net/img/general/",
    "suffix": "/576225222_u81WBX89FWM_NfwpeAkH5leyR30WX5ZnG20u4FADOA0.jpg",
    "width": 640,
    "height": 640,
    "visibility": "public"
    },
    "description": "",
    "unlocked": true,
    "icon": "default",
    "title": "Special",
    "state": "unlocked",
    "provider": "foursquare",
    "redemption": "webview",
    "interaction": {
    "entryUrl": "https://foursquare.com/device/specials/6073f179c8a526185f0edf63?venueId=5c8e56da67e5f2002c735eb5"
    },
    "page": {
    "id": "576225222",
    "firstName": "Roble Restaurant & Lounge | رستوران روبِل",
    "gender": "none",
    "countryCode": "IR",
    "canonicalUrl": "https://foursquare.com/p/roble-restaurant--lounge--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D9%88%D8%A8%D9%84/576225222",
    "canonicalPath": "/p/roble-restaurant--lounge--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D8%B1%D9%88%D8%A8%D9%84/576225222",
    "photo": {
    "prefix": "https://fastly.4sqi.net/img/user/",
    "suffix": "/576225222_8ZODoEW6_8S_IWrPTbOZL99QDEtaPVVveiRqtVlcAw0W2A-FQQhgNgeeeGtIA2i7BBzRWBjd4.jpg"
    },
    "type": "venuePage",
    "venue": {
    "id": "5c8e56da67e5f2002c735eb5"
    },
    "isAnonymous": false,
    "tips": {
    "count": 7
    },
    "lists": {
    "groups": [
    {
    "type": "created",
    "count": 2,
    "items": []
    }
    ]
    },
    "homeCity": "Tehran",
    "bio": "",
    "contact": {}
    }
    }
    ]
    },
    "venuePage": {
    "id": "576225222"
    },
    "storeId": "",
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5947eceea35dce7169dc0b96",
    "name": "Lamiz Coffee",
    "canonicalName": "لمیز کافی",
    "contact": {
    "phone": "02155620326",
    "formattedPhone": "021 5562 0326",
    "instagram": "lamizcoffee"
    },
    "location": {
    "address": "Valiasr St., Vanak Sq.",
    "lat": 35.758786,
    "lng": 51.409818,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.758786,
    "lng": 51.409818
    }
    ],
    "distance": 2000,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Valiasr St., Vanak Sq.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/lamiz-coffee--%D9%84%D9%85%DB%8C%D8%B2-%DA%A9%D8%A7%D9%81%DB%8C/5947eceea35dce7169dc0b96",
    "canonicalPath": "/v/lamiz-coffee--%D9%84%D9%85%DB%8C%D8%B2-%DA%A9%D8%A7%D9%81%DB%8C/5947eceea35dce7169dc0b96",
    "categories": [
    {
    "id": "4bf58dd8d48988d1e0931735",
    "name": "Coffee Shop",
    "pluralName": "Coffee Shops",
    "shortName": "Coffee Shop",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/coffeeshop",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 108,
    "usersCount": 1487,
    "checkinsCount": 4796
    },
    "url": "http://lamizcoffee.com",
    "urlSig": "v2H8bysvI9qbhJgXn8DNBM4NAis=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5efa26aea6eb82397ae2ffd4",
    "name": "Downtown Burger Planet 2",
    "contact": {},
    "location": {
    "lat": 35.806597,
    "lng": 51.471347,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.806597,
    "lng": 51.471347
    }
    ],
    "distance": 7334,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/downtown-burger-planet-2/5efa26aea6eb82397ae2ffd4",
    "canonicalPath": "/v/downtown-burger-planet-2/5efa26aea6eb82397ae2ffd4",
    "categories": [
    {
    "id": "4bf58dd8d48988d16c941735",
    "name": "Burger Joint",
    "pluralName": "Burger Joints",
    "shortName": "Burgers",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/burger_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/burger",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 27,
    "usersCount": 219,
    "checkinsCount": 503
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5b8e176c23a2e6002c183503",
    "name": "Lamiz Coffee",
    "canonicalName": "لمیز کافی",
    "contact": {
    "instagram": "lamizcoffe"
    },
    "location": {
    "address": "Pasdaran St.",
    "crossStreet": "9th. Boostan St.",
    "lat": 35.768665,
    "lng": 51.458385,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.768665,
    "lng": 51.458385
    }
    ],
    "distance": 5309,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Pasdaran St.</span> (9th. Boostan St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/lamiz/5b8e176c23a2e6002c183503",
    "canonicalPath": "/v/lamiz/5b8e176c23a2e6002c183503",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 40,
    "usersCount": 368,
    "checkinsCount": 1249
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "52aa077c11d29b0830a4a910",
    "name": "Déjàvu Restaurant",
    "canonicalName": "رستوران مدیترانه ای دژاوو",
    "contact": {
    "phone": "02122431570",
    "formattedPhone": "021 2243 1570",
    "instagram": "dejavuir"
    },
    "location": {
    "address": "Moghadas Ardebili St.",
    "crossStreet": "Between Alef Sq. & Pesyan St.",
    "lat": 35.8005184608819,
    "lng": 51.415633903770235,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.8005184608819,
    "lng": 51.415633903770235
    }
    ],
    "distance": 3174,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Moghadas Ardebili St.</span> (Between Alef Sq. &amp; Pesyan St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/d%C3%A9j%C3%A0vu-restaurant--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D9%85%D8%AF%DB%8C%D8%AA%D8%B1%D8%A7%D9%86%D9%87-%D8%A7%DB%8C-%D8%AF%DA%98%D8%A7%D9%88%D9%88/52aa077c11d29b0830a4a910",
    "canonicalPath": "/v/d%C3%A9j%C3%A0vu-restaurant--%D8%B1%D8%B3%D8%AA%D9%88%D8%B1%D8%A7%D9%86-%D9%85%D8%AF%DB%8C%D8%AA%D8%B1%D8%A7%D9%86%D9%87-%D8%A7%DB%8C-%D8%AF%DA%98%D8%A7%D9%88%D9%88/52aa077c11d29b0830a4a910",
    "categories": [
    {
    "id": "4bf58dd8d48988d1c0941735",
    "name": "Mediterranean Restaurant",
    "pluralName": "Mediterranean Restaurants",
    "shortName": "Mediterranean",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/mediterranean_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/default",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 205,
    "usersCount": 1750,
    "checkinsCount": 3318
    },
    "url": "http://dejavugroup.ir",
    "urlSig": "NLxec1cxJx7f5U+k5p7h9VebG1M=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "50c1b768e4b08b77f8e2a231",
    "name": "Sahar Bakery",
    "canonicalName": "نان سحر",
    "contact": {
    "phone": "02122674571",
    "formattedPhone": "021 2267 4571",
    "instagram": "saharbreadco"
    },
    "location": {
    "address": "Shariati St.",
    "crossStreet": "Sadr Opas.",
    "lat": 35.785659476995406,
    "lng": 51.43597713571775,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.785659476995406,
    "lng": 51.43597713571775
    }
    ],
    "distance": 3452,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Shariati St.</span> (Sadr Opas.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/sahar-bakery--%D9%86%D8%A7%D9%86-%D8%B3%D8%AD%D8%B1/50c1b768e4b08b77f8e2a231",
    "canonicalPath": "/v/sahar-bakery--%D9%86%D8%A7%D9%86-%D8%B3%D8%AD%D8%B1/50c1b768e4b08b77f8e2a231",
    "categories": [
    {
    "id": "4bf58dd8d48988d16a941735",
    "name": "Bakery",
    "pluralName": "Bakeries",
    "shortName": "Bakery",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/bakery_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/bakery",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 276,
    "usersCount": 1995,
    "checkinsCount": 5049
    },
    "url": "http://sahargroup.ir",
    "urlSig": "VHCmLgMmEfRGa6EmBmmR9hMOYs0=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5f760364736d201853799d70",
    "name": "Avli Restaurant",
    "contact": {
    "phone": "02122231006",
    "formattedPhone": "021 2223 1006"
    },
    "location": {
    "address": "Andarzgoo Blvd",
    "crossStreet": "Alavi Alley",
    "lat": 35.802063,
    "lng": 51.45796,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.802063,
    "lng": 51.45796
    }
    ],
    "distance": 6033,
    "postalCode": "2",
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Andarzgoo Blvd</span> (Alavi Alley)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span> <span itemprop=\"postalCode\">2</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/avli-restaurant/5f760364736d201853799d70",
    "canonicalPath": "/v/avli-restaurant/5f760364736d201853799d70",
    "categories": [
    {
    "id": "4bf58dd8d48988d1c4941735",
    "name": "Restaurant",
    "pluralName": "Restaurants",
    "shortName": "Restaurant",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/default_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/default",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 79,
    "usersCount": 232,
    "checkinsCount": 416
    },
    "url": "http://avli.ir",
    "urlSig": "2goahz80iwsR3GUBmhlASj6p0qw=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5c1936c3005ac1002cea05ab",
    "name": "Container Buffet",
    "canonicalName": "بوفه کانتینر",
    "contact": {
    "phone": "02122140603",
    "formattedPhone": "021 2214 0603",
    "instagram": "containerbuffet"
    },
    "location": {
    "address": "بلوار ۲۴ متری، هفتم شرقی",
    "crossStreet": "East 7the Street",
    "lat": 35.78579664635911,
    "lng": 51.38418676547494,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.78579664635911,
    "lng": 51.38418676547494
    }
    ],
    "distance": 1878,
    "cc": "IR",
    "neighborhood": "District 2",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 2",
    "contextGeoId": 10004092,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">&#1576;&#1604;&#1608;&#1575;&#1585; &#1778;&#1780; &#1605;&#1578;&#1585;&#1740;&#1548; &#1607;&#1601;&#1578;&#1605; &#1588;&#1585;&#1602;&#1740;</span> (East 7the Street)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/container-buffet--%D8%A8%D9%88%D9%81%D9%87-%DA%A9%D8%A7%D9%86%D8%AA%DB%8C%D9%86%D8%B1/5c1936c3005ac1002cea05ab",
    "canonicalPath": "/v/container-buffet--%D8%A8%D9%88%D9%81%D9%87-%DA%A9%D8%A7%D9%86%D8%AA%DB%8C%D9%86%D8%B1/5c1936c3005ac1002cea05ab",
    "categories": [
    {
    "id": "52e81612bcbc57f1066b79f4",
    "name": "Buffet",
    "pluralName": "Buffets",
    "shortName": "Buffet",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/default_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/default",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 34,
    "usersCount": 291,
    "checkinsCount": 1080
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5ddbb5b6c243930008e98810",
    "name": "Lamiz Coffee",
    "canonicalName": "لمیز کافی",
    "contact": {
    "instagram": "lamizcoffee"
    },
    "location": {
    "address": "Bagh Ferdows",
    "crossStreet": "Vali-e Asr Street",
    "lat": 35.806948,
    "lng": 51.425511,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.806948,
    "lng": 51.425511
    }
    ],
    "distance": 4238,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Bagh Ferdows</span> (Vali-e Asr Street)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/lamiz-coffee--%D9%84%D9%85%DB%8C%D8%B2-%DA%A9%D8%A7%D9%81%DB%8C/5ddbb5b6c243930008e98810",
    "canonicalPath": "/v/lamiz-coffee--%D9%84%D9%85%DB%8C%D8%B2-%DA%A9%D8%A7%D9%81%DB%8C/5ddbb5b6c243930008e98810",
    "categories": [
    {
    "id": "4bf58dd8d48988d1e0931735",
    "name": "Coffee Shop",
    "pluralName": "Coffee Shops",
    "shortName": "Coffee Shop",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/coffeeshop",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 17,
    "usersCount": 358,
    "checkinsCount": 1125
    },
    "url": "https://www.lamizcoffee.com",
    "urlSig": "/nN2n1TP7ywxG1OefzlpPGFawHE=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5d7357444578460008357d87",
    "name": "Sam Café",
    "canonicalName": "سام کافه",
    "contact": {
    "instagram": "samcoffeeroasters"
    },
    "location": {
    "address": "Sanaee St",
    "lat": 35.71697,
    "lng": 51.41847,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.71697,
    "lng": 51.41847
    }
    ],
    "distance": 6662,
    "cc": "IR",
    "neighborhood": "District 6",
    "city": "Tehran",
    "state": "Tehran Province",
    "country": "Iran",
    "contextLine": "District 6, Tehran",
    "contextGeoId": 10004094,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Sanaee St</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran Province</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/sam-caf%C3%A9/5d7357444578460008357d87",
    "canonicalPath": "/v/sam-caf%C3%A9/5d7357444578460008357d87",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 20,
    "usersCount": 258,
    "checkinsCount": 1475
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "554dc858498e8688bcad5def",
    "name": "Roberto Café",
    "canonicalName": "کافه روبرتو",
    "contact": {
    "phone": "02126701830",
    "formattedPhone": "021 2670 1830",
    "instagram": "roberto.cafe"
    },
    "location": {
    "address": "No. 4, 2nd Boostan St., Pasdaran St.",
    "lat": 35.76283454059799,
    "lng": 51.45778175965979,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.76283454059799,
    "lng": 51.45778175965979
    }
    ],
    "distance": 5380,
    "cc": "IR",
    "neighborhood": "District 3",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 3",
    "contextGeoId": 10004101,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">No. 4, 2nd Boostan St., Pasdaran St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/roberto-caf%C3%A9--%DA%A9%D8%A7%D9%81%D9%87-%D8%B1%D9%88%D8%A8%D8%B1%D8%AA%D9%88/554dc858498e8688bcad5def",
    "canonicalPath": "/v/roberto-caf%C3%A9--%DA%A9%D8%A7%D9%81%D9%87-%D8%B1%D9%88%D8%A8%D8%B1%D8%AA%D9%88/554dc858498e8688bcad5def",
    "categories": [
    {
    "id": "4bf58dd8d48988d16d941735",
    "name": "Café",
    "pluralName": "Cafés",
    "shortName": "Café",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/cafe_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/cafe",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 990,
    "usersCount": 3341,
    "checkinsCount": 10483
    },
    "url": "http://robertocafe.ir",
    "urlSig": "EnvI6cwhyuZxqn2EPuiwF77bb80=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "5c55a7c2029a55002c27324e",
    "name": "Lamiz Coffee",
    "canonicalName": "قهوه لمیز",
    "contact": {
    "phone": "02126125772",
    "formattedPhone": "021 2612 5772",
    "instagram": "lamizcoffee"
    },
    "location": {
    "address": "Farmnieh 4way , Bam Centre",
    "lat": 35.79920951357963,
    "lng": 51.47291233039175,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.79920951357963,
    "lng": 51.47291233039175
    }
    ],
    "distance": 7107,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Farmnieh 4way , Bam Centre</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/lamiz-coffee/5c55a7c2029a55002c27324e",
    "canonicalPath": "/v/lamiz-coffee/5c55a7c2029a55002c27324e",
    "categories": [
    {
    "id": "4bf58dd8d48988d1e0931735",
    "name": "Coffee Shop",
    "pluralName": "Coffee Shops",
    "shortName": "Coffee Shop",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/coffeeshop",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 15,
    "usersCount": 422,
    "checkinsCount": 1305
    },
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "572375fb498e33891d56b7f6",
    "name": "Gelato House",
    "canonicalName": "خانه جلاتو",
    "contact": {
    "phone": "02188581714",
    "formattedPhone": "021 8858 1714",
    "instagram": "cafegelato"
    },
    "location": {
    "address": "Fakhar Moghaddam St.",
    "crossStreet": "Dadman St.",
    "lat": 35.76663771215853,
    "lng": 51.357291998822795,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.76663771215853,
    "lng": 51.357291998822795
    }
    ],
    "distance": 3976,
    "cc": "IR",
    "neighborhood": "District 2",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 2",
    "contextGeoId": 10004092,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">Fakhar Moghaddam St.</span> (Dadman St.)",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/gelato-house--%D8%AE%D8%A7%D9%86%D9%87-%D8%AC%D9%84%D8%A7%D8%AA%D9%88/572375fb498e33891d56b7f6",
    "canonicalPath": "/v/gelato-house--%D8%AE%D8%A7%D9%86%D9%87-%D8%AC%D9%84%D8%A7%D8%AA%D9%88/572375fb498e33891d56b7f6",
    "categories": [
    {
    "id": "4bf58dd8d48988d1c9941735",
    "name": "Ice Cream Shop",
    "pluralName": "Ice Cream Shops",
    "shortName": "Ice Cream",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/icecream_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/icecream",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 289,
    "usersCount": 1349,
    "checkinsCount": 3493
    },
    "url": "http://www.gelatohouse.ir",
    "urlSig": "0X4a7iSKuEvaljxzFmwgQKXckbQ=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    },
    {
    "id": "58d539474f218a6c1d52a5ee",
    "name": "Container Buffet",
    "canonicalName": "بوفه کانتینر",
    "contact": {
    "phone": "02126111140",
    "formattedPhone": "021 2611 1140"
    },
    "location": {
    "address": "North Dibaji St.",
    "lat": 35.79357223995507,
    "lng": 51.464204129289755,
    "labeledLatLngs": [
    {
    "label": "display",
    "lat": 35.79357223995507,
    "lng": 51.464204129289755
    }
    ],
    "distance": 6148,
    "cc": "IR",
    "neighborhood": "District 1",
    "city": "Tehran",
    "state": "Tehran",
    "country": "Iran",
    "contextLine": "District 1",
    "contextGeoId": 10004097,
    "formattedAddress": [
    "<span itemprop=\"streetAddress\">North Dibaji St.</span>",
    "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
    ]
    },
    "canonicalUrl": "https://foursquare.com/v/container-buffet--%D8%A8%D9%88%D9%81%D9%87-%DA%A9%D8%A7%D9%86%D8%AA%DB%8C%D9%86%D8%B1/58d539474f218a6c1d52a5ee",
    "canonicalPath": "/v/container-buffet--%D8%A8%D9%88%D9%81%D9%87-%DA%A9%D8%A7%D9%86%D8%AA%DB%8C%D9%86%D8%B1/58d539474f218a6c1d52a5ee",
    "categories": [
    {
    "id": "52e81612bcbc57f1066b79f4",
    "name": "Buffet",
    "pluralName": "Buffets",
    "shortName": "Buffet",
    "icon": {
    "prefix": "https://ss3.4sqi.net/img/categories_v2/food/default_",
    "mapPrefix": "https://ss3.4sqi.net/img/categories_map/food/default",
    "suffix": ".png"
    },
    "primary": true
    }
    ],
    "verified": false,
    "stats": {
    "tipCount": 181,
    "usersCount": 754,
    "checkinsCount": 3157
    },
    "url": "http://www.containerbuffet.com",
    "urlSig": "PatyVs+5CPB2QFS3Y2rRCVALplo=",
    "allowMenuUrlEdit": true,
    "beenHere": {
    "lastCheckinExpiredAt": 0
    },
    "specials": {
    "count": 0,
    "items": []
    },
    "hereNow": {
    "count": 0,
    "summary": "Nobody here",
    "groups": []
    },
    "referralId": "v-1629627950",
    "venueChains": [],
    "hasPerk": false
    }
    ],
    "confident": false
    }
    }
    
""".trimIndent()


val sampleVenues = arrayListOf(
    Venue(
        "51dc5ae5498e3264aca2f722",
        "Raees Coffee",
        Location(
            "#60, Seoul St.",
            "Sheykh Bahaei St.",
            35.770320347518066,
            51.39690313705317,
            arrayListOf(LabeledLatLng("display", 35.770320347518066, 51.39690313705317)),
            589,
            null,
            "IR",
            "Tehran",
            "Tehran",
            "Iran",
            listOf(
                "<span itemprop=\"streetAddress\">#60, Seoul St.</span> (Sheykh Bahaei St.)",
                "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
            )

        ),
        listOf(
            Category(
                "4bf58dd8d48988d16d941735",
                "Café",
                "Cafés",
                "Café",
                Icon("https://ss3.4sqi.net/img/categories_v2/food/cafe_", ".png"),
                true
            )
        ),
        null
    ),
    Venue(
        "547b5458498e5ae4c4b11025",
        "Brothers Kitchen",
        Location(
            "#9, Nastaran Aly., South Seoul St., Sheykh Bahaei Sq.",
            null,
            35.76667783383971,
            51.39646942596056,
            listOf(LabeledLatLng("display", 35.76667783383971, 51.39646942596056)),
            976,
            null,
            "IR",
            "Tehran",
            "Tehran",
            "Iran",
            listOf(
                "<span itemprop=\"streetAddress\">#9, Nastaran Aly., South Seoul St., Sheykh Bahaei Sq.</span>",
                "<span itemprop=\"addressLocality\">Tehran</span>, <span itemprop=\"addressRegion\">Tehran</span>"
            )

        ),
        listOf(
            Category(
                "4bf58dd8d48988d16e941735",
                "Fast Food Restaurant",
                "Fast Food Restaurants",
                "Fast Food",
                Icon("https://ss3.4sqi.net/img/categories_v2/food/fastfood_", ".png"),
                true
            )
        ),
        null
    )
)