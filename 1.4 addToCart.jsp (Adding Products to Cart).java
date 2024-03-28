<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="your.package.name.Product" %>
<%@ page import="your.package.name.CartItem" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="your.package.name.Product" %>
<%@ page import="your.package.name.ProductDAO" %>
<%@ page import="your.package.name.CartItem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="your.package.name.CartItem" %>
<%
 int productId = Integer.parseInt(request.getParameter("productId"));
 ProductDAO productDAO = new ProductDAO();
 Product product = productDAO.getProductById(productId);
 List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
 if (cart == null) {
 cart = new ArrayList<>();
 session.setAttribute("cart", cart);
 }
 CartItem cartItem = new CartItem(product, 1); // Quantity is set to 1
 cart.add(cartItem);
 response.sendRedirect("viewCart.jsp");
%>
