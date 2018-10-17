$(document).ready(function () {
    
    $.ajax({
        method: "GET",
        url: "http://www.miguelcamposrivera.com:3005/typperapi/user/ranking",
        dataType: "json",
        beforeSend: function(xhr) {
            xhr.setRequestHeader('Authorization', 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoxLCJ1c2VybmFtZSI6Ik1pZ3VlbCBDYW1wb3MiLCJlbWFpbCI6ImNhbXBvc21pZ3VlbEBnbWFpbC5jb20iLCJwYXNzd29yZCI6IjEyMzQiLCJwb2ludHMiOjB9LCJleHAiOjE1NDAzNDc2NDcsImlhdCI6MTUzOTc0Mjg0Nn0.9EVXXwWlxNcY708K59FMy6jgmayj8An0VNk3pq2iu8Q');
        }
    })
    .done(function( resp ) {
        resp.forEach(usuario => {
            $("#tabla-comentarios").append(`<tr><td>${usuario.username}</td><td>${usuario.points}</td></tr>`);
        });
    })
    .fail(function( resp ) {
        console.log('ERROR RESPUESTA');
        console.log(resp);
    });
});