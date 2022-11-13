/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending: OrderType()
}
