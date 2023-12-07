<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
    <meta charset="ISO-8859-1">
    <title>Ver lista de tareas</title>

    <link rel="stylesheet"
        	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
        <script
        	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script
        	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>

    <style>
        a{
            color: white;
        }
        a:hover {
            color: white;
            text-decoration: none;
        }
    </style>

</head>
<body>

    <div class="container">

        <h1 class="p-3"> Lista de tareas </h1>

        <form:form>

            <table class="table table-bordered">
            	<tr>
            		<th>Id</th>
            		<th>Título</th>
            		<th>Fecha</th>
            		<th>Estado</th>
            		<th>Marcar Completado</th>
            		<th>Editar</th>
            		<th>Eliminar</th>
            	</tr>

            	<c:forEach var="tarea" items="${listaTareas}">
                    <tr>
                		<td>${tarea.id}</td>
                		<td>${tarea.titulo}</td>
                		<td>${tarea.fecha}</td>
                		<td>${tarea.estado}</td>
                		<td><button type="button" class="btn btn-success">
                		    <a href="/editarEstadoTarea/${tarea.id}">Marcar Completado</a>
                		</button></td>
                		<td><button type="button" class="btn btn-primary">
                		    <a href="/editarTarea/${tarea.id}">Editar</a>
                		</button></td>
                		<td><button type="button" class="btn btn-danger">
                			<a href="/eliminarTarea/${tarea.id}">Eliminar</a>
                		</button></td>
                	</tr>

            	</c:forEach>

            </table>

        </form:form>

        <button type="button" class="btn btn-primary btn-block">
        	<a href="/agregarTarea">Añadir nueva tarea</a>
        </button>

    </div>

    <script th:inline="javascript">
                window.onload = function() {

                    var msg = "${mensaje}";

                    if (msg == "Guardado correctamente") {
        				Command: toastr["success"]("Tarea agregada!!")
        			} else if (msg == "Eliminado correctamente") {
        				Command: toastr["success"]("Tarea eliminada correctamente!!")
        			} else if (msg == "Error al eliminar") {
        			    Command: toastr["error"]("Ha ocurrido el mismo error, no se puede eliminar la tarea!!")
        			} else if (msg == "Editado correctamente") {
        				Command: toastr["success"]("Tarea modificada correctamente!!")
        			}

        			toastr.options = {
                          "closeButton": true,
                          "debug": false,
                          "newestOnTop": false,
                          "progressBar": true,
                          "positionClass": "toast-top-right",
                          "preventDuplicates": false,
                          "showDuration": "300",
                          "hideDuration": "1000",
                          "timeOut": "5000",
                          "extendedTimeOut": "1000",
                          "showEasing": "swing",
                          "hideEasing": "linear",
                          "showMethod": "fadeIn",
                          "hideMethod": "fadeOut"
                        }
        	    }
            </script>

</body>

</html>