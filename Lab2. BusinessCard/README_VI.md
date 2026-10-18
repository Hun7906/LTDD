# Lab 2 – Business Card app

Project nhập môn Kotlin + Jetpack Compose, mở bằng **Android Studio** (Android Developers là trang tài liệu, không phải phần mềm chạy project).

## 1. Cách chạy
1. Giải nén ZIP. Chọn **Open** trên màn hình đầu Android Studio.
2. Chọn thư mục **BusinessCard**, nơi chứa settings.gradle.kts. Không mở riêng thư mục app.
3. Đợi Gradle Sync hoàn tất. Lần đầu cần Internet để tải Gradle và thư viện.
4. Nếu Android Studio đề nghị cài Android SDK Platform 35, chọn cài đặt. Có thể vào Tools > SDK Manager > SDK Platforms > Android 15 (API 35).
5. Vào Tools > Device Manager > Create Virtual Device, chọn điện thoại và tải một system image API 24 trở lên; bấm Start. Hoặc cắm điện thoại Android đã bật USB debugging.
6. Chọn cấu hình **app**, chọn thiết bị rồi bấm nút tam giác **Run**.

Yêu cầu: Android Studio hỗ trợ AGP 8.7 (Ladybug hoặc mới hơn), SDK 35, Gradle 8.9, JDK 17. Trong Settings > Build, Execution, Deployment > Build Tools > Gradle, chọn Gradle JDK 17 hoặc bản JDK tương thích được Android Studio cung cấp. Nếu gặp lỗi phiên bản Java, chọn JDK 17. Không cần cài Gradle riêng vì đã có wrapper.

## 2. Chỉnh thông tin của bạn
Mở **app/src/main/res/values/strings.xml** để đổi tên, chức danh, số điện thoại, mạng xã hội và email.
Các thông tin liên hệ đang là dữ liệu minh họa, cần thay trước khi nộp.
Mở **app/src/main/java/com/example/businesscard/MainActivity.kt** để chỉnh màu, kích cỡ chữ và khoảng cách.

## 3. Nội dung bài
- Logo robot, họ tên, chức danh.
- Ba hàng liên hệ: điện thoại, mạng xã hội, email.
- Dùng Text, Image, Icon, Row, Column, BoxWithConstraints, Spacer và Modifier.
- Có @Preview để xem giao diện trong Android Studio (chọn Split hoặc Design).
- Giao diện tĩnh, không có đăng nhập, cơ sở dữ liệu hoặc tính năng gọi điện/gửi mail.
- Logo vector đơn giản được tự vẽ cho project; không cần tải ảnh bên ngoài.

## 4. Giải thích cho người mới
- MainActivity: điểm mở đầu ứng dụng.
- setContent: đặt giao diện Compose lên màn hình.
- @Composable: đánh dấu hàm tạo thành phần giao diện.
- Column: xếp các thành phần theo chiều dọc.
- Row: xếp các thành phần theo chiều ngang.
- Modifier: chỉnh kích thước, màu nền và khoảng cách.
- stringResource: lấy nội dung từ strings.xml.
- painterResource: lấy hình từ drawable.
- ContactRow: hàm được dùng lại ba lần, giảm mã lặp.

## 5. Tự kiểm tra trước khi nộp
Chạy app, kiểm tra tên/chức danh và đủ ba hàng liên hệ. Thay thông tin minh họa, chụp màn hình app nếu giáo viên yêu cầu. Thử xoay máy và tăng cỡ chữ để kiểm tra khả năng cuộn.

Chỉ nhận được ảnh tiêu đề Lab 2 nên đây là bài cơ bản dựa trên hướng dẫn Business Card của Android Developers, chưa xác nhận các tiêu chí riêng của giảng viên.
Nguồn: https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card

## 6. Trạng thái kiểm tra
Đã kiểm tra cấu trúc ZIP và XML. Môi trường tạo file không có Android SDK nên chưa biên dịch hoặc chạy trên máy ảo; lần chạy đầu cần kiểm tra trong Android Studio.
