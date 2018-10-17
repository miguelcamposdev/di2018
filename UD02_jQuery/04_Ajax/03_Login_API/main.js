$(document).ready(function () {


    $('#btn-login').click(function (e) { 
        e.preventDefault();
        let em = $('#input-email').val();
        let pwd = $('#input-password').val();

        $.ajax({
            method: "POST",
            url: "http://www.miguelcamposrivera.com:3005/typperapi/auth/login",
            dataType: "json",
            data: {email: em, password: pwd }
        })
        .done(function( resp ) {
            console.log(resp);
        })
        .fail(function( resp ) {
            console.log('ERROR RESPUESTA');
            console.log(resp);
        });

    });
    
    
});