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
        .done(function( user ) {
            localStorage.setItem('token', user.token);
            localStorage.setItem('username', user.username);
            localStorage.setItem('email', user.email);

            // Redirijo al usuario logueado a la página de Dashboard
            location.replace('dashboard.html');
        })
        .fail(function( resp ) {
            console.log('ERROR RESPUESTA');
            console.log(resp);
        });

    });
    
    
});