$(document).ready(function () {
    var token = localStorage.getItem('token');
    var username = localStorage.getItem('username');
    var email = localStorage.getItem('email');

    $("#informacion").html(`${token} <br/> ${username} <br/> ${email}`);

    // Peticion para obtener el ranking (con token)
    $.ajax({
        method: "GET",
        url: "http://www.miguelcamposrivera.com:3005/typperapi/user/ranking",
        dataType: "json",
        beforeSend: function(xhr) {
            xhr.setRequestHeader('Authorization', `Bearer ${token}`);
        }
    })
    .done(function( ranking ) {
        console.log(ranking);
    })
    .fail(function( resp ) {
        console.log('ERROR RESPUESTA');
        console.log(resp);
    });


    
});