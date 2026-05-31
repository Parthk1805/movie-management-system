
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!doctype html>
<html lang="en">
  <head> 
<link rel="stylesheet" href="/resources/css/style.css">    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Hello, world!</title>
  </head>
  <body>

  <div class="container">

  <h1>Movie Management System</h1>

  <div class="top-bar">

      <a href="register" class="btn register-btn">
          Add Movie
      </a>

      <form action="search" method="get">

          <input type="text"
                 name="keyword"
                 placeholder="Search Movie"
                 class="search-box">

          <button class="search-btn">
              Search
          </button>

      </form>

  </div>

  <table>

  <tr>

      <th>ID</th>
      <th>Movie Name</th>
      <th>Hero</th>
      <th>Rating</th>
      <th>Update</th>
      <th>Delete</th>

  </tr>

  <c:forEach var="movie" items="${list}">

  <tr>

      <td>${movie.id}</td>
      <td>${movie.movieName}</td>
      <td>${movie.hero}</td>
      <td>${movie.rating}</td>

      <td>

          <a href="edit/${movie.id}"
             class="btn update-btn">

             Update

          </a>

      </td>

      <td>

          <a href="delete/${movie.id}"
             class="btn delete-btn">

             Delete

          </a>

      </td>

  </tr>

  </c:forEach>

  </table>
  <nav>
	<a href="pagination?id=0">1</a>
	<a href="pagination?id=1">2</a>
	<a href="pagination?id=2">3</a>
  </nav>

  </div>

  </body>
</html>