package br.com.luisrjaeger.slack.model

import com.google.gson.annotations.SerializedName


class Field {

    String title

    String value

    @SerializedName('short')
    Boolean shortValue = true

}
