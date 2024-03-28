<%@ page import="java.util.List" %>
<%@ page import="your.package.name.CartItem" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="your.package.name.CartItem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%
 List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
 if (cart == null || cart.isEmpty()) {
 out.println("<h2>Your cart is empty</h2>");
 } else {
%>
<h2>Shopping Cart</h2>
<table border="1">
 <tr>
 <th>Product Name</th>
 <th>Price</th>
 <th>Quantity</th>
 <th>Total</th>
 </tr>
 <%
 double grandTotal = 0;
 for (CartItem cartItem : cart) {
 out.println("<tr>");
 out.println("<td>" + cartItem.getProduct().getProductName() + "</td>");
 out.println("<td>" + cartItem.getProduct().getPrice() + "</td>");
 out.println("<td>" + cartItem.getQuantity() + "</td>");
 double total = cartItem.getProduct().getPrice() * cartItem.getQuantity();
 grandTotal += total;
 out.println("<td>" + total + "</td>");
 out.println("</tr>");
 }
 %>
</table>
<h3>Grand Total: <%= grandTotal %></h3>
<%
 }
%>
<a href="index.jsp">Continue Shopping</a>
