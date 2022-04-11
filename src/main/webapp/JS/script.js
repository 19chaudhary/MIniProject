function operation(){
    var first = document.getElementById("first").value;
    var second = document.getElementById("second").value;
    switch (document.getElementById("operation").value){
        case "SquareRoot":
            fetch('http://localhost:9091/getsqrt', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify({
                    input1:first,

                })
            }).then(response => response.json())
                .then((data) => {

                    document.getElementById("result").value = data;
                });
            break;
        case "Power":
            fetch('http://localhost:9091/getpower', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify({
                    input1:first,
                    input2:second,

                })
            }).then(response => response.json())
                .then((data) => {

                    document.getElementById("result").value = data;
                });
            break;


        case "Factorial":
            fetch('http://localhost:9091/getfact', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify({
                    input1:first,

                })
            }).then(response => response.json())
                .then((data) => {

                    document.getElementById("result").value = data;
                });
            break;
        case "Log":
            fetch('http://localhost:9091/getlog', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify({
                    input1:first,
                })
            }).then(response => response.json())
                .then((data) => {

                    document.getElementById("result").value = data;
                });
            break;
    }
}