<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

<head>

    <title>Add Student</title>

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
            background:#4CAF50;
            color:white;
            padding:10px;
            border:none;
            width:100%;
        }

    </style>

</head>

<body>

<h2>Add Student</h2>

<form action="/saveStudent" method="post">

    <input type="text"
           name="name"
           placeholder="Enter Name"
           required>

    <input type="email"
           name="email"
           placeholder="Enter Email"
           required>

    <select name="course.id">

        <c:forEach items="${courses}" var="course">

            <option value="${course.id}">
                ${course.courseName}
            </option>

        </c:forEach>

    </select>

    <button type="submit">
        Save Student
    </button>

</form>

</body>

</html>