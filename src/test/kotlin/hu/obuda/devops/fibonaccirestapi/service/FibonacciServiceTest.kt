package hu.obuda.devops.fibonaccirestapi.service

import hu.obuda.devops.fibonaccirestapi.controller.FibonacciController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    // TODO - Test with greater numbers and test edge cases

    //@Test
    //fun shouldReturnBadRequestWhenGraterThat46(){
        //val result: Int = underTest.fibonacci(48)

        //Assertions.assertThrowsExactly(FibonacciController , ResponseStatusException(HttpStatus.BAD_REQUEST))
    //}

    @Test
    fun shouldReturn2WhenCall3() {
        // given

        // when
        val result: Int = underTest.fibonacci(3)
        // then
        Assertions.assertEquals(2, result)
    }
}