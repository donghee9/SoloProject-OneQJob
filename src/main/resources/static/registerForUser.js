document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = {
        name: document.getElementById('userName').value,
        phone: document.getElementById('phone').value,
        address: document.getElementById('address').value,
        userId: document.getElementById('userId').value,
        userPw: document.getElementById('userPw').value
    };

    fetch('/your-server-endpoint', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData)
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            // 성공적으로 데이터를 전송한 후의 처리 코드
        })
        .catch((error) => {
            console.error('Error:', error);
            // 에러 처리 코드
        });
});
