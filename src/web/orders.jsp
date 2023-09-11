<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body bgcolor="#a0c0a2">
<body>
<div class="container">
    <h2>Зробіть замовлення</h2>
    <form action="/orders" method="POST">
        <label for="username">Ім'я:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="product">Продукт:</label>
        <select id="product" name="product" required>
            <option value="water">Water</option>
            <option value="wine">Wine</option>
            <option value="beer">Beer</option>
        </select><br><br>

        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required><br><br>


        <button type="submit">Замовити</button>
    </form>
</div>
</body>
</html>
