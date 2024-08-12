<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>직원 등록</title>
</head>
<script type="text/javascript">
window.onload = function() {
    var message = "${message}";
    if (message) {
        alert(message);
    }

    // 기본적으로 첫 번째 라디오 버튼에 따라 옵션 설정
    updateJobTitleOptions();
    document.querySelector("form").addEventListener("submit", validateAndSubmit);
}

function updateJobTitleOptions() {
    const jobTitleSelect = document.getElementById("job-title");
    const doctorOptions = ["인턴", "레지던트", "전문의", "교수", "퇴직"];
    const nurseOptions = ["인턴", "정규직", "수간호사", "퇴직"];

    // 직업 선택에 따라 옵션 변경
    if (document.querySelector('input[name="job"]:checked').value === "doctor") {
        updateSelectOptions(jobTitleSelect, doctorOptions);
        document.querySelectorAll('.doctor-field').forEach(e => e.style.display = 'block');
        document.querySelectorAll('.nurse-field').forEach(e => e.style.display = 'none');
    } else if (document.querySelector('input[name="job"]:checked').value === "nurse") {
        updateSelectOptions(jobTitleSelect, nurseOptions);
        document.querySelectorAll('.doctor-field').forEach(e => e.style.display = 'none');
        document.querySelectorAll('.nurse-field').forEach(e => e.style.display = 'block');
    }
}

function updateSelectOptions(selectElement, options) {
    selectElement.innerHTML = "";
    options.forEach(option => {
        const opt = document.createElement("option");
        opt.value = option;
        opt.text = option;
        selectElement.add(opt);
    });
}

function validateAndSubmit(event) {
    event.preventDefault();
    const ssn = document.getElementById("birthdate").value;
    const phone = document.getElementById("phone").value;

    if (!validateSSN(ssn)) {
        alert("주민번호 형식이 잘못되었습니다. 올바른 형식: 123456-1234567");
        return false;
    }

    if (!validatePhone(phone)) {
        alert("전화번호 형식이 잘못되었습니다. 올바른 형식: 010-1234-5678");
        return false;
    }

    // 여기에서 주민번호로 데이터베이스 유효성 검사를 실행합니다.
    checkSSNInDatabase(ssn, function(isValid) {
        if (!isValid) {
            alert("이미 존재하는 주민번호입니다.");
            return false;
        }
        // 유효성 검사가 완료되면 폼을 제출합니다.
        document.querySelector("form").submit();
    });
}

function validateSSN(ssn) {
    const ssnPattern = /^\d{6}-\d{7}$/;
    return ssnPattern.test(ssn);
}

function validatePhone(phone) {
    const phonePattern = /^\d{3}-\d{4}-\d{4}$/;
    return phonePattern.test(phone);
}

function checkSSNInDatabase(ssn, callback) {
    // 여기에 Ajax 요청을 통해 서버와 통신하는 코드를 추가할 수 있습니다.
    // 예시로 setTimeout을 사용하여 비동기 콜백 함수를 처리합니다.
    setTimeout(() => {
        // 가정: DB에 주민번호가 없다고 가정 (즉, 새로운 주민번호)
        const isValid = true;  // 실제 구현 시 서버에서 유효성 검사 결과를 받아옵니다.
        callback(isValid);
    }, 1000);
}
</script>
<body>
    <h2>직원 등록</h2>
    <form action="/employeecreate" method="post">
        <div class="radio-group">
            <label><input type="radio" name="job" value="doctor" onclick="updateJobTitleOptions()" checked> 의사</label>
            <label><input type="radio" name="job" value="nurse" onclick="updateJobTitleOptions()"> 간호사</label>
        </div>
        <div class="form-group">
            <label for="job-title">직급:</label>
            <select id="job-title" name="job-title">
                <!-- Options will be populated by JavaScript -->
            </select>
        </div>
        <div class="form-group">
            <label for="name">이름:</label>
            <input type="text" id="name" name="name">
        </div>
        <div class="form-group">
            <label for="birthdate">주민번호:</label>
            <input type="text" id="birthdate" name="securityNum" placeholder="123456-1234567" maxlength="14">
        </div>
        <div class="form-group">
            <label for="phone">전화번호:</label>
            <input type="text" id="phone" name="phone" placeholder="010-1234-5678" maxlength="13">
        </div>
        <div class="form-group">
            <label for="license">면허번호:</label>
            <input type="text" id="license" name="licenseId">
        </div>
        <div class="form-group">
            <label for="address">주소:</label>
            <input type="text" id="address" name="address">
        </div>
        <div class="form-group">
            <label for="email">E-mail:</label>
            <input type="email" id="email" name="email">
        </div>
        <!-- 의사에만 해당하는 필드 -->
        <div class="form-group doctor-field">
            <label for="department">부서:</label>
            <input type="text" id="department" name="departmentId">
        </div>
        <div class="form-group doctor-field">
            <label for="specialty">전문분야:</label>
            <input type="text" id="specialty" name="specialty">
        </div>
        <!-- 간호사에만 해당하는 필드 -->
        <div class="form-group nurse-field" style="display:none;">
            <label for="role">역할:</label>
            <input type="text" id="role" name="role">
        </div>
        <button type="submit">등록</button>
    </form>
</body>
</html>
