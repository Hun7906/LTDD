package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme { BusinessCardApp() }
        }
    }
}

// Box đặt phần giới thiệu ở giữa, thông tin liên hệ ở cuối màn hình.
@Composable
fun BusinessCardApp() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxSize().background(Color(0xFFD2E8D4))
            .safeDrawingPadding()
    ) {
        val screenHeight = maxHeight
        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
                .heightIn(min = screenHeight).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.weight(1f))
            ProfileSection()
            Spacer(Modifier.weight(1f))
            ContactSection()
        }
    }
}

// Image hiển thị logo; Column xếp tên và chức danh theo chiều dọc.
@Composable
fun ProfileSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = stringResource(R.string.logo_description),
            modifier = Modifier.size(112.dp)
        )
        Spacer(Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            color = Color(0xFF102A22),
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = stringResource(R.string.job_title),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D3B),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ContactSection() {
    Column(
        modifier = Modifier.widthIn(max = 320.dp).padding(top = 40.dp, bottom = 20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ContactRow(Icons.Default.Phone, stringResource(R.string.phone))
        ContactRow(Icons.Default.Share, stringResource(R.string.social))
        ContactRow(Icons.Default.Email, stringResource(R.string.email))
    }
}

// Row xếp biểu tượng và nội dung liên hệ theo chiều ngang.
@Composable
fun ContactRow(icon: ImageVector, information: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(icon, contentDescription = null,
            tint = Color(0xFF006D3B), modifier = Modifier.size(24.dp))
        Spacer(Modifier.width(20.dp))
        Text(information, fontSize = 16.sp, color = Color(0xFF102A22))
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun BusinessCardPreview() {
    MaterialTheme { BusinessCardApp() }
}
