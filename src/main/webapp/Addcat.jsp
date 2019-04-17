<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Cat</title>
</head>
<body>

    <form method="post" action="/cats/add">
        <label for="name">Name</label>
        <input id="name" type="text" name="name" />
        <label for="age">Age</label>
        <input id="age" name="age" type="number" />
        <label for="picture">Link to Picture</label>
        <input id="picture" name="picture" type="text" />
        <button>Submit</button>
    </form>
</body>
</html>