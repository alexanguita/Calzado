<%-- 
    Document   : ingresar_venta
    Created on : 27-07-2021, 22:32:20
    Author     : Alex A_R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Venta | Cliente</title>
    </head>
    <body>
        <form action="proceso" method="POST">
            <table border="1">
                <tbody>
                <th>Datos Venta</th>
                <tr>
                    <td>Descripción</td>
                    <td><input type="text" name="txt_descripcion" value="" required/></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><input type="number" name="txt_precio" value="" required/></td>
                </tr>
                <tr>
                    <td>Cantidad</td>
                    <td><input type="number" name="txt_cantidad" value="" required/></td>
                </tr>
                <tr>
                    <td>Descuento</td>
                    <td><input type="checkbox" name="cb_descuento" value="OFF" /></td>
                </tr>
                <hr>
                <th>Datos cliente</th>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="txt_nombre" value="" required/></td>
                </tr>
                <tr>
                    <td>Telefono</td>
                    <td>+56 <input type="text" name="txt_telefono" value="" required/></td>
                </tr>
                </tbody>
            </table>
            <input type="submit" value="btn_ingresar_venta" />
        </form>
    </body>
</html>
