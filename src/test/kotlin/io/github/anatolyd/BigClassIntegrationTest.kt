package io.github.anatolyd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

internal class BigClassIntegrationTest {
    @Test
    internal fun `integration test`() {
        assertEquals("big", BigClass().haveFun())
    }
}
