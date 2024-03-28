index.jsp (Displaying Products)
<%@ page import="java.util.List" %>
<%@ page import="your.package.name.Product" %>
<%@ page import="your.package.name.ProductDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <title>Shopping Cart</title>
</head>
<body>
<h2>Product List</h2>
<%
 ProductDAO productDAO = new ProductDAO();
 List<Product> products = productDAO.getAllProducts();
%>
<table border="1">
 <tr>
 <th>Product ID</th>
 <th>Product Name</th>
 <th>Price</th>
 <th>Action</th>
 </tr>
 <% for (Product product : products) { %>
 <tr>
 <td><%= product.getProductId() %></td>
 <td><%= product.getProductName() %></td>
 <td><%= product.getPrice() %></td>
 <td><a href="addToCart.jsp?productId=<%= product.getProductId() %>">Add to
Cart</a></td>
 </tr>
 <% } %>
</table>
</body>
</html>
