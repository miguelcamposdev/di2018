$(document).ready(function(){

    $(document).on("click",".btn-editar-alumno",function(){
        // Partimos de que el elemento que ha hecho que yo llegue a este método
        // es el button con class="btn-editar-alumno"
        // 1. Debemos seleccionar los td del tr sobre el que se ha hecho click
        let tdNombre = $(this).closest("tr").find("td").first();
        let tdApellidos = $(this).closest("tr").find("td:nth-child(2)");
        let tdClase = $(this).closest("tr").find("td:nth-child(3)");
        
        tdNombre.html(`<input id="input-nombre" type="text" value="${tdNombre.text()}" />`);
        tdApellidos.html(`<input id="input-apellidos" type="text" value="${tdApellidos.text()}" />`);
        tdClase.html(`<input id="input-clase" type="text" value="${tdClase.text()}" />`);

        // OCulto el botón Editar y añado el botón guardar
        $(this).css("display","none");
        $(this).parent().append('<button id="btn-guardar-alumno" class="btn btn-primary">Guardar</button>');

    });

    $(document).on("click", "#btn-guardar-alumno", function () {
        let nombre = $("#input-nombre").val();
        let apellidos = $("#input-apellidos").val();
        let clase = $("#input-clase").val();

        $(this).closest("tr").find("td:nth-child(1)").html(nombre);
        $(this).closest("tr").find("td:nth-child(2)").html(apellidos);
        $(this).closest("tr").find("td:nth-child(3)").html(clase);

        // Restauro el botón Editar
        $(this).parent().find('.btn-editar-alumno').css("display","block");

        // Elimino el botón guardar
        $(this).remove();
    });

    $(document).on("click","#btn-add-nuevo-alumno", function () {
        let nombre = $("#nombreNuevoAlumno").val();
        let apellidos = $("#apellidosNuevoAlumno").val();

        let nuevoAlumno = `<tr id="1"><td>${nombre}</td><td>${apellidos}</td><td>2º DAM</td><td><button class="btn btn-primary btn-editar-alumno">Editar</button></td></tr>`;
        $("#tabla-alumnos").append(nuevoAlumno);

        $('#nuevoAlumnoModal').modal('hide');

        $("#nombreNuevoAlumno").val("");
        $("#apellidosNuevoAlumno").val("");
    });


});