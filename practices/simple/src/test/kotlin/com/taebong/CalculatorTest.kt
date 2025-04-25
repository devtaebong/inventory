package com.taebong

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class CalculatorTest : StringSpec({
    lateinit var calculator: Calculator

    beforeTest { calculator = mockk() }

    "a와 b를 더하면 3이다" {
        val a = 1
        val b = 2
        every { calculator.add(a, b) } returns 3
        val actual = calculator.add(a, b)
        actual shouldBe 3
    }
})
