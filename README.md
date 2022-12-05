# JWT-Api
- Khởi tạo ra 2 bảng ở MySQL là apijwt10 và user100 để có thể lưu dữ liệu
- URL đăng ký: http://localhost:8080/register
- URL xác thực: http://localhost:8080/authenticate
- URL test: http://localhost:8080/hello
- Ở URL test thì khi muốn đăng nhập vào và test JWT sẽ phải nhập ở phần Header ở phần KEY là Authorization, nhập VALUE là VXT + token được in ra khi ở phần URL xác thực, lúc đó dữ liệu sẽ được xác thực và sẽ có thông báo "Logged in successfully"
