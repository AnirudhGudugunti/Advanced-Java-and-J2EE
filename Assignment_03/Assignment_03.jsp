<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Area</title>
</head>
<body>
<%! double area(double r){
		return r*r*3.14;
	}
	double area(int a, int b,int c){
		int s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	double area(int a, int b){
		return a*b;
	}
	%>
	<h4>Area of Circle (r=4): <%= area(4) %></h4>
	<h4>Area of Triangle (a=3, b=4, c=5): <%= area(3,4,5) %></h4>
	<h4>Area of Rectangle (a=3, b=4): <%= area(3,4) %></h4>
</body>
</html>