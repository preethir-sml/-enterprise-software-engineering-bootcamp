# Day 3 - Application Architecture

## 1. Architecture Structure

The order service is organized into different layers:

- controllers
- services
- repositories
- models
- interfaces
- config

This structure separates different responsibilities of the application.

## 2. Order Flow

The application follows this flow:

Customer
↓
OrderController
↓
OrderService
↓
OrderRepository
↓
Database

The OrderController receives the order request and passes it to the OrderService.

The OrderService contains the business logic and creates the Order object.

The OrderRepository is responsible for saving the order.

## 3. Order Model

The Order class represents the order data.

It contains:

- id
- product
- amount

The Order object is created inside OrderService using the product and amount received from the controller.

## 4. Constructor Injection

OrderService receives OrderRepository through its constructor.

Example:

```java
public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
}