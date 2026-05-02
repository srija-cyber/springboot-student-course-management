<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

<head>

    <title>Edit Student</title>

    <style>

        body{
            font-family:Arial;
            background:#f4f4f4;
            padding:30px;
        }

        form{
            width:400px;
            background:white;
            padding:20px;
            border-radius:10px;
        }

        input,select{
            width:100%;
            padding:10px;
            margin-top:10px;
            margin-bottom:15px;
        }

        button{
            background:#2196F3;
            color:white;
            padding:10px;
            border:none;
            width:100%;
        }

    </style>

</head>

<body>

<h2>Edit Student</h2>

<form action="/updateStudent" method="post">

    <input type="hidden"
           name="id"
           value="${student.id}">

    <input type="text"
           name="name"
           value="${student.name}">

    <input type="email"
           name="email"
           value="${student.email}">

    <select name="course.id">

        <c:forEach items="${courses}" var="course">

            <option value="${course.id}">

                ${course.courseName}

            </option>

        </c:forEach>

    </select>

    <button type="submit">
        Update Student
    </button>

</form>

</body>

</html>