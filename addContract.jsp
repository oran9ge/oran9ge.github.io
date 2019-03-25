<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
  <head th:include="layout :: head(title=~{::title},links=~{})">
  
  
  <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	
	
	
    <title>Add Contract</title>
    
	 <style>
		 
		@function remy($value) {
		  @return ($value / 16px) * 1rem;
		}

		body {
		  font: 100% / 1.414 "Open Sans", "Roboto", arial, sans-serif;
		  background: #e9e9e9;
		}
		
		a,
		[type="submit"] {transition: all .25s ease-in;}
		.signup__container {
		  position: absolute;
		  top: 50%;
		  right: 0;
		  left: 0;
		  margin-right: auto;
		  margin-left: auto;
		  transform: translateY(-50%);
		  overflow: hidden;
		  display: flex;
		  align-items: center;
		  justify-content: center;
		  width: remy(800px);
		  height: remy(480px);
		  border-radius: remy(3px);
		  box-shadow: 0px remy(3px) remy(7px) rgba(0,0,0,.25);
		}
		.signup__overlay {
		  position: absolute;
		  top: 0;
		  left: 0;
		  width: 100%;
		  height: 100%;
		  background-color: rgba(0,0,0,.76);
		}
		.container__child {
		  width: 50%;
		  height: 100%;
		  color: #fff;
		}
		.signup__thumbnail {
		  position: relative;
		  padding: 2rem;
		  display: flex;
		  flex-wrap: wrap;
		  align-items: center;
		  background: url(http://ultraimg.com/images/spectre-login.jpg);
		  background-repeat: no-repeat;
		  background-position: top center;
		  background-size: cover;
		}
		.thumbnail__logo,
		.thumbnail__content,
		.thumbnail__links {
		  position: relative;
		  z-index: 2;  
		}
		.thumbnail__logo {align-self: flex-start;}
		.logo__shape {fill: #fff;}
		.logo__text {
		  display: inline-block;
		  font-size: .8rem;
		  font-weight: 700;
		  vertical-align: bottom;
		}
		.thumbnail__content {align-self: center;}
		h1,
		h2 {
		  font-weight: 300;
		  color: rgba(255,255,255,1);
		}
		.heading--primary {font-size: 1.999rem;}
		.heading--secondary {font-size: 1.414rem;}
		.thumbnail__links {
		  align-self: flex-end;
		  width: 100%;
		}
		.thumbnail__links a {
		  font-size: 1rem;
		  color: #fff;
		  &:focus,
		  &:hover {color: rgba(255,255,255,.5);}
		}
		.signup__form {
		  padding: 2.5rem;
		  background: #fafafa;
		}
		label {
		  font-size: .85rem;
		  text-transform: uppercase;
		  color: #ccc;
		}
		.form-control {
		  background-color: transparent;
		  border-top: 0;
		  border-right: 0;
		  border-left: 0;
		  border-radius: 0;
		  &:focus {border-color: #111;}
		}
		[type="text"] {color: #111;}
		[type="password"] {color: #111;}
		.btn--form {
		  padding: .5rem 2.5rem;
		  font-size: .95rem;
		  font-weight: 600;
		  text-transform: uppercase;
		  color: #fff;
		  background: #111;
		  border-radius: remy(35px);
		  &:focus,
		  &:hover {background: lighten(#111, 13%);}
		}
		.signup__link {
		  font-size: .8rem;
		  font-weight: 600;
		  text-decoration: underline;
		  color: #999;
		  &:focus,
		  &:hover {color: darken(#999, 13%);}
		}
		
		#textarea {
		font-size:15px;
		font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif; 
		font-weight: 300;
		padding:10px;
		height: 10em;
		display:block;
		}
    </style>
 
  </head>
  <body >
  <div class="signup__container">
  <div class="container__child signup__thumbnail">
    <div class="thumbnail__logo">
      <svg class="logo__shape" width="25px" viewBox="0 0 634 479" xmlns="http://www.w3.org/2000/svg"><g><path d=" "/></g></svg>
      <h1 class="logo__text">Contract Description</h1>
    </div>
    <div class="thumbnail__content text-center">
      <h1 class="heading--primary"> Enter contract description</h1>
    	
			<textarea class="form-control" id="textarea"  maxlength="200" type="text"  placeholder="Enter contract description" required></textarea>
		<br>
      <h2 class="heading--secondary"></h2>
    </div>
    <div class="thumbnail__links">
      <ul class="list-inline m-b-0 text-center">
        <li><a href="http://alexdevero.com/" target="_blank"><i class="fa fa-globe"></i></a></li>
        <li><a href="https://www.behance.net/alexdevero" target="_blank"><fa class="fa fa-behance"></fa></a></li>
        <li><a href="https://github.com/alexdevero" target="_blank"><i class="fa fa-github"></i></a></li>
        <li><a href="https://twitter.com/alexdevero" target="_blank"><i class="fa fa-twitter"></i></a></li>
      </ul>
    </div>
    <div class="signup__overlay"></div>
  </div>
  <div class="container__child signup__form">
    <form action="#">
      <div class="form-group">
		<input type="hidden" name="contract_id" value="${contract.getContractId()}"><br>
		<input type="hidden" name="supplier_id" value="${contract.getSupplierId()}"><br>
	
        
		
	  </div>
	  
	 
      <div class="m-t-lg">
        <ul class="list-inline">
          <li>
            <input class="btn btn--form" type="submit" value="Submit" />
          </li>
         
        </ul>
      </div>
    </form>  
  </div>
</div>
  </body>
</html>