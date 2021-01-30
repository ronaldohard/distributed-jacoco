package io.github.anatolyd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SmallClassTest {
    @Test
    internal fun `small test`() {
        assertEquals("small", SmallClass().haveFun())
    }
}
