package com.taebong

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SimpleTest : StringSpec({
    "1 + 2 should be 3" {
        val a = 1
        val b = 2
        (a + b) shouldBe  3
    }
})
