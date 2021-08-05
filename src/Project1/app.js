//Tạo data giả lập
var correctUser ='leminhquan_kf20'
var correctPassword ='vtc@123'

var correctUser1 ='phamleduythu_kf20'
var correctPassword1 ='vtc@123'

 //bắt sự kiện khi gữi 1 dữ liệu form lên
//Lấy các giá trị từ các ô username và password
var inputUsername = document.getElementById("username");
var  inputPassword = document.getElementById("password");

//khi onclick bên HTML sẽ khởi động hàm submitLogin
function submitlogin() {
    if(inputUsername.value === '' && inputPassword.value === ''){
        alert('Thông tin đăng nhập không được để trống.!')
    }
    else if (inputUsername.value === correctUser && inputPassword.value === correctPassword) {
        var choice = confirm("Đăng nhập thành công!!");
        if(choice === true){
            alert("Cám ơn bạn đã quan tâm đến Enlish Online");
        }
    } else if (inputUsername.value === correctUser1 && inputPassword.value === correctPassword1) {
        var choice = confirm("Đăng nhập thành công!!");
        if(choice === true){
            alert("Cám ơn bạn đã quan tâm đến Enlish Online");
        }
    } else {
        alert('Tên đăng nhập hoặc mật khẩu sai-kiểm tra lại thông tin đăng nhập')
    }

}