document.getElementById('registrationCompanyForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = {
        storeName: document.getElementById('storeName').value,
        phone: document.getElementById('phone').value,
        address: document.getElementById('address').value,
        userId: document.getElementById('userId').value,
        userPw: document.getElementById('userPw').value
    };

    fetch('/OneQJob/registerForCompany', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData)
    })
        .then(response => response.json())
        .then(data => {
            if (data.message === "signUp Success") {
                alert(formData.storeName + '님, OneQJob에 회원가입이 완료되었습니다. 메인화면으로 넘어갑니다.');

            } else {
                alert('회원가입 실패: ' + data.message);
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('서버 오류가 발생했습니다.');
        });
});
