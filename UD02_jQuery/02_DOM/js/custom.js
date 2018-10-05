$(document).ready(function () {
    $('.btn-fav').click(function (e) { 
        e.preventDefault();

        // Si en el elemento seleccionado, existe la clase css class="btn-subtle"
        // el método toggleClass, elimina dicha clase
        // en caso de que no exista, la añadiría
        $(this).toggleClass('btn-subtle');
        $(this).closest('.card').toggleClass('card-primary card-inverse')
    });

    $('.btn-delete').click(function (e) { 
        $(this).closest('.card').remove();
    });

    $('#btn-add-nota').click(function (e) { 
        e.preventDefault();


        let htmlTarjetaNueva = `<div class="col-lg-4 mb-4">
        <div class="card">
            <div class="card-block">
                    <h3 class="card-title">Nueva nota</h3>
                    <div class="dropdown card-title-btn-container">
                            <button class="btn btn-sm btn-subtle dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"><em class="fa fa-cog"></em></button>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton">
                                <a class="dropdown-item btn-fav" href="#"><em class="fa fa-star mr-1"></em> Marcar Favorito</a>
                                <a class="dropdown-item btn-delete" href="#"><em class="fa fa-trash mr-1"></em> Eliminar</a>
                            </div>
                        </div>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque
                    ut ante in sapien blandit luctus sed ut lacus. Phasellus urna est, faucibus
                    nec ultrices placerat, feugiat et ligula. Donec vestibulum magna a dui
                    pharetra molestie. Fusce et dui urna.</p>
            </div>
        </div>
    </div>`;

        $('#note-cards').append(htmlTarjetaNueva);
    });
});