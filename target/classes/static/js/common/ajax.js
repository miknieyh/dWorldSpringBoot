$ajax = {
    ajax: function (url, param, type, callBack, errCallBack) {
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () { // 요청에 대한 콜백함수
            if (xhr.readyState === xhr.DONE) { // 요청이 완료되면 실행
                if (xhr.status === 200 || xhr.status === 201) { // 응답 코드가 200 혹은 201
                    callBack(xhr.responseText);
                } else {
                    errCallBack(xhr.reponseText);
                }
            }
        };
        xhr.open(type, url); // http 메서드와 URL설정
        xhr.setRequestHeader('Content-Type', 'application/json'); // 콘텐츠 타입을 json으로
        xhr.send(JSON.stringify(param)); // 요청 전송
    },

    get: function (url, param, callBack, errCallBack) {
        $ajax.ajax(url, param, 'GET', callBack, errCallBack);
    },

    post: function (url, param, callBack, errCallBack) {
        $ajax.ajax(url, param, 'POST', callBack, errCallBack);
    }


}