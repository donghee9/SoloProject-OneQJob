document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const loginData = {
        userId: document.getElementById('userId').value,
        userPw: document.getElementById('userPw').value
    };
    // Here you would send 'loginData' to your server
    console.log(loginData);
    // For demonstration purposes, we'll just log it to the console
});
