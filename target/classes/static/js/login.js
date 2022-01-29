$login = {
    baseUrl: 'localhost:8081/api',
    login: function () {
        var userid = document.getElementById('userid').value;
        var passwd = document.getElementById('passwd').value;
        if (userid == '') {
            alert("아이디를 입력해주세요");
            return;
        }

        if (passwd == '') {
            alert("비밀번호를 입력해주세요");
            return;
        }

        var url = '/api/members/member';
        var param = {
            userid: userid,
            passwd: passwd
        }
        $ajax.post(url, param, $login.callBack, $login.errCallBack);
    },

    callBack: function (response) {
        var json = JSON.parse(response);
        if (json['rtnCd'] == 0) {
            //todo success
            var rtnObj = json['rtnObj'];
            var idx = rtnObj['idx'];
            var stat = rtnObj['stat'];

            document.getElementById('idx').value = idx;
            document.getElementById('stat').value = stat;
            document.getElementById('login').submit();
        } else {
            alert(json['rtnMsg'])
        }
    },

    errCallBack: function (response) {
        alert("시스템 오류입니다.");
    }

}