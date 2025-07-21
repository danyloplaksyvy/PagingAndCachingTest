package pro.danbya.pagingandcachingtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import pro.danbya.pagingandcachingtest.ui.theme.PagingAndCachingTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PagingAndCachingTestTheme {
                Text("TEST")
            }
        }
    }
}