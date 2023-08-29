<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Khaschh hang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.css" />

</head>
<body>
<div class="container">
    <h1>Quan ly khach hang</h1>
    <table id="table1">
        <thead>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Sex</th>
            <th>Occupation</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Ram</td>
            <td>21</td>
            <td>Male</td>
            <td>Doctor</td>
        </tr>
        <tr>
            <td>Mohan</td>
            <td>32</td>
            <td>Male</td>
            <td>Teacher</td>
        </tr>
        <tr>
            <td>Rani</td>
            <td>42</td>
            <td>Female</td>
            <td>Nurse</td>
        </tr>
        <tr>
            <td>Johan</td>
            <td>23</td>
            <td>Female</td>
            <td>Software Engineer</td>
        </tr>
        <tr>
            <td>Shajia</td>
            <td>39</td>
            <td>Female</td>
            <td>Farmer</td>
        </tr>
        <tr>
            <td>Jack</td>
            <td>19</td>
            <td>Male</td>
            <td>Student</td>
        </tr>
        <tr>
            <td>Hina</td>
            <td>30</td>
            <td>Female</td>
            <td>Artist</td>
        </tr>
        <tr>
            <td>Gauhar</td>
            <td>36</td>
            <td>Female</td>
            <td>Artist</td>
        </tr>
        <tr>
            <td>Jacky</td>
            <td>55</td>
            <td>Female</td>
            <td>Bank Manager</td>
        </tr>
        <tr>
            <td>Pintu</td>
            <td>36</td>
            <td>Male</td>
            <td>Clerk</td>
        </tr>
        <tr>
            <td>Sumit</td>
            <td>33</td>
            <td>Male</td>
            <td>Footballer</td>
        </tr>
        <tr>
            <td>Radhu</td>
            <td>40</td>
            <td>Female</td>
            <td>Coder</td>
        </tr>
        <tr>
            <td>Mamta</td>
            <td>49</td>
            <td>Female</td>
            <td>Student</td>
        </tr>
        <tr>
            <td>Priya</td>
            <td>36</td>
            <td>Female</td>
            <td>Worker</td>
        </tr>
        <tr>
            <td>Johnny</td>
            <td>41</td>
            <td>Male</td>
            <td>Forest Officer</td>
        </tr>
        </tbody>
    </table>
</div>


</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function () {
        $('#table1').DataTable();
    });
</script>
</body>
</html>
