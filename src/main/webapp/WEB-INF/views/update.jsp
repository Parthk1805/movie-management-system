<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/css/style.css"><meta charset="UTF-8">
<title>Update Movie</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">

<h2>Update Movie</h2>

<form action="/updateMovie" method="post">

    <div class="mb-3">

        <label>ID</label>

        <input type="number"
               name="id"
               value="${movie.id}"
               readonly
               class="form-control">

    </div>

    <div class="mb-3">

        <label>Movie Name</label>

        <input type="text"
               name="movieName"
               value="${movie.movieName}"
               class="form-control">

    </div>

    <div class="mb-3">

        <label>Hero</label>

        <input type="text"
               name="hero"
               value="${movie.hero}"
               class="form-control">

    </div>

    <div class="mb-3">

        <label>Rating</label>

        <input type="number"
               step="0.1"
               name="rating"
               value="${movie.rating}"
               class="form-control">

    </div>

    <input type="submit"
           value="Update Movie"
           class="btn btn-warning">

</form>

</div>

</body>
</html>