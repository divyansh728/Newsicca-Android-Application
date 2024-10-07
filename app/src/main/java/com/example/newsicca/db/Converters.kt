package com.example.newsicca.db

import androidx.room.TypeConverter
import com.example.newsicca.models.Source

class Converters {

    @TypeConverter
    fun fromSource(Source: Source): String{
        return Source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}