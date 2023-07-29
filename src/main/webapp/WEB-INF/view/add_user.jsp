<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">User Creation</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="home">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="addUser">Add
							User</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container ">
		<div class="row justify-content-center align-items-center min-vh-100">
			<div class="col-sm-8 col-md-6 ">
				<h2 class="text-center mb-4">User Creation Form</h2>
				<c:if test="${not empty msg }">

					<h5 class="text-success">${msg }</h5>
					<c:remove var="msg" />
				</c:if>
				<form action="createUser" method="post">
					<div class="form-group">
						<label for="firstName">First Name:</label> <input type="text"
							class="form-control" id="firstName" name="firstName" required>
					</div>
					<div class="form-group">
						<label for="lastName">Last Name:</label> <input type="text"
							class="form-control" id="lastName" name="lastName" required>
					</div>
					<div class="form-group">
						<label for="photo">Photo Upload:</label> <input type="file"
							class="form-control-file" id="photo" name="photo"
							accept="image/*">
					</div>
					<div class="form-group">
						<label>Gender:</label>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="male" required> <label
								class="form-check-label" for="male">Male</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="female"> <label
								class="form-check-label" for="female">Female</label>
						</div>
					</div>
					<div class="form-group">
						<label for="email">Email:</label> <input type="email"
							class="form-control" id="email" name="email" required>
					</div>
					<div class="form-group">
						<label for="mobile">Mobile No.:</label> <input type="number"
							class="form-control" id="mobile" name="mobile" required>
					</div>
					<div class="form-group">
						<label for="dob">Date of Birth:</label> <input type="date"
							class="form-control" id="dob" name="dob" required>
					</div>
					<div class="form-group">
						<label for="city">City:</label> <select class="form-control"
							id="city" name="city" required>
							<option value="">Select City</option>
							<!-- Add options for cities here -->
							<option value="Nagpur">Nagpur</option>
							<option value="Wardha">Wardha</option>
							<option value="Pune">Pune</option>
						</select>
					</div>
					<div class="form-group">
						<label>Professional Skills:</label>
						<div class="form-check">
							<input class="form-check-input" type="checkbox"
								name="professionalSkills" value="Communication"> <label
								class="form-check-label" for="skill1">Communication</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox"
								name="professionalSkills" value="Critical Thinking"> <label
								class="form-check-label" for="skill2">Critical Thinking</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox"
								name="professionalSkills" value="Problem Solving"> <label
								class="form-check-label" for="skill3">Problem Solving</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox"
								name="professionalSkills" value="Initiative"> <label
								class="form-check-label" for="skill4">Initiative</label>
						</div>
					</div>
					<div class="form-group text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>