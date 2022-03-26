package com.jetsada.roomdatabase.model

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Entity(tableName = "user_table")
@Parcelize
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val fristname: String,
    val lastname: String,
    val age: Int
//    @Embedded
//    val address : @RawValue Address
) : Parcelable


//data class Address (
//    val streetName:  String,
//    val streetNumber: Int
//)