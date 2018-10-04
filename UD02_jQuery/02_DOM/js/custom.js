$(document).ready(function () {
    $('.btn-fav').click(function (e) { 
        e.preventDefault();
        $(this).toggleClass('btn-subtle');

        $(this).closest('.card').toggleClass('card-primary card-inverse')
    });
});