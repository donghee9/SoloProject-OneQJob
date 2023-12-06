document.addEventListener('DOMContentLoaded', function() {
    // 폼이 제출되었을 때 이벤트 리스너를 추가합니다.
    document.getElementById('jobRegistrationForm').addEventListener('submit', function(event) {
        // 기본 폼 제출 동작을 중단합니다.
        event.preventDefault();

        // 폼에서 데이터를 수집합니다.
        const formData = {
            jobDescription: document.getElementById('jobDescription').value,
            requirements: document.getElementById('requirements').value,
            workingDays: document.getElementById('workingDays').value,
            workingPlace: document.getElementById('workingPlace').value,
            hourlyRate: document.getElementById('hourlyRate').value
        };

        // Fetch API를 사용하여 서버에 데이터를 전송합니다.
        fetch('/your-server-endpoint', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        })
            .then(response => response.json())
            .then(data => {
                console.log('Success:', data);
                // 여기에 성공 처리 로직을 작성합니다.
            })
            .catch(error => {
                console.error('Error:', error);
                // 여기에 에러 처리 로직을 작성합니다.
            });
    });
});
