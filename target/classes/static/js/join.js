$(document).ready(function () {

    $("#idbox").keyup(function () {
        var content = $(this).val();
        if ($("#idbox").val() == "") {
            $("#text1").text("아이디를 입력해 주세요");
        } else {
            $("#text1").text("");
        }
    })

    $("#pwbox").keyup(function () {
        var content = $(this).val();
        if ($("#pwbox").val() == "") {
            $("#text2").text("비밀번호를 입력해 주세요");
        } else {
            $("#text2").text("");
        }

    })
    $("#pwbox2").keyup(function () {
        var content = $(this).val();
        if ($("#pwbox").val() == $("#pwbox2").val()) {
            $("#text2").text("사용 가능합니다.");
        } else {
            $("#text2").text("비밀번호 정보가 일치하지 않습니다.");
        }

    })

})

$(document).ready(function () {
    setDateBox();
});

function setDateBox() {
    var dt = new Date();
    var year = "";
    var com_year = dt.getFullYear();

    $("#year")
        .append(
            "<option selected>년도</option>");

    for (var y = (com_year - 50); y <= com_year + 1; y++) {
        $("#year")
            .append(
                "<option value='" + y + "'>"
                + y
                + "년</option>");
    }
    ;

    a = 0;

    $("#month")
        .append(
            "<option selected>월</option>");
    for (var i = 1; i <= 12; i++) {

        $("#month").append(
            "<option value='" + i + "'>"
            + i
            + "월</option>");

    }

    $("#day")
        .append(
            "<option selected>일</option>");
    for (var i = 1; i <= 31; i++) {
        $("#day")
            .append(
                "<option value='" + i + "'>"
                + i
                + "일</option>");
    }

};

function inputPhoneNumber(obj) {
    var number = obj.value.replace(/[^0-9]/g, "");
    var phone = "";

    if (number.length < 4) {
        return number;
    } else if (number.length < 7) {
        phone += number.substr(0, 3);
        phone += "-";
        phone += number.substr(3);
    } else if (number.length < 11) {
        phone += number.substr(0, 3);
        phone += "-";
        phone += number.substr(3, 3);
        phone += "-";
        phone += number.substr(6);
    } else {
        phone += number.substr(0, 3);
        phone += "-";
        phone += number.substr(3, 4);
        phone += "-";
        phone += number.substr(7);
    }
    obj.value = phone;
}
