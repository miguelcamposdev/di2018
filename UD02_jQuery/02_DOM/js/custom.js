$(document).ready(function () {
    $('.btn-fav').click(function (e) { 
        e.preventDefault();

        // Si en el elemento seleccionado, existe la clase css class="btn-subtle"
        // el método toggleClass, elimina dicha clase
        // en caso de que no exista, la añadiría
        $(this).toggleClass('btn-subtle');
        $(this).closest('.card').toggleClass('card-primary card-inverse')
    });
});