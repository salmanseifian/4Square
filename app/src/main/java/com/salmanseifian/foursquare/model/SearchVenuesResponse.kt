package com.salmanseifian.foursquare.model


import com.google.gson.annotations.SerializedName

data class SearchVenuesResponse(
    @SerializedName("meta")
    val meta: Meta?,
    @SerializedName("response")
    val response: Response?
)

data class Meta(
    @SerializedName("code")
    val code: Int?,
    @SerializedName("requestId")
    val requestId: String?
)

data class Response(
    @SerializedName("venues")
    val venues: List<Venue>?
)

data class Venue(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("location")
    val location: Location?,
    @SerializedName("categories")
    val categories: List<Category>?,
    @SerializedName("venuePage")
    val venuePage: VenuePage?
)

data class Location(
    @SerializedName("address")
    val address: String?,
    @SerializedName("crossStreet")
    val crossStreet: String?,
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?,
    @SerializedName("labeledLatLngs")
    val labeledLatLngs: List<LabeledLatLng>?,
    @SerializedName("distance")
    val distance: Int?,
    @SerializedName("postalCode")
    val postalCode: String?,
    @SerializedName("cc")
    val cc: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("state")
    val state: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("formattedAddress")
    val formattedAddress: List<String>?
)

data class LabeledLatLng(
    @SerializedName("label")
    val label: String?,
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)

data class Category(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("pluralName")
    val pluralName: String?,
    @SerializedName("shortName")
    val shortName: String?,
    @SerializedName("icon")
    val icon: Icon?,
    @SerializedName("primary")
    val primary: Boolean?
)

data class Icon(
    @SerializedName("prefix")
    val prefix: String?,
    @SerializedName("suffix")
    val suffix: String?
)

data class VenuePage(
    @SerializedName("id")
    val id: String?
)