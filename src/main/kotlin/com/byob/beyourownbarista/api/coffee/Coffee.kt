package com.byob.beyourownbarista.api.coffee

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.annotation.ReadOnlyProperty

@Entity
data class Coffee(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0,
    var name: String,
    var price: Double
) {

}