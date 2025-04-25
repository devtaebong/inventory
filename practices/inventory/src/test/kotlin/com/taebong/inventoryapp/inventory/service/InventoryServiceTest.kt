package com.taebong.inventoryapp.inventory.service

import com.taebong.inventoryapp.test.exception.NotImplementedTestException
import io.kotest.core.spec.style.DescribeSpec

class InventoryServiceTest : DescribeSpec({
    describe("FindByItemId") {
        context("itemId를 갖는 자원이 없다면") {
            it("exception을 던진다") {
                throw NotImplementedTestException()
            }
        }

        context("itemId를 갖는 자원이 있다면") {
            it("inventory를 반환한다") {
                throw NotImplementedTestException()
            }
        }
    }

    describe("DecreaseByItemId") {
        context("quantity가 음수라면") {
            it("exception을 던진다") {
                throw NotImplementedTestException()
            }
        }

        context("quantity가 stock보다 크면") {
            it("exception을 던진다") {
                throw NotImplementedTestException()
            }
        }

        context("itemId를 갖는 자원이 없다면") {
            it("exception을 던진다") {
                throw NotImplementedTestException()
            }
        }

        context("변경된 entity가 없다면") {
            it("exception을 throw 한다") {
                throw NotImplementedTestException()
            }
        }

        context("itemId를 갖는 entity를 찾으면") {
            it("stock을 차감하고 inventory를 반환한다") {
                throw NotImplementedTestException()
            }
        }
    }

    describe("UpdateStock") {
        context("수정하려는 stock이 유효하지 않다면") {
            it("exception을 throw 한다") {
                throw NotImplementedTestException()
            }
        }

        context("itemId를 갖는 entity 없다면") {
            it("exception을 던진다") {
                throw NotImplementedTestException()
            }
        }

        context("itemId를 갖는 entity 찾으면") {
            it("stock을 수정하고 Inventory를 반환한다") {
                throw NotImplementedTestException()
            }
        }
    }
})
