$(document).ready(function () {
    var idseleccionado;

    // CASO 1: 2 colores
    $(document).on('click', '.btn-cambiar-color', function () {
        // cambiar el color de la tarjeta directamente
        $('#exampleModal').modal('show');
        idseleccionado = $(this).closest('.card').attr('id');
    });


    // CASO 2: más de 2 colores.
    $(document).on('click', '#btn-azul,#btn-rojo,#btn-verde,#btn-defecto', function () {
        // cambiar el color de la tarjeta directamente
        $('#exampleModal').modal('hide');
        let idBoton = $(this).attr('id');

        $('#'+idseleccionado).removeClass('card-primary card-success card-danger');

        if (idBoton == 'btn-azul') {
            $('#'+idseleccionado).addClass('card-primary');
        } else if (idBoton == 'btn-rojo') { 
            $('#'+idseleccionado).addClass('card-danger');
        }  else if (idBoton == 'btn-verde') { 
            $('#'+idseleccionado).addClass('card-success');
        }
            
    });
});