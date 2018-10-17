$(document).ready(function () {
    
    $.ajax({
        method: "GET",
        url: "comments.json",
        dataType: "json"
    })
    .done(function( resp ) {
        resp.forEach(comentario => {
            $("#tabla-comentarios").append(`<tr><td>${comentario.email}</td><td>${comentario.body}</td></tr>`);
        });
    })
    .fail(function( resp ) {
        console.log('ERROR RESPUESTA');
        console.log(resp);
    });
});