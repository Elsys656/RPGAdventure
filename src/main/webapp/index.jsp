<!DOCTYPE html>
<!Definition for shorthand jsp tags>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!Definition of our player class defined in jsp as p we can actually initalize 
this a few different ways and likely this is going to change at some point>
<jsp:useBean id="p" class="com.mycompany.rpgadventure.Player"></jsp:useBean>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!Going to implement some ajax code here to retrieve the server response>
    </head>
    <body>
        <form id="#characterSubmit" action="characterSubmit">
        <label for="classes">Choose Your Class:</label>
        <select id="classes" name="class" onchange="">
            <!forloop pulling classlist from our java and defining the result variable as playerClass>
            <!calls properties can be accessed using either # or $ along with the special tags provided in taglib>
            <c:forEach items="${p.classList()}" var="playerClass">
                <option value="${playerClass}">${playerClass}</option>
            </c:forEach>
        </select>
        </form>
    </body>
</html>
