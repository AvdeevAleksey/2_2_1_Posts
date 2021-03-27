import junit.framework.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun main_test() {
        val expected: Post = Post()
        val result: Post = expected
        assertEquals(expected,result)
    }
}