<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Students List</title>

    <style>

        body{
            font-family: Arial;
            background:#f4f4f4;
            padding:30px;
        }

        table{
            width:100%;
            border-collapse:collapse;
            background:white;
        }

        th,td{
            padding:12px;
            border:1px solid #ddd;
            text-align:center;
        }

        th{
            background:#4CAF50;
            color:white;
        }

        a{
            text-decoration:none;
            padding:8px 12px;
            background:#4CAF50;
            color:white;
            border-radius:5px;
        }

        .top-btn{
            margin-bottom:20px;
            display:inline-block;
        }

    </style>

</head>

<body>

<h2>Students List</h2>

<a class="top-btn" href="/addStudent">
    Add Student
</a>

<table>

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Course</th>
        <th>Instructor</th>
        <th>Action</th>
    </tr>

    <c:forEach items="${students}" var="student">

        <tr>

            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.course.courseName}</td>
            <td>${student.course.instructor}</td>

            <td>

                <a href="/edit/${student.id}">
                    Edit
                </a>

            </td>

        </tr>

    </c:forEach>

</table>

</body>
</html>